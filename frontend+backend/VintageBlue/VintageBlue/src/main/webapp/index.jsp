<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=1260">
    <meta property="og:image" href="img/common/berry.png">
    <link rel="shortcut icon" href="img/common/favicon.ico">
    <title>Vintage Blue</title>
    <link rel="stylesheet" href="css/style.css">
    <link rel="stylesheet" href="css/main.css">
    <script src="https://kit.fontawesome.com/b632cb621d.js" crossorigin="anonymous"></script>
</head>
<body>

<div id="wrap">
    
    <jsp:include page="inc/header.jsp"/>

    <!-- vintage start -->
    <section class="vintage rel over_h">
        <div class="vintage_vid bg-full bg-cover"></div>
        <div class="visual_line">
            <div class="visual_line_fill"></div>
        </div>
    </section>
    <!-- //vintage end -->

    <!-- showcase_finds start -->
    <div class="showcase_finds rel">

        <!-- showcase start -->
        <section class="showcase rel over_h">
            <div class="inner">
                <h2 class="layer_title">Curated Collection</h2>
                <p class="layer_subtitle">
                    Step into the past with our unique vintage collection!<br>
                    Each piece tells a distinctive story, blending nostalgia with elegance.<br>
                    From classic clothing to retro decor, discover bygone era treasures.<br>
                    Elevate your style and own a piece of history.<br>
                    Explore timeless style with our vintage collection.<br> 
                    Discover unique treasures and elevate your fashion today!<br> 
                    Capture the allure of yesteryears with our curated selection.<br>
                    where style meets history effortlessly!
                </p>
            </div>
            <div class="showcase_flow abs">
                <div class="swiper-container">
                    <ul class="swiper-wrapper">
                        <li class="swiper-slide">VINTAGE SHOWCASE</li>
                        <li class="swiper-slide">VINTAGE SHOWCASE</li>
                    </ul>
                </div>
            </div>
            <div class="neon_pillow l50"><img src="img/common/neon_pillow.png" alt="네온 베개"></div>
            <div class="table_lamp l50"><img src="img/common/burgendy_lamp.png" alt="테이블 조명"></div>
        </section>
        <!-- //showcase end -->

        <!-- finds start -->
        <section class="finds">
            <div class="findes_head t_center">
                <h2 class="layer_title">Vintage Finds</h2>
                <p class="layer_text">
                    Explore the charm of past times with our Vintage Finds.<br>
                    Each piece tells a unique story, adding nostalgia to your space.
                </p>
            </div>
            <div class="finds_slide">
                <div class="swiper-container">
                    <ul class="swiper-wrapper">
                        <li class="swiper-slide">
                            <div class="flex-center" data-swiper-parallax-y="100"> 
                                <img src="img/common/enamel_bowl.png" alt="enamel_bowl">
                            </div>
                        </li>
                        <li class="swiper-slide">
                            <div class="flex-center" data-swiper-parallax-y="100">
                                <img src="img/common/mini_television.png" alt="mini_television">
                            </div>
                        </li>
                        <li class="swiper-slide">
                            <div class="flex-center" data-swiper-parallax-y="100">
                                <img src="img/common/pink_glass.png" alt="pink_glass">
                            </div>
                        </li>
                        <li class="swiper-slide">
                            <div class="flex-center" data-swiper-parallax-y="100">
                                <img src="img/common/mint_chair.png" alt="mint_chair">
                            </div>
                        </li>
                        <li class="swiper-slide">
                            <div class="flex-center" data-swiper-parallax-y="100">
                                <img src="img/common/candles.png" alt="candles">
                            </div>
                        </li>
                        <li class="swiper-slide">
                            <div class="flex-center" data-swiper-parallax-y="100">
                                <img src="img/common/polaroid_camera.png" alt="polaroid_camera">
                            </div>
                        </li>
                    </ul>
                </div>
            </div>
        </section>
        <!-- //finds end -->

    </div>
    <!-- //showcase_finds end -->

    <!-- gallery start -->
    <section class="gallery rel">
        <div class="gallery_head t_center">
            <h2 class="layer_title">Vintage Gallery</h2>
            <p class="layer_text">
                living in switzerland requires vertical thinking.<br> 
                so too does traveling here
            </p>
        </div>
        <div class="gallery_slide_wrap rel">
            <div class="gallery_slide bg-full">
                <div class="swiper-container h100">
                    <ul class="swiper-wrapper">
                        <li class="swiper-slide sl01">
                            <div class="slide-inner"></div>
                        </li>
                        <li class="swiper-slide sl02">
                            <div class="slide-inner"></div>
                        </li>
                        <li class="swiper-slide sl03">
                            <div class="slide-inner"></div>
                        </li>
                        <li class="swiper-slide sl04">
                            <div class="slide-inner"></div>
                        </li>
                    </ul>
                </div>
            </div>
        </div>
    </section>
    <!-- //gallery end -->

    <!-- record start -->
    <section class="record rel over_h">
        <div class="record_pattern bg-full"></div>
        <div class="record_svg_wrap bg-full">
            <svg width="100%" height="100%">
                <mask id="record_mask">
                    <rect x="0" y="0" width="100%" height="100%" fill="#000"></rect>
                    <image class="record_svg" xlink:href="img/main/record_white.png" x="50%" y="0" width="400" height="400"></image>
                </mask>
                <image mask="url(#record_mask)" xlink:href="img/common/vin2.png" x="0" y="0"></image>
            </svg>
        </div>
    </section>
    <!-- //record end -->

    <!-- inter start -->
    <section class="inter rel">
        <div class="inter_head t_center">
            <h2 class="layer_title">Vintage Interior</h2>
            <p class="layer_text">
                living in switzerland requires vertical thinking.<br> 
                so too does traveling here
            </p>
        </div>
        <div class="inter_imgs rel over_h">
            <div class="inter_imgs_area bg-full">
                <div class="inter_imgs01_wrapper abs">
                    <div class="inter_imgs01 l50">
                        <ul class="inter_imgs_row inter_imgs_row01 abs">
                            <li></li>
                            <li></li>
                            <li></li>
                            <li></li>
                            <li></li>
                        </ul>
                    </div>
                    <div class="inter_img01_cover bg-full"></div>
                </div>
                <div class="inter_imgs02_wrapper abs">
                    <div class="inter_imgs02 l50">
                        <ul class="inter_imgs_row inter_imgs_row02 abs">
                            <li></li>
                            <li class="inter_active"></li>
                            <li></li>
                            <li></li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>
    </section>
    <!-- //inter end -->

    <jsp:include page="inc/footer.jsp"/>
    
</div>

<script src="js/jquery-1.12.0.min.js"></script>
<script src="js/common.js"></script>
<script src="js/main.js"></script>
    
</body>
</html>