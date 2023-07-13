package com.shop.dao;

import java.util.List;

import com.shop.db.DBHelper;
import com.shop.vo.ProductVO;

public class ProductDAO extends DBHelper {

	// 싱글톤
	private static ProductDAO instance = new ProductDAO();
	public static ProductDAO getInstance() {
		return instance;
	}
	private ProductDAO() {}
	
	// CRUD 메서드
	public int insertProduct(ProductVO vo) {
		
		return 0;
	}
	
	public ProductVO selectProduct(String prodNo) {
		
		return null;
	}
	
	public List<ProductVO> selectProducts() {
		
		return null;
	}
	
	public int updateProduct(ProductVO vo) {
		
		return 0;
	}
	
	public int deleteProduct(String prodNo) {
		
		return 0;
	}
}
