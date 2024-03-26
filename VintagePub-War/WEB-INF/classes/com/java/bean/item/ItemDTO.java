package com.java.bean.item;

public class ItemDTO {
	
	private int itemSeq;
	private String itemName;
	private String itemImg;
	private String itemInfo;
	private String itemPrice;
	private int itemRole;
	
	
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
	public String getItemInfo() {
		return itemInfo;
	}
	public void setItemInfo(String itemInfo) {
		this.itemInfo = itemInfo;
	}
	public int getItemRole() {
		return itemRole;
	}
	public void setItemRole(int itemRole) {
		this.itemRole = itemRole;
	}
	public String getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(String itemPrice) {
		this.itemPrice = itemPrice;
	}
	
	public void setItem(String name, String img, String info, int role, String price) {
		this.itemName = name;
		this.itemImg = img;
		this.itemInfo = info;
		this.itemRole = role;
		this.itemPrice = price;
	}
	@Override
	public String toString() {
		return "ItemDTO [itemSeq=" + itemSeq + ", itemName=" + itemName + ", itemImg=" + itemImg + ", itemInfo="
				+ itemInfo + ", itemPrice=" + itemPrice + ", itemRole=" + itemRole + "]";
	}
	
	
}