package kr.co.sist.emp;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.coyote.UpgradeToken;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class EmployeeService {
	private static EmployeeService es;

	private EmployeeService() {
	}// EmployeeService

	public static EmployeeService getInstance() {
		if (es == null) {
			es = new EmployeeService();
		} // end if
		return es;
	}// getInstance

	public List<DeptDTO> searchAllDept() {
		List<DeptDTO> list = null;

		EmployeeDAO empDAO = EmployeeDAO.getInstance();
		try {
			list = empDAO.selectAllDept();
		} catch (SQLException e) {
			e.printStackTrace();
		}// end catch

		return list;
	}// searchAllDept
	
	public String searchEmp(int deptno) {
		JSONObject jsonObj = new JSONObject();
		List<EmpDTO> list = null;
		EmployeeDAO empDAO = EmployeeDAO.getInstance();
		try {
			list = empDAO.selectEmp(deptno);
			// 데이터를 JSONObject 추가
			JSONArray jsonArr = new JSONArray();
			JSONObject jsonTemp = null;
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			for(EmpDTO eDTO : list) {
				jsonTemp = new JSONObject();// 조회된 레코드 하나를 저장하기 위한 JSONObject
				jsonTemp.put("empno", eDTO.getEmpno());
				jsonTemp.put("ename", eDTO.getEname());
				jsonTemp.put("job", eDTO.getJob());
				jsonTemp.put("sal", eDTO.getSal());
				// 날짜를 JSONObject으로 직접 넣으면 Error 발생 > 문자열로 만들어서 넣음.
				jsonTemp.put("hiredate", sdf.format(eDTO.getHiredate()));
				jsonTemp.put("hiredateStr", eDTO.getHiredateStr());
				
				// JSONObject을 JSONArray 추가
				jsonArr.add(jsonTemp);
			}// end for
			
			// 조회된 레코드를 모두 가지고 있는 JSONArray를 JSONObject에 추가
			jsonObj.put("empData", jsonArr);
		} catch (SQLException e) {
			e.printStackTrace();
		}// end catch
		
		if(list == null) {
			list = new ArrayList<EmpDTO>();
		}// end if
		
		// 부가적인 정보를 JSONObject 추가
		jsonObj.put("pubDate", new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
		jsonObj.put("datalength", list.size());
		jsonObj.put("resultFlag", !list.isEmpty());
		
		
		
		return jsonObj.toJSONString();
	}// searchAllDept

}// class
