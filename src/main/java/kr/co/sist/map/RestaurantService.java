package kr.co.sist.map;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONObject;

public class RestaurantService {
	private static RestaurantService rs;
	private RestaurantService() {
		
	}// RestaurantService
	
	public static RestaurantService getInstance() {
		if(rs == null) {
			rs = new RestaurantService();
		}// end if
		return rs;
	}// RestaurantService

	public List<RestaurantDTO> searchAllRestaurant(String id){
		List<RestaurantDTO> list = new ArrayList<RestaurantDTO>();
		
		RestaurantDAO rDAO = RestaurantDAO.getInstance();
		
		try {
			list = rDAO.selectAllRestaurant(id);
		} catch (SQLException e) {
			e.printStackTrace();
		}// end catch
		
		return list;
	}// searchAllRestaurant
	
	public String addRestaurant(RestaurantDTO rDTO) {
		JSONObject jsonObj = new JSONObject();
		jsonObj.put("resultFlag", false);
		
		RestaurantDAO rDAO = RestaurantDAO.getInstance();
		
		try {
			rDAO.insertRestaurant(rDTO);
			jsonObj.put("resultFlag", true);
		} catch (SQLException e) {
			e.printStackTrace();
		}// end catch
		
		System.out.println(jsonObj.toJSONString());
		return jsonObj.toJSONString();
	}// addRestaurant
	
}// class
