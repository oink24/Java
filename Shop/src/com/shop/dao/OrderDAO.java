package com.shop.dao;

import java.util.ArrayList;
import java.util.List;

import com.shop.db.DBHelper;
import com.shop.db.SQL;
import com.shop.vo.OrderVO;

public class OrderDAO extends DBHelper {

	// 싱글톤
	private static OrderDAO instance = new OrderDAO();
	public static OrderDAO getInstance() {
		return instance;
	}
	private OrderDAO() {}
	
	// CRUD 메서드
	public int insertOrder(OrderVO vo) {
		
		int result = 0;
		
		try
		{
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.INSERT_ORDER);
			psmt.setString(1, vo.getOderId());
			psmt.setInt(2, vo.getOderProduct());
			psmt.setInt(3, vo.getOderCount());
			
			result = psmt.executeUpdate();
			
			close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return result;
	}
	
	public OrderVO selectOrder(int orderNo) {
		
		return null;
	}
	
	public List<OrderVO> selectOrders(String orderId) {
		
		OrderVO vo = new OrderVO();
		List<OrderVO> orders = new ArrayList<>();
		
		try
		{
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.SELECT_ORDERS);
			psmt.setString(1, orderId);
			
			rs = psmt.executeQuery();
			
			while(rs.next())
			{
				vo.setOrderNo(rs.getInt(1));
				vo.setOderId(rs.getString(2));
				vo.setOderProduct(rs.getInt(3));
				vo.setOderCount(rs.getInt(4));
				vo.setOderDate(rs.getString(5).substring(0, 16));
				vo.setName(rs.getString(6));
				vo.setProdName(rs.getString(7));
				
				orders.add(vo);
			}
			
			close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return orders;
	}
	
	public int updateOrder(OrderVO vo) {
		
		return 0;
	}
	
	public int deleteOrder(String orderId) {
		
		return 0;
	}
}
