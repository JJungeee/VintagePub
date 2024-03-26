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
                    <a href="#">
                        <div class="menu_list_hover"></div>
                        <img class="menu_list_img" src="${i.itemImg}">
                    </a>
	                </div>
	                <p class="menu_list_name">${i.itemName}</p>
	                <p class="menu_list_cost">${i.itemPrice}</p>
	                <div class="menu_list_check flex">
	                	<c:if test="${i.itemRole==1}">
	                		<span class="menu_list_best">BEST</span>
	                	</c:if>
	                	<c:if test="${i.itemRole==2}">
	                		<span class="menu_list_sale">SALE</span>
	                	</c:if>
	                	<c:if test="${i.itemRole==3}">
	                		<span class="menu_list_sale">SALE</span>
	                		<span class="menu_list_best">BEST</span>
	                	</c:if>
	                </div>
	            </li>
            </c:forEach>
        	
            <!-- <li>
                <div class="menu_list_wrapper">
                    <a href="#">
                        <div class="menu_list_hover"></div>
                        <div class="menu_list_img"></div>
                    </a>
                </div>
                <p class="menu_list_name">ocean_goblet</p>
                <p class="menu_list_cost">19000</p>
                <div class="menu_list_check flex">
                    <span class="menu_list_sale">SALE</span>
                    <span class="menu_list_best">BEST</span>
                </div>
            </li> -->
           <!-- <li>
                <div class="menu_list_wrapper">
                    <a href="#">
                        <div class="menu_list_hover"></div>
                        <div class="menu_list_img"></div>
                    </a>
                </div>
                <p class="menu_list_name">table_lamp</p>
                <p class="menu_list_cost">18000</p>
                <div class="menu_list_check flex">
                    <span class="menu_list_best">BEST</span>
                </div>
            </li>
            <li>
                <div class="menu_list_wrapper">
                    <a href="#">
                        <div class="menu_list_hover"></div>
                        <div class="menu_list_img"></div>
                    </a>
                </div>
                <p class="menu_list_name">neon_pillow</p>
                <p class="menu_list_cost">34000</p>
                <div class="menu_list_check flex">
                    <span class="menu_list_sale">SALE</span>
                </div>
            </li>
            <li>
                <div class="menu_list_wrapper">
                    <a href="#">
                        <div class="menu_list_hover"></div>
                        <div class="menu_list_img"></div>
                    </a>
                </div>
                <p class="menu_list_name">polaroid_camera</p>
                <p class="menu_list_cost">24000</p>
            </li>
            <li>
                <div class="menu_list_wrapper">
                    <a href="#">
                        <div class="menu_list_hover"></div>
                        <div class="menu_list_img"></div>
                    </a>
                </div>
                <p class="menu_list_name">enamel_bowl</p>
                <p class="menu_list_cost">56000</p>
            </li>
            <li>
                <div class="menu_list_wrapper">
                    <a href="#">
                        <div class="menu_list_hover"></div>
                        <div class="menu_list_img"></div>
                    </a>
                </div>
                <p class="menu_list_name">ceramic_vase</p>
                <p class="menu_list_cost">11000</p>
            </li>
            <li>
                <div class="menu_list_wrapper">
                    <a href="#">
                        <div class="menu_list_hover"></div>
                        <div class="menu_list_img"></div>
                    </a>
                </div>
                <p class="menu_list_name">candles</p>
                <p class="menu_list_cost">32000</p>
            </li>
            <li>
                <div class="menu_list_wrapper">
                    <a href="#">
                        <div class="menu_list_hover"></div>
                        <div class="menu_list_img"></div>
                    </a>
                </div>
                <p class="menu_list_name">black_chair</p>
                <p class="menu_list_cost">28000</p>
            </li>
            <li>
                <div class="menu_list_wrapper">
                    <a href="#">
                        <div class="menu_list_hover"></div>
                        <div class="menu_list_img"></div>
                    </a>
                </div>
                <p class="menu_list_name">mint_chair</p>
                <p class="menu_list_cost">26000</p>
            </li>
            <li>
                <div class="menu_list_wrapper">
                    <a href="#">
                        <div class="menu_list_hover"></div>
                        <div class="menu_list_img"></div>
                    </a>
                </div>
                <p class="menu_list_name">mint_glass</p>
                <p class="menu_list_cost">12000</p>
            </li>
            <li>
                <div class="menu_list_wrapper">
                    <a href="#">
                        <div class="menu_list_hover"></div>
                        <div class="menu_list_img"></div>
                    </a>
                </div>
                <p class="menu_list_name">mini_television</p>
                <p class="menu_list_cost">45000</p>
            </li>
            <li>
                <div class="menu_list_wrapper">
                    <a href="#">
                        <div class="menu_list_hover"></div>
                        <div class="menu_list_img"></div>
                    </a>
                </div>
                <p class="menu_list_name">pink_glass</p>
                <p class="menu_list_cost">14000</p>
            </li> -->
        </ul>
    </section>
    <!-- //menu end -->

<jsp:include page="../inc/bottom.jsp"/>
    