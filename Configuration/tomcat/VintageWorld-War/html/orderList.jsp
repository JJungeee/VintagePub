<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*, com.java.bean.order.*"%>
<%
	ArrayList<OrderDTO> mList = (ArrayList<OrderDTO>)session.getAttribute("oList");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>주문 내역</h2>
	<table border="1">
		<tr>
			<td>주문번호</td>
			<td>유저번호</td>
			<td>아이템번호</td>
			<td>가격</td>
			<td>주소지</td>
			<td>주문상태</td>
		</tr>	
		<%
			for(int i=0; i<mList.size(); i++){
				OrderDTO dto = (OrderDTO)mList.get(i);
		%>
		<tr>
			<td><%=dto.getOrderSeq()%></td>
			<td><%=dto.getUserSeq()%></td>
			<td><%=dto.getItemSeq()%></td>
			<td><%=dto.getItemPrice()%></td>
			<td><%=dto.getOrderAddr()%></td>
			<td><%=dto.getOrderSts() %></td>
		</tr>
		<%
			}
		%>
	</table>
	<br>
	<a href="/VintageBlue/html/adminIndex.jsp"> 관리자 홈으로 </a>
</body>
</html>