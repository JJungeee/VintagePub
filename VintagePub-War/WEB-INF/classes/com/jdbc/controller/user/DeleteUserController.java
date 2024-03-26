package com.jdbc.controller.user;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.java.bean.user.UserDAO;
import com.java.bean.user.UserDTO;

@WebServlet("/deleteuser.do")
public class DeleteUserController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String deleteId = request.getParameter("userId");
		
		UserDTO dto = new UserDTO();
		UserDAO dao = new UserDAO();
		
		dto.setUserId(deleteId);
		dao.deleteUserProcess(dto);
		
		response.sendRedirect(request.getContextPath() + "/index.jsp");
	}
}