<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*, com.java.bean.user.*"%>
<%
	ArrayList<UserDTO> mList = (ArrayList<UserDTO>)session.getAttribute("vList");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>모든 회원보기</h2>
	<table border="1">
		<tr>
			<td>이름</td>
			<td>아이디</td>
			<td>비밀번호</td>
			<td>전화번호</td>
			<td>이메일</td>
			<td>주소정보</td>
			<td>우편번호</td>
		</tr>	
		<%
			for(int i=0; i<mList.size(); i++){
				UserDTO dto = (UserDTO)mList.get(i);
		%>
		<tr>
			<td><%=dto.getUserName()%></td>
			<td><%=dto.getUserId()%></td>
			<td><%=dto.getUserPw()%></td>
			<td><%=dto.getUserTel()%></td>
			<td><%=dto.getUserEmail()%></td>
			<td><%=dto.getAddr() + dto.getDetailAddr() %></td>
			<td><%=dto.getPostNum() %></td>
		</tr>
		<%
			}
		%>
	</table>
	<br>
	<a href="/VintageBlue/html/adminIndex.jsp"> 관리자 홈으로 </a>
</body>
</html>