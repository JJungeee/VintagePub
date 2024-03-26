(function($) {
    $(document).ready(function() {
		
		new DimensionFix($('.ev_video'),{
			fixElem: $('.ev_video video'), w: 1280, h: 692
		}).fix();

        const swiper = new Swiper('.movie_slide_wrpper .swiper-container', {
	        loop: true,
	        centeredSlides: true,
	        slidesPerView: 'auto',
	        spaceBetween: 40,
	        speed: 1400,
	        autoplay: {
	            delay: 600,
	            disableOnInteraction: false,
	        },
	        navigation: {
	          nextEl: '.movie_slide_wrpper .swiper-button-next',
	          prevEl: '.movie_slide_wrpper .swiper-button-prev',
	        },
	      });

    });
}(jQuery));
