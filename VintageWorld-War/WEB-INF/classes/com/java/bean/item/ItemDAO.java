package com.java.bean.item;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.NumberFormat;
import java.util.ArrayList;

import com.java.bean.JDBCutil;

public class ItemDAO {
	
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs = null;
	
	private final static String ITEM_INSERT = "insert into item(itemName, itemImg, itemInfo, itemPrice, itemRole) values(?, ?, ?, ?, ?)";
	private final static String ITEM_LIST = "select * from item";
	private final static String UPDATE_ITEM= "update item set itemName=?, itemImg=?, itemPrice=?, itemInfo=? where itemSeq=?";
	private final static String UPDATE_ROLE = "update item set itemRole=? where itemSeq=?";
	private final static String DELETE_ITEM = "delete from item where itemSeq=?";
	private final static String SEARCH_ITEM = "select * from item where itemName=?";
	private final static String SEARCH_ITEM_SEQ = "select * from item where itemSeq=?";
	
	// 새로운 상품 등록
	public int newItem(ItemDTO dto) {
		try {
			conn = JDBCutil.getConnection();
			pstmt = conn.prepareStatement(ITEM_INSERT);
			
			pstmt.setString(1, dto.getItemName());
			pstmt.setString(2, dto.getItemImg());
			pstmt.setString(3, dto.getItemInfo());
			pstmt.setString(4, dto.getItemPrice());
			pstmt.setInt(5, dto.getItemRole());
			
			pstmt.executeUpdate();
			
			return 1; // 상품 등록 완료 
			
		} catch (Exception e) {
			System.out.println("ItemAddController : " + e);
		} finally {
			JDBCutil.close(pstmt, conn);
		}
		return 2; // DB삽입 오류 
	}
	
	// 상품 정보 수정
	public int updateItem(ItemDTO dto) {
		
		try {
			conn = JDBCutil.getConnection();
			pstmt = conn.prepareStatement(UPDATE_ITEM);
			
			pstmt.setString(1, dto.getItemName());
			pstmt.setString(2, dto.getItemImg());
			pstmt.setString(3, dto.getItemPrice());
			pstmt.setString(4, dto.getItemInfo());
			pstmt.setInt(5, dto.getItemSeq());
			
			pstmt.executeUpdate();
			
			return 1;  // 변경 완료 
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
		}
		
		return 2; // DB삽입 오류 
	}
	
	// 상품 role 변경 
	public int updateRole(ItemDTO dto) {
		try {
			conn = JDBCutil.getConnection();
			pstmt = conn.prepareStatement(UPDATE_ROLE);
			
			pstmt.setInt(1, dto.getItemRole());
			pstmt.setInt(2,  dto.getItemSeq());
			
			pstmt.executeUpdate();
			
			return 1;  // 변경 완료  
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCutil.close(pstmt, conn);
		}
		return 2; // DB삽입 오류 
	}
	
	// 상품 삭제 
	public int deleteItem(int itemSeq) {
		try {
			conn = JDBCutil.getConnection();
			pstmt = conn.prepareStatement(DELETE_ITEM);
				
			pstmt.setInt(1,  itemSeq);
				
			pstmt.executeUpdate();
				
			return 1;  // 변경 완료  
				
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCutil.close(pstmt, conn);
		}
		return 2; // DB삽입 오류 
	}
	
	// 상품 검색 
	public ItemDTO searchItem(String name) {
		try {
			conn = JDBCutil.getConnection();
			pstmt = conn.prepareStatement(SEARCH_ITEM);
			
			pstmt.setString(1,  name);
				
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				ItemDTO dto = new ItemDTO();
				
				dto.setItemSeq(rs.getInt(1));
				dto.setItemName(rs.getString(2));
				dto.setItemImg(rs.getString(3));
				dto.setItemPrice(rs.getString(4));
				dto.setItemInfo(rs.getString(5));
				dto.setItemRole(rs.getInt(6));
				
				return dto;  // 완료  
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCutil.close(pstmt, conn);
		}
		return null; // DB삽입 오류 
	}
	
	public ItemDTO searchItemSeq(int itemSeq) {
		try {
			conn = JDBCutil.getConnection();
			pstmt = conn.prepareStatement(SEARCH_ITEM_SEQ);
			
			pstmt.setInt(1,  itemSeq);
				
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				NumberFormat numberFormat = NumberFormat.getInstance();
				ItemDTO dto = new ItemDTO();
				
				dto.setItemSeq(rs.getInt(1));
				dto.setItemName(rs.getString(2));
				dto.setItemImg(rs.getString(3));
				dto.setItemPrice(rs.getString(4));
				dto.setItemInfo(rs.getString(5));
				dto.setItemRole(rs.getInt(6));
				
				System.out.println(dto.toString());
				
				return dto;  // 완료  
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCutil.close(pstmt, conn);
		}
		return null; // DB삽입 오류 
	}
	
	//상품 리스트 요청
	public ArrayList<ItemDTO> getItemList(){
		ArrayList<ItemDTO> list = new ArrayList<>();
		
		try {
			conn = JDBCutil.getConnection();
			pstmt = conn.prepareStatement(ITEM_LIST);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				ItemDTO dto = new ItemDTO();
				
				dto.setItemSeq(rs.getInt(1));
				dto.setItemName(rs.getString(2));
				dto.setItemImg(rs.getString(3));
				dto.setItemPrice(rs.getString(4));
				dto.setItemInfo(rs.getString(5));
				dto.setItemRole(rs.getInt(6));
				
				list.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCutil.close(rs, pstmt, conn);
		}
		return list;
	}
}
