package kr.co.sist.user.member;

import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;

import day1128.ParamDTO;
import kr.co.sist.chipher.DataDecryption;
import kr.co.sist.chipher.DataEncryption;

public class WebMemberLoginService {
	private static WebMemberLoginService wmls;

	private WebMemberLoginService() {

	}// WebMemberLoginService

	public static WebMemberLoginService getInstance() {
		if (wmls == null) {
			wmls = new WebMemberLoginService();
		} // end if
		return wmls;
	}// getInstance

	public ParamDTO searchLogin(LoginDTO lDTO, String key) {
		ParamDTO pDTO = null;

		// 비밀번호는 일방향 해시
		if (lDTO.getpassword() != null && !"".equals(lDTO.getpassword())) {
			try {
				lDTO.setpassword(DataEncryption.messageDigest("SHA-1", lDTO.getpassword()));
			} catch (NoSuchAlgorithmException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}// end catch
		} // end if
		
		WebMemberLoginDAO wmlDAO = WebMemberLoginDAO.getInstance("jdbc/dbcp");
		try {
			pDTO = wmlDAO.selectLogin(lDTO);
			// pDTO에는 아이디, 이름(암호화 => 복호화), 생년월일이 할당
			DataDecryption dd = new DataDecryption(key);//대칭키 : 암호화 키와 복호화 키가 같아야한다
			try {
				pDTO.setName(dd.decrypt(pDTO.getName()));
			} catch (Exception e) {
				e.printStackTrace();
			}// end catch
		} catch (SQLException e) {
			e.printStackTrace();
		}// end catch

		return pDTO;
	}// searchLogin
}// class
