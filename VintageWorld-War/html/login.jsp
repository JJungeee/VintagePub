<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>


<link rel="stylesheet" href="../css/form.css">

<jsp:include page="../inc/top.jsp"/>
   
   <!-- form start -->
   <form class="form_login" action="${pageContext.request.contextPath}/login.do" method="post">
      <table class="form_table">
         <tbody>
            <tr>
               <td>
                  <label for="userId" class="sr-only">아이디</label>
                  <input type="text" id="userId" name="userId" placeholder="아이디">
                  <c:set var="userId" value="${param.userId}" />
               </td>
            </tr>
            <tr>
               <td>
                  <label for="userPw" class="sr-only">비밀번호</label>
                  <input type="password" id="userPw" name="userPw" placeholder="비밀번호">
                  <c:set var="userPw" value="${param.userPw}" />
               </td>
            </tr>
         </tbody>
      </table>
      <input type="submit" value="로그인" class="form_btn">
      <a href="${pageContext.request.contextPath}/html/signup.jsp" class="link_sineup">회원가입</a>
   </form>
   <!-- //form end -->

<jsp:include page="../inc/bottom.jsp"/>


