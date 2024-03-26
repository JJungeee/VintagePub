package com.jdbc.controller.user;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.java.bean.user.UserDAO;
import com.java.bean.user.UserDTO;

@WebServlet("/idcheck.do")
public class UserIdCheckController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String checkId = request.getParameter("checkId");
		
		UserDTO dto = new UserDTO();
		UserDAO dao = new UserDAO();
		
		dto.setUserId(checkId);
		int checkIdResult = dao.checkIdProcess(dto);
		
		if (checkIdResult == 1) {
			// 사용가능한 아이디
		} else if(checkIdResult == 2) {
			// 중복된 아이디
		} else if(checkIdResult == 3) {
			// Error
		}
	}
}
