package com.jdbc.controller.item;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.java.bean.item.ItemDAO;

@WebServlet("/deleteItem.do")
public class DeleteItemController extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html; charset=UTF-8");
		
		int itemSeq = Integer.parseInt(req.getParameter("itemSeq"));
		
		ItemDAO dao = new ItemDAO();
		
		int result = dao.deleteItem(itemSeq);
		
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
