package com.shop.vo;

public class OrderVO {

	private int orderNo;
	private String oderId;
	private int oderProduct;
	private int oderCount;
	private String oderDate;
	
	public int getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(int orderNo) {
		this.orderNo = orderNo;
	}
	
	public String getOderId() {
		return oderId;
	}
	public void setOderId(String oderId) {
		this.oderId = oderId;
	}
	
	public int getOderProduct() {
		return oderProduct;
	}
	public void setOderProduct(int oderProduct) {
		this.oderProduct = oderProduct;
	}
	
	public int getOderCount() {
		return oderCount;
	}
	public void setOderCount(int oderCount) {
		this.oderCount = oderCount;
	}
	
	public String getOderDate() {
		return oderDate;
	}
	public void setOderDate(String oderDate) {
		this.oderDate = oderDate;
	}
}
