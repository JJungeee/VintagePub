package com.jdbc.controller.item;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.java.bean.item.ItemDAO;
import com.java.bean.item.ItemDTO;

@WebServlet("/itemList.do")
public class ItemListController extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html; charset=UTF-8");
		HttpSession session = req.getSession();
		
		ItemDAO dao = new ItemDAO();
		ArrayList<ItemDTO> list = dao.getItemList();
		
		// 상품 리스트를 세션에 저장 
		session.setAttribute("list", list);
		
		String path = req.getContextPath() + "/html/menu.jsp";
		
		if(req.getParameter("option").equals("1")) {
			 // 관리자 페이지로 이동
			RequestDispatcher dis = req.getRequestDispatcher("/html/itemList.jsp");
			dis.forward(req, resp);
		} 
		else if(req.getParameter("option").equals("2")) {
			// 회원에게 보여지는 상품페이지로 이동  
			resp.sendRedirect(path);
		}
	}
}
