package com.jdbc.controller.order;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.java.bean.order.OrderDAO;
import com.java.bean.order.OrderDTO;

@WebServlet("/orderList.do")
public class SelectOrderListController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		HttpSession session = request.getSession();
		
		OrderDAO dao = new OrderDAO();
		try {
			ArrayList<OrderDTO> olist = dao.selectOrderListProcess();
			session.setAttribute("oList", olist);
		} catch (Exception e) {
			e.printStackTrace();
		}
		RequestDispatcher dispatcher = request.getRequestDispatcher("html/orderList.jsp");
		dispatcher.forward(request, response);
	}
}
