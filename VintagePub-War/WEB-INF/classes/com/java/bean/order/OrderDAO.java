package com.java.bean.order;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.java.bean.JDBCutil;
import com.java.bean.cart.CartDTO;

public class OrderDAO {
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs = null;
	
	private final static String ORDER_ADD = "insert into `order`(userSeq, itemSeq, totalPrice, addr, orderStatus) values(?, ?, ?, ?, ?)";
	private final static String ORDER_LIST = "select * from `order`";
	
	public int addOrderProcess(OrderListDTO dto) {
		try {
			conn = JDBCutil.getConnection();
			for (int i=0; i<dto.getCartInfo().size(); i++) {
				pstmt = conn.prepareStatement(ORDER_ADD);

				CartDTO cd = dto.getCartInfo().get(i);
				
				pstmt.setInt(1, cd.getUserSeq());
				pstmt.setInt(2, cd.getItemSeq());
				pstmt.setString(3, cd.getItemPrice());
				pstmt.setString(4, dto.getAddr());
				pstmt.setInt(5, dto.getOrderSts());
				
				pstmt.executeUpdate();
			}
			return 1; // Success
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCutil.close(pstmt, conn);
		}
		return 2; // Fail
	}
	
	public ArrayList<OrderDTO> selectOrderListProcess(){
		ArrayList<OrderDTO> olist = new ArrayList<OrderDTO>();
		try {
			conn = JDBCutil.getConnection();
			pstmt = conn.prepareStatement(ORDER_LIST);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				OrderDTO dto = new OrderDTO();
				dto.setOrderSeq(rs.getInt("orderSeq"));
				dto.setUserSeq(rs.getInt("userSeq"));
				dto.setItemSeq(rs.getInt("itemSeq"));
				dto.setItemPrice(rs.getString("totalPrice"));
				dto.setOrderAddr(rs.getString("addr"));
				dto.setOrderSts(rs.getInt("orderStatus"));
				olist.add(dto);
			}
			return olist;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCutil.close(rs, pstmt, conn);
		}
		return olist;
	}
}
