package com.jdbc.controller.item;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.java.bean.item.ItemDAO;
import com.java.bean.item.ItemDTO;

@WebServlet("/newItem.do")
public class ItemAddController extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html; charset=UTF-8");
		PrintWriter out = resp.getWriter();
		
		String itemName = req.getParameter("itemName");
		String itemImg = req.getParameter("itemImg");
		String itemInfo = req.getParameter("itemInfo");
		String itemPrice = req.getParameter("itemPrice");
		int itemRole = Integer.parseInt(req.getParameter("itemRole"));
		
 		ItemDTO dto = new ItemDTO();
 		ItemDAO dao = new ItemDAO();
 		
 		dto.setItem(itemName, itemImg, itemInfo, itemRole, itemPrice);
 		
 		int result = dao.newItem(dto);
 		
 		if(result == 1) {
 		// 아이템 등록 성공 후 이동할 페이지
 			
 		}
 		else {
 		// 이이템 등록에 실패했을 때 이동할 페이
 			
 		}
	}
}
