<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
    String filePath = request.getServletPath(); 
    String fileNameWithExtension = filePath.substring(filePath.lastIndexOf('/') + 1); // "filename.jsp"
    String fileName = fileNameWithExtension.substring(0, fileNameWithExtension.lastIndexOf('.')); // "filename"
%>

    <jsp:include page="footer.jsp"/>
    
</div>
<!-- wrap end -->

<script src="../js/jquery-1.12.0.min.js"></script>
<script src="../js/common.js"></script>
<script src="${pageContext.request.contextPath}/js/<%=fileName%>.js"></script>

</body>
</html>