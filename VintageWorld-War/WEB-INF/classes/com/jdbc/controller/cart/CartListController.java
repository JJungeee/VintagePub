package com.jdbc.controller.cart;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.java.bean.cart.CartDAO;
import com.java.bean.cart.CartDTO;

@WebServlet("/cartList.do")
public class CartListController extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html; charset=UTF-8");
		PrintWriter out = resp.getWriter();
		HttpSession session = req.getSession();
		
		int userSeq = Integer.parseInt(req.getParameter("userSeq"));
		System.out.println(userSeq);
		
		CartDAO dao = new CartDAO();
		ArrayList<CartDTO> list = dao.getCartList(userSeq);
		System.out.println(list);
		
		// 상품 리스트를 세션에 저장 
		session.setAttribute("list", list);
		if(list != null) {
			System.out.println("Success");
			resp.sendRedirect(req.getContextPath() + "/html/cart.jsp");
		} 
		else if(list == null){
			System.out.println("Fail");
			out.print("<script>");
			out.print("alert('장바구니가 비었습니다!');");
			out.print("window.history.back();");
			out.print("</script>");
		}
	}
}
