package com.jdbc.controller.item;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.java.bean.item.ItemDAO;
import com.java.bean.item.ItemDTO;

@WebServlet("/Detailitem.do")
public class DetailItemController extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html; charset=UTF-8");
		HttpSession session = req.getSession();
		PrintWriter out = resp.getWriter();
		
		ItemDAO dao = new ItemDAO();
		ItemDTO dto = new ItemDTO();
		
		// 조회할 상품의 seq값 가져오기
		int itemSeq = Integer.parseInt(req.getParameter("itemSeq")); 
	
		// DB 조회
		dto = dao.searchItemSeq(itemSeq);
		
		if(dto != null) {
			String point = dto.getItemPrice().replaceAll(",", "");
			
			int point2 = Integer.parseInt(point);
			point2 = (int) (point2 * 0.1);
			
			// 세션에 값 저장  
			session.setAttribute("item", dto);
			session.setAttribute("point", point2);
			
			// pay.jsp로 이동
			String path = req.getContextPath() + "/html/pay.jsp";
			resp.sendRedirect(path);
		} else {
			System.out.println("pw fail");
			out.print("<script>");
			out.print("alert('페이지에 오류가 발생했습니다. 잠시 후 다시 시도해주세요.');");
			out.print("window.history.back();");
			out.print("</script>");
		}
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
