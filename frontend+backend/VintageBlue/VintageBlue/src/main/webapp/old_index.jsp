<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>로직 테스트</h1>
	
	sign up
	<form action="signup.do" method="post">
		<input type="text" name="userId">
		<input type="text" name="userPw">
		<input type="text" name="userName">
		<input type="text" name="userEmail">
		<input type="text" name="userTel">
		<input type="submit" value="join">
	</form>
	
	-- item -- <br>
	
	insert item
	<form action="newItem.do" method="post">
		<input type="text" name="itemName" placeholder="itemName">
		<input type="text" name="itemImg" placeholder="itemImg">
		<input type="text" name="itemInfo" placeholder="itemInfo">
		<input type="text" name="itemPrice">
		<input type="text" name="itemRole" placeholder="itemRole">
		<input type="submit" value="register item">
	</form>
	
	<a href="http://localhost:8080/VintageBlue/itemList.do?option=1">itemList</a> <br>
		
	update item
	<form action="updateItem.do" method="post">
		<input type="text" name="itemSeq" placeholder="itemSeq">
		<input type="text" name="itemName" placeholder="itemName">
		<input type="text" name="itemImg" placeholder="itemImg">
		<input type="text" name="itemInfo" placeholder="itemInfo">
		<input type="text" name="itemPrice" placeholder="itemPrice">
		<input type="submit" value="update item">
	</form>
	
	update role
	<form action="updateItem.do" method="get">
		<input type="text" name="itemSeq" placeholder="itemSeq">
		<input type="text" name="option" placeholder="option">
		<input type="submit" value="update role">
	</form>

	del item
	<form action="deleteItem.do" method="get">
		<input type="text" name="itemSeq" placeholder="itemSeq">
		<input type="submit" value="del item">
	</form>
	
	-- cart --  <br>
	<a href="http://localhost:8080/VintageBlue/newCart.do?userSeq=1&itemSeq=1">cartAdd</a> <br>
	<a href="http://localhost:8080/VintageBlue/cartList.do?userSeq=1">cartList</a> <br>
	<a href="http://localhost:8080/VintageBlue/deleteCart.do?cartSeq=1">deleteCart</a> <br>
</body>
</html>