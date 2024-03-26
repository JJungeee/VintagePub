<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<jsp:include page="../inc/top.jsp"/>

    <!-- shop start -->
    <section class="shop rel over_h">
        <div class="shop_bg bg-full bg-cover"></div>
        <div class="svg_figure bg-full">
            <svg xmlns="http://www.w3.org/2000/svg" width="100%" height="100%">
                <mask id="svg_mask">
                    <rect x="0" y="0" width="100%" height="100%" fill="#fff"></rect>
                    <image id="shop_record" x="50%" y="50%" width="500" height="500" href="../img/main/record.png"></image>
                </mask>
                <rect x="0" y="0" width="100%" height="100%" fill="#000" mask="url(#svg_mask)"></rect>
            </svg>
        </div>
        <div class="visual_line">
            <div class="visual_line_fill"></div>
        </div>
    </section>
    <!-- //shop end -->
    
    <!-- menu start -->
    <section class="menu">
        <ul class="menu_lists inner_1260">
        	<c:forEach var="i" items="${list}">
        		<li>
            		<div class="menu_list_wrapper">
                    <a href="${pageContext.request.contextPath}/Detailitem.do?itemSeq=${i.itemSeq}">
                        <div class="menu_list_hover"></div>
                        <img class="menu_list_img" src="${i.itemImg}">
                    </a>
	                </div>
	                
	                <p class="menu_list_name">${i.itemName}</p>
	                <p class="menu_list_cost">${i.itemPrice}</p>
	                <div class="menu_list_check flex">
	                	<c:if test="${i.itemRole==1}">
	                		<span class="menu_list_best">MD CHOICE</span>
	                	</c:if>
	                	<c:if test="${i.itemRole==2}">
	                		<span class="menu_list_sale">New</span>
	                	</c:if>
	                	<c:if test="${i.itemRole==3}">
	                		<span class="menu_list_best">MD CHOICE</span>
	                		<span class="menu_list_sale">New</span>
	                	</c:if>
	                </div>
	            </li>
            </c:forEach>
        </ul>
    </section>
    <!-- //menu end -->

<jsp:include page="../inc/bottom.jsp"/>
    