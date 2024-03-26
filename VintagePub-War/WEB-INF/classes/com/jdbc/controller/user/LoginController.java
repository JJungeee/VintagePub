package com.jdbc.controller.user;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.java.bean.user.UserDAO;
import com.java.bean.user.UserDTO;

@WebServlet("/login.do")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		HttpSession session = request.getSession();
		PrintWriter out = response.getWriter();
		
		String userId = request.getParameter("userId");
		String userPw = request.getParameter("userPw");
		
		UserDTO userDto = new UserDTO();
		UserDAO userDao = new UserDAO();
		
		userDto.setUserId(userId);
		userDto.setUserPw(userPw);
		
		int loginResult = userDao.loginProcess(userDto);
		
		String path = request.getContextPath() + "/index.jsp";
		
		if(loginResult == 1) {
			// Login Success
			UserDTO userInfo = userDao.saveInfo(userDto);
			
			session.setAttribute("userSeq", Integer.toString(userInfo.getUserSeq()));
			session.setAttribute("userId", userInfo.getUserId());
			session.setAttribute("addr", userInfo.getAddr() + userInfo.getDetailAddr());	

			System.out.println("sucess");
			System.out.println(session.getAttribute("userSeq"));
			
			response.sendRedirect(path);
		} else if (loginResult == 2) {
			// Pw Error
			System.out.println("pw fail");
			out.print("<script>");
			out.print("alert('로그인 실패 아이디와 패스워드를 확인해 주세요.');");
			out.print("window.history.back();");
			out.print("</script>");
		} else if (loginResult == 3) {
			// Id not found
			System.out.println("id not found");
			out.print("<script>");
			out.print("alert('로그인 실패 아이디와 패스워드를 확인해 주세요.');");
			out.print("window.history.back();");
			out.print("</script>");
		} else if (loginResult == 0) {
			System.out.println("admin login");
			out.print("alert('로그인 성공!');");
			session.setAttribute("userId", userId);
			response.sendRedirect(request.getContextPath() + "/html/adminIndex.jsp");
		}
	}
}