package com.java.bean.order;

import java.util.ArrayList;

import com.java.bean.cart.CartDTO;

public class OrderListDTO {
	
	private ArrayList<CartDTO> cartInfo;
	private String addr;
	private int orderSts;
	
	public ArrayList<CartDTO> getCartInfo() {
		return cartInfo;
	}
	public void setCartInfo(ArrayList<CartDTO> cartInfo) {
		this.cartInfo = cartInfo;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public int getOrderSts() {
		return orderSts;
	}
	public void setOrderSts(int orderSts) {
		this.orderSts = orderSts;
	}
}
