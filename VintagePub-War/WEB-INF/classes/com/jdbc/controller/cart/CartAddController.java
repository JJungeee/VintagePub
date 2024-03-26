package com.jdbc.controller.cart;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.java.bean.cart.CartDAO;
import com.java.bean.cart.CartDTO;

@WebServlet("/newCart.do")
public class CartAddController extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html; charset=UTF-8");
		PrintWriter out = resp.getWriter();
		
		int userSeq = Integer.parseInt(req.getParameter("userSeq"));
		int iteSeq = Integer.parseInt(req.getParameter("itemSeq"));
		
 		CartDTO dto = new CartDTO();
 		CartDAO dao = new CartDAO();
 		
 		dto.setUserSeq(userSeq);
 		dto.setItemSeq(iteSeq);
 		
 		int result = dao.newCart(dto);
 		String path = req.getContextPath() + "/index.jsp";
 		
 		if(result == 1) {
 		// 아이템 등록 성공 후 이동할 페이지
 			out.print("<script>");
			out.print("alert('장바구니에 상품이 추가되었습니다.');");
			out.print("history.back();");
			out.print("</script>");
 		}
 		else {
 		// 이이템 등록에 실패했을 때 이동할 페이지 
 			out.print("<script>");
			out.print("잠시 후 다시 시도해주세요.');");
			out.print("history.back();");
			out.print("</script>");
 		}
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}
}
