<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*, com.java.bean.item.*"%>
<%
	ArrayList<ItemDTO> mList = (ArrayList<ItemDTO>)session.getAttribute("list");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>모든 상품</h2>
	<table border="1">
		<tr>
			<td>이름</td>
			<td>가격</td>
			<td>이미지</td>
			<td>정보</td>
			<td>role</td>
		</tr>	
		<%
			for(int i=0; i<mList.size(); i++){
				ItemDTO dto = (ItemDTO)mList.get(i);
		%>
		<tr>
			<td><%=dto.getItemName() %></td>
			<td><%=dto.getItemPrice()%></td>
			<td><%=dto.getItemImg()%></td>
			<td><%=dto.getItemInfo()%></td>
			<td><%=dto.getItemRole()%></td>
		</tr>
		<%
			}
		%>
	</table>
	<br>
	<a href="/VintageBlue/html/adminIndex.jsp"> 관리자 홈으로 </a>
</body>
</html>