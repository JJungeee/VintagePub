<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%
	String userId = (String)session.getAttribute("userId");
	String userSeq = (String)session.getAttribute("userSeq");
%>
<header>
    <a href="${pageContext.request.contextPath}/index.jsp" class="bi">Vintage Blue</a>
    <ul class="header_user">
        <%
        	if(userId != null){
        %>
        <li><a href="${pageContext.request.contextPath}/logout.do"><i class="fa-solid fa-arrow-right-from-bracket"></i></a></li>
        <li><a href="${pageContext.request.contextPath}/cartList.do?userSeq=${userSeq}"><i class="fa-solid fa-cart-shopping"></i></a></li>
        <%
        	} else {
        %>
        <li><a href="${pageContext.request.contextPath}/html/login.jsp"><i class="fa-regular fa-user"></i></a></li>
        <%
        	}
        %>
    </ul>
</header>

<nav>
    <ul>
        <%-- <li><a href="${pageContext.request.contextPath}/html/menu.jsp">all items</a></li><br> --%>
        <li><a href="${pageContext.request.contextPath}/itemList.do?option=2">all items</a></li><br>
        <li class="offline_gallery"><a href="${pageContext.request.contextPath}/html/event.jsp">offline gallery</a></li>
        <li><a href="${pageContext.request.contextPath}/html/faq.jsp">faq</a></li>
        <li class="insta_link"><a href="#none"><i class="fa-brands fa-instagram"></i> VintageBlue</a></li>
    </ul>
</nav>