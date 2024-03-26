<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>


<link rel="stylesheet" href="../css/form.css">

<jsp:include page="../inc/top.jsp"/>
   
   <!-- form start -->
   <form class="form_sineup"action="${pageContext.request.contextPath}/signup.do" method="post">
      <table class="form_table">
         <tbody>
            <tr>
               <td>
                  <label for="userName" class="sr-only">이름</label>
                  <input type="text" id="userName" name="userName" placeholder="이름">
                  <c:set var="userName" value="${param.userName}" />
               </td>
            </tr>
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
<!--             <tr> -->
<!--                <td> -->
<!--                   <label for="confirmPw" class="sr-only">비밀번호 확인</label> -->
<!--                   <input type="password" id="confirmPw" name="confirmPw" placeholder="비밀번호 확인"> -->
<%--                   <c:set var="confirmPw" value="${param.confirmPw}" /> --%>
<!--                </td> -->
<!--             </tr> -->
            <tr>
               <td>
                  <label for="userEmail" class="sr-only">이메일</label>
                  <input type="email" id="userEmail" name="userEmail" placeholder="이메일">
                  <c:set var="userEmail" value="${param.userEmail}" />
               </td>
            </tr>
            <tr>
               <td>
                  <label for="userTel" class="sr-only">연락처</label>
                  <input type="tel" id="userTel" name="userTel" placeholder="연락처">
                  <c:set var="userTel" value="${param.userTel}" />
               </td>
            </tr>
            <tr>
               <td>
                  <label for="addr" class="sr-only">주소</label>
                  <input type="text" id="addr" name="addr" placeholder="주소">
                  <c:set var="addr" value="${param.addr}" />
               </td>
            </tr>
            <tr>
               <td>
                  <label for="detailAddr" class="sr-only">상세주소</label>
                  <input type="text" id="detailAddr" name="detailAddr" placeholder="상세주소">
                  <c:set var="detailAddr" value="${param.detailAddr}" />
               </td>
            </tr>
            <tr>
               <td>
                  <label for="psotNum" class="sr-only">우편번호</label>
                  <input type="text" id="psotNum" name="psotNum" placeholder="우편번호">
                  <c:set var="psotNum" value="${param.psotNum}" />
               </td>
            </tr>
         </tbody>
      </table>
     <input type="submit" value="가입하기" class="form_btn">
   </form>
   <!-- //form end -->

<jsp:include page="../inc/bottom.jsp"/>


