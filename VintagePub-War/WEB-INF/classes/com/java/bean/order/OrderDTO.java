package com.java.bean.order;

public class OrderDTO {
	
	private int orderSeq;
	private int itemSeq;
	private int userSeq;
	private String itemPrice;
	private String orderAddr;
	private int orderSts;
	
	public int getOrderSeq() {
		return orderSeq;
	}
	public void setOrderSeq(int orderSeq) {
		this.orderSeq = orderSeq;
	}
	public int getItemSeq() {
		return itemSeq;
	}
	public void setItemSeq(int itemSeq) {
		this.itemSeq = itemSeq;
	}
	public int getUserSeq() {
		return userSeq;
	}
	public void setUserSeq(int userSeq) {
		this.userSeq = userSeq;
	}
	public String getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(String itemPrice) {
		this.itemPrice = itemPrice;
	}
	public String getOrderAddr() {
		return orderAddr;
	}
	public void setOrderAddr(String orderAddr) {
		this.orderAddr = orderAddr;
	}
	public int getOrderSts() {
		return orderSts;
	}
	public void setOrderSts(int orderSts) {
		this.orderSts = orderSts;
	}
}