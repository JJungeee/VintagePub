package com.jdbc.controller.user;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.java.bean.user.UserDAO;
import com.java.bean.user.UserDTO;

@WebServlet("/selectmember.do")
public class SelectMemberListController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		HttpSession session = request.getSession();

		UserDAO dao = new UserDAO();
		try {
			ArrayList<UserDTO> mList = dao.selectAllUserListProcess();			
			session.setAttribute("vList", mList);
		} catch (Exception e) {
			e.printStackTrace();
		}
		RequestDispatcher dispatcher = request.getRequestDispatcher("html/memberList.jsp");
		dispatcher.forward(request, response);
	}
}
