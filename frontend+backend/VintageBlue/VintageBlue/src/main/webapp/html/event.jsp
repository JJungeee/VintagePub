<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<jsp:include page="../inc/top.jsp"/>

<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Creepster&display=swap" rel="stylesheet">
	
	<!-- event_visual start -->
	<section class="event_visual rel over_h">
		<div class="ev_video bg-full bg-cover">
			<video autoplay loop muted playsinline poster="${pageContext.request.contextPath}/img/blue/ev_poster.png">
				<source type="video/mp4" src="${pageContext.request.contextPath}/img/blue/event_video.mp4">
			</video>
			<!--<iframe src="//player.vimeo.com/video/901759745?quality=1080p&autopause=0&playsinline=1&autoplay=1&loop=1&muted=1&background=1" allow="autoplay" width="100%" height="100%" frameborder="0" playsinline="" webkitallowfullscreen="" mozallowfullscreen="" allowfullscreen=""></iframe>-->
		</div>
    </section>
    <!-- //event_visual end -->
    
    <!-- movie_slide start -->
	<section class="movie_slide">
	<h2>PRODUCT in GALLERY</h2>
        <div class="movie_slide_wrpper">
            <div class="swiper-container">
                <ul class="swiper-wrapper">
                    <li class="swiper-slide sl1">
                        <div class="movie_sl_img"></div>
                    </li>
                    <li class="swiper-slide sl2">
                        <div class="movie_sl_img"></div>
                    </li>
                    <li class="swiper-slide sl3">
                        <div class="movie_sl_img"></div>
                    </li>
                    <li class="swiper-slide sl4">
                        <div class="movie_sl_img"></div>
                    </li>
                    <li class="swiper-slide sl5">
                        <div class="movie_sl_img"></div>
                    </li>
                </ul>
            </div>
            <div class="swiper-button swiper-button-prev"><i class="fa-solid fa-play"></i></div>
            <div class="swiper-button swiper-button-next"><i class="fa-solid fa-play"></i></div>
        </div>
	</section>
	<!-- //movie_slide end -->
    
<jsp:include page="../inc/bottom.jsp"/>