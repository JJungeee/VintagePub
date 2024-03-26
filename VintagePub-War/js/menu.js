(function($) {
    $(document).ready(function() {

        (function(){//shop
            gsap.timeline({
                scrollTrigger: {
                    trigger: '.shop',
                    start: 'top top',
                    end: '+=800px',
                    pin: true,
                    scrub: 0.6,
                    refreshPriority: 1
                },
            })
            .fromTo('.shop_record', {scale: 1, transformOrigin: 'center center'}, {scale: 6, duration: 1, ease: 'none'})
            .to('.shop_record', {opacity: 0, duration: 0.8})
        }());
        
    });
}(jQuery));
