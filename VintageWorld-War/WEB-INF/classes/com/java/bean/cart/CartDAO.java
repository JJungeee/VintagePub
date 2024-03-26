package com.java.bean.cart;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.java.bean.JDBCutil;

public class CartDAO {
	
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs = null;
	
	private final static String CART_INSERT = "insert into cart(userSeq, itemSeq) values(?, ?)";
	private final static String ITEM_LIST = "select u.userSeq, i.itemName, i.itemSeq, i.itemPrice\r\n"
			+ "from cart c, item i, user u\r\n"
			+ "where c.userSeq = u.userSeq and i.itemSeq = c.itemSeq and u.userSeq = ?;";
	private final static String DELETE_ITEM = "delete from cart where cartSeq=?";
	
	
	// 장바구니에 상품 추가 
	public int newCart(CartDTO dto) {
		try {
			conn = JDBCutil.getConnection();
			pstmt = conn.prepareStatement(CART_INSERT);
			
			pstmt.setInt(1, dto.getUserSeq());
			pstmt.setInt(2, dto.getItemSeq());
			
			pstmt.executeUpdate();
			
			return 1; // 상품 등록 완료 
			
		} catch (Exception e) {
			System.out.println("ItemAddController : " + e);
		} finally {
			JDBCutil.close(pstmt, conn);
		}
		return 2; // DB삽입 오류 
	}
	
	// 상품 삭제 
	public int deleteItem(int cartSeq) {
		System.out.println("delete cart : " + cartSeq);
		try {
			conn = JDBCutil.getConnection();
			pstmt = conn.prepareStatement(DELETE_ITEM);
				
			pstmt.setInt(1,  cartSeq);
				
			pstmt.executeUpdate();
				
			return 1;  // 변경 완료  
				
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCutil.close(pstmt, conn);
		}
		return 2; // DB삽입 오류 
	}
	
	//상품 리스트 요청
	public ArrayList<CartDTO> getCartList(int userSeq){
		ArrayList<CartDTO> list = new ArrayList<>();
		
		try {
			conn = JDBCutil.getConnection();
			pstmt = conn.prepareStatement(ITEM_LIST);
			
			pstmt.setInt(1,  userSeq);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				CartDTO dto = new CartDTO();
				
				dto.setUserSeq(rs.getInt("userSeq"));
				dto.setItemName(rs.getString("itemName"));
				dto.setItemSeq(rs.getInt("ItemSeq"));
				dto.setItemPrice(rs.getString("itemPrice"));

				list.add(dto);
				
				System.out.println(dto.toString());
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCutil.close(rs, pstmt, conn);
		}
		
		return list;
	}
}
