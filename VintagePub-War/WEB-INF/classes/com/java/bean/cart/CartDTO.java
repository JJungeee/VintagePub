package com.java.bean.cart;

public class CartDTO {
	
	private int cartSeq;
	private int userSeq;
	private int itemSeq;
	private String itemName;
	private String itemImg;
	private String itemPrice;
	
	public int getCartSeq() {
		return cartSeq;
	}
	public void setCartSeq(int cartSeq) {
		this.cartSeq = cartSeq;
	}
	public int getUserSeq() {
		return userSeq;
	}
	public void setUserSeq(int userSeq) {
		this.userSeq = userSeq;
	}
	public int getItemSeq() {
		return itemSeq;
	}
	public void setItemSeq(int itemSeq) {
		this.itemSeq = itemSeq;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getItemImg() {
		return itemImg;
	}
	public void setItemImg(String itemImg) {
		this.itemImg = itemImg;
	}
	public String getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(String itemPrice) {
		this.itemPrice = itemPrice;
	}
	
	@Override
	public String toString() {
		return "CartDTO [cartSeq=" + cartSeq + ", userSeq=" + userSeq + ", itemSeq=" + itemSeq + ", itemName="
				+ itemName + ", itemImg=" + itemImg + ", itemPrice=" + itemPrice + "]";
	}
	
	
}