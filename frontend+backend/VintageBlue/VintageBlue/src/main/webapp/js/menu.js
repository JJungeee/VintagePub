(function($) {
    $(document).ready(function() {

        (function(){//shop
		    gsap.timeline({
		        scrollTrigger: {
		            trigger: '.shop',
		            start: 'top top',
		            end: '+=1000px',
		            pin: true,
		            scrub: 0.6,
		            refreshPriority: 1
		        },
		    })
		    .to('#shop_record', {scale: 10, ease: 'none', transformOrigin: 'center center', duration: 1.2})
		    .to('.svg_figure', {opacity: 0, ease: 'none', duration: 0.7})
		    // .to('.svg_figure', {diaplay: 'none', duration: 3})
		}());
        
    });
}(jQuery));
