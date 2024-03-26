<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<% 
    String filePath = request.getServletPath(); 
    String fileNameWithExtension = filePath.substring(filePath.lastIndexOf('/') + 1); // "filename.jsp"
    String fileName = fileNameWithExtension.substring(0, fileNameWithExtension.lastIndexOf('.')); // "filename"
%>

<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=1260">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta property="og:image" href="../img/common/berry.png">
    <link rel="shortcut icon" href="../img/common/favicon.ico">
    <title>Vintage Blue</title>
    <link rel="stylesheet" href="../css/style.css">
    <script src="https://kit.fontawesome.com/b632cb621d.js" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/<%=fileName%>.css">
    
</head>
<body>

<!-- wrap start -->
<div id="wrap">
    
    <jsp:include page="header.jsp"/>

        
    