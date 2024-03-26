<%@page import="com.java.bean.order.OrderListDTO"%>
<%@page import="com.java.bean.cart.CartDTO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%
	ArrayList<CartDTO> aList = (ArrayList<CartDTO>)session.getAttribute("list");
%>
<jsp:include page="../inc/top.jsp"/>

    <!-- cart start -->
    <section class="cart">
        <div class="inner">
            <h2>장바구니</h2>
            <table id="myTable">
                <thead>
                  <tr>
                    <th>상품정보</th>
                    <th>주문금액</th>
                    <th>배송정보</th>
                  </tr>
                </thead>
                <tbody>
                <%
				for(int i=0; i<aList.size(); i++){
				    CartDTO dto = (CartDTO)aList.get(i);
				    String checkboxId = "custom-chk" + (i+1);
				%>
				<tr>
				    <td>
				        <input type="checkbox" id="<%= checkboxId %>" class="custom-chk">
				        <label for="<%= checkboxId %>"></label>
				        <%= dto.getItemName() %>
				    </td>
				    <td><%= dto.getItemPrice() %></td>
				    <td class="fee">
				        <span>무료</span>
				        택배
				    </td>
				</tr>
				<%
				}
				%>
                </tbody>
            </table>
            <button onclick="deleteSelected()">선택상품 삭제</button>
            <a href="${pageContext.request.contextPath}/orderadd.do" class="btn_order" onclick="alert('주문이 완료되었습니다.')">주문하기</a>
        </div>
    </section>
    <!-- //cart end -->

<jsp:include page="../inc/bottom.jsp"/>