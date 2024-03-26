package com.jdbc.controller.order;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.java.bean.cart.CartDTO;
import com.java.bean.order.OrderDAO;
import com.java.bean.order.OrderListDTO;

@WebServlet("/orderadd.do")
public class OrderAddController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		HttpSession session = request.getSession();
		PrintWriter out = response.getWriter();
		
		String addr = (String)session.getAttribute("addr");
		ArrayList<CartDTO> aList = (ArrayList<CartDTO>)session.getAttribute("list");

		/*
		 * for(int i=0; i<aList.size(); i++) { CartDTO cd = aList.get(i);
		 * System.out.println(cd.getUserSeq() + " / "+ cd.getItemSeq() + " / " +
		 * cd.getItemPrice()); }
		 */
		
		OrderListDTO dto = new OrderListDTO();
		OrderDAO dao = new OrderDAO();
		
		dto.setCartInfo(aList);
		dto.setAddr(addr);
		dto.setOrderSts(1);
		
		int result = dao.addOrderProcess(dto);
		String path = request.getContextPath() + "/index.jsp";
		
		if(result == 1) {
			out.print("<script>");
			out.print("alert('주문이 완료되었습니다! 메인페이지로 이동합니다!');");
			out.print("location.href='" + path + "';");
			out.print("</script>");
			response.sendRedirect(request.getContextPath() + "/index.jsp");
		} else if (result == 2) {
			out.print("<script>");
			out.print("alert('주문 실패');");
			out.print("</script>");
			response.sendRedirect(request.getContextPath() + "/html/cart.jsp");
		}
	}

}
