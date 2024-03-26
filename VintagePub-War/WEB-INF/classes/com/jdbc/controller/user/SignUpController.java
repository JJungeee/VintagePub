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

@WebServlet("/signup.do")
public class SignUpController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		HttpSession session = request.getSession();
		PrintWriter out = response.getWriter();
		
		String userName = request.getParameter("userName");
		String userId = request.getParameter("userId");
		String userPw = request.getParameter("userPw");
		String userEmail = request.getParameter("userEmail");
		String userTel = request.getParameter("userTel");
		String addr = request.getParameter("addr");
		String detailAddr = request.getParameter("detailAddr");
		String postNum = request.getParameter("postNum");
		
		UserDTO dto = new UserDTO();
		UserDAO dao = new UserDAO();
		
		String path = request.getContextPath() + "/index.jsp";
		
		dto.setUserInfo(userName, userId, userPw, userEmail, userTel, addr, detailAddr, postNum);
		int signUpResult = dao.signUpProcess(dto);
		
		System.out.println("signUp controller : " + signUpResult);
		
		if(signUpResult == 1) {
			// 회원가입 성공
			out.print("<script>");
			out.print("alert('회원가입 성공! 메인으로 돌아갑니다.');");
			out.print("location.href='" + path + "';");
			out.print("</script>");
			//response.sendRedirect("/VintageBlue/index.jsp");
		} else if(signUpResult == 2) {
			// 회원가입 실패
			out.print("<script>");
			out.print("alert('회원가입 실패! 메인으로 돌아갑니다.');");
			out.print("location.href='" + path + "';");
			out.print("</script>");
		}
	}
}