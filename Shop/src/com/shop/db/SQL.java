package com.shop.db;

public class SQL {

	// customer
	public static final String SELECT_CUSTOMER = "SELECT * FROM `customer` WHERE `custId`=?";
	public static final String INSERT_CUSTOMER = "INSERT INTO `customer` VALUES (?,?,?,?,NOW())";
	
	// order
	public static final String INSERT_ORDER = "INSERT INTO `order` SET "
											+ "`orderId`=?,"
											+ "`orderProduct`=?,"
											+ "`orderCount`=?,"
											+ "`orderDate`=NOW()";
	
	public static final String SELECT_ORDERS = "SELECT "
											+ "a.*,"
											+ "b.name,"
											+ "c.prodName "
											+ "FROM `order` AS a "
											+ "JOIN `customer` AS b ON a.orderId = b.custId "
											+ "JOIN `product` AS c ON a.orderProduct = c.prodNo "
											+ "WHERE `orderId` = ?";
	
	
	// product
	public static final String SELECT_PRODUCT  = "SELECT * FROM `product` WHERE `prodNo`=?";
	public static final String SELECT_PRODUCTS = "SELECT * FROM `product` WHERE `stock` > 0";
	public static final String UPDATE_PRODUCT_STOCK
									= "UPDATE `product` SET `stock`=`stock`-? WHERE `prodNo`=?";
}
