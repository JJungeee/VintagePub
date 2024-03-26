package com.jdbc.controller.cart;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.java.bean.cart.CartDAO;
import com.java.bean.cart.CartDTO;

@WebServlet("/deleteCart.do")
public class DeleteCartController extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html; charset=UTF-8");
		
		int cartSeq = Integer.parseInt(req.getParameter("cartSeq"));
		
		CartDTO dto = new CartDTO();
 		CartDAO dao = new CartDAO();
 		
 		dto.setUserSeq(cartSeq);
		
		int result = dao.deleteItem(cartSeq);
		
		if(result == 1) {
	 		// 변경 성공 후 이동할 페이지
	 			
	 	}
	 	else {
	 		// 변경에 실패했을 때 이동할 페이지 
	 			
	 	}
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	}
}
