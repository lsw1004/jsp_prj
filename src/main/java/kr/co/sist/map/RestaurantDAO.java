package kr.co.sist.map;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import kr.co.sist.board.BoardDTO;
import kr.co.sist.dao.DbConn;

public class RestaurantDAO {
	private static RestaurantDAO rDAO;

	private RestaurantDAO() {

	}// RestaurantDAO

	public static RestaurantDAO getInstance() {
		if (rDAO == null) {
			rDAO = new RestaurantDAO();
		} // end if
		return rDAO;
	}// getInstance

	public List<RestaurantDTO> selectAllRestaurant(String id) throws SQLException {
		List<RestaurantDTO> list = new ArrayList<RestaurantDTO>();
		
		DbConn dbCon = DbConn.getInstance("jdbc/dbcp");

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			// 1.JNDI 사용객체 생성
			// 2.DataSource 얻기
			// 3.Connection 얻기
			con = dbCon.getConn();

			// 4.쿼리문 생성 객체 얻기
			StringBuilder selectAllRestaurant = new StringBuilder();
			selectAllRestaurant
			.append("SELECT REST_NUM, REST_NAME, MENU, INFO, LAT, LNG, INPUT_DATE  ")
			.append("FROM RESTAURANT  ")
			.append("WHERE ID = ? ");
			pstmt = con.prepareStatement(selectAllRestaurant.toString());

			// 5.바인드 반수에 값 설정
			pstmt.setString(1, id);

			// 6.조회 결과 얻기
			RestaurantDTO rDTO = null;
			rs = pstmt.executeQuery();
			while (rs.next()) {
				rDTO = new RestaurantDTO();
				rDTO.setRest_num(rs.getInt("REST_NUM"));
				rDTO.setRest_name(rs.getString("REST_NAME"));
				rDTO.setMenu(rs.getString("MENU"));
				rDTO.setInfo(rs.getString("INFO"));
				rDTO.setLat(rs.getDouble("LAT"));
				rDTO.setLng(rs.getDouble("LNG"));
				rDTO.setInput_date(rs.getDate("INPUT_DATE"));
				
				
				list.add(rDTO);
			} // end while
		} finally {
			// 7.연결 끊기
			dbCon.dbClose(rs, pstmt, con);
		} // finally
		
		return list;
	}// selectAllRestaurant

	public void insertRestaurant(RestaurantDTO rDTO) throws SQLException {

	}// insertRestaurant
}// class
