package com.shop.vo;

public class OrderVO {

	private int orderNo;
	private String orderId;
	private int orderProduct;
	private int orderCount;
	private String orderDate;
	
	// 주문현황 출력을 위한 추가필드
	private String name;
	private String prodName;
	
	public int getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(int orderNo) {
		this.orderNo = orderNo;
	}
	
	public String getOderId() {
		return orderId;
	}
	public void setOderId(String oderId) {
		this.orderId = oderId;
	}
	
	public int getOderProduct() {
		return orderProduct;
	}
	public void setOderProduct(int oderProduct) {
		this.orderProduct = oderProduct;
	}
	
	public int getOderCount() {
		return orderCount;
	}
	public void setOderCount(int oderCount) {
		this.orderCount = oderCount;
	}
	
	public String getOderDate() {
		return orderDate;
	}
	public void setOderDate(String oderDate) {
		this.orderDate = oderDate;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	
	@Override
	public String toString() {
		return orderNo+"번주문 - "+name+"님, 제품명 : "+prodName+", 수량 : "+orderCount+"개, 주문날짜 : "+orderDate;
	}
}
