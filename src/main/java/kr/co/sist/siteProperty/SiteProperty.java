package kr.co.sist.siteProperty;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import kr.co.sist.dao.DbConn;

public class SiteProperty {

	public static SitePropertyVO spVO;

	// static 영역은 클래스가 사용되면 한번 자동 호출되는 영역.
	static {
		DbConn db = DbConn.getInstance("jdbc/dbcp");
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			con = db.getConn();
			String select = "select PROTOCOL, SERVER_NAME, CONTEXT_ROOT, MANAGE_PATH, KEY, TITLE from SITE_PROPERTY where num=1";
			pstmt = con.prepareStatement(select);
			rs = pstmt.executeQuery();
			// SiteProperty에 static 으로 설정 정보를 저장할 변수를 만들고
			// 조회된 결과를 할당하여 사용할 수 도 있다.
			if (rs.next()) {
				spVO = new SitePropertyVO(
						rs.getString("PROTOCOL"), 
						rs.getString("SERVER_NAME"),
						rs.getString("CONTEXT_ROOT"), 
						rs.getString("MANAGE_PATH"), 
						rs.getString("KEY"),
						rs.getString("TITLE"));
			} // end if

		} catch (SQLException se) {
			se.printStackTrace();
		} // end catch

	}

}// class
