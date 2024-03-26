package com.jdbc.controller.item;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.java.bean.item.ItemDAO;
import com.java.bean.item.ItemDTO;

@WebServlet("/itemUpdate.do")
public class UpdateItemRoleController extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html; charset=UTF-8");
		
		ItemDTO dto = new ItemDTO();
		ItemDAO dao = new ItemDAO();
		int itemSeq = Integer.parseInt(req.getParameter("itemSeq"));
		
		if(req.getParameter("option").equals("0")) {
			dto.setItemSeq(itemSeq);
			dto.setItemRole(0);
		} 
		else if(req.getParameter("option").equals("1")) {
			dto.setItemSeq(itemSeq);
			dto.setItemRole(1);
		}
		else if(req.getParameter("option").equals("2")) {
			dto.setItemSeq(itemSeq);
			dto.setItemRole(2);
		}
		else if(req.getParameter("option").equals("3")) {
			dto.setItemSeq(itemSeq);
			dto.setItemRole(3);
		}
		
		int result = dao.updateRole(dto);
		
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
