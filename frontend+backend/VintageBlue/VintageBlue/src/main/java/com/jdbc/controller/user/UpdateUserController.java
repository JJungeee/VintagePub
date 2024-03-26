package com.jdbc.controller.user;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.java.bean.user.UserDAO;
import com.java.bean.user.UserDTO;

@WebServlet("/updateuser.do")
public class UpdateUserController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		
		UserDTO dto = new UserDTO();
		UserDAO dao = new UserDAO();
		
		String updateEmail = request.getParameter("updateEmail");
		String updateTel = request.getParameter("updateTel");
		
		dto.setUserId((String) session.getAttribute("userId"));
		dto.setUserEmail(updateEmail);
		dto.setUserTel(updateTel);
		
		dao.updateUserProcess(dto);
		
		// 성공시 이동 페이지
	}
}
