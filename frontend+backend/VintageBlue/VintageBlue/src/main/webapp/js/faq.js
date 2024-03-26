(function($) {
    $(document).ready(function() {

        (function(){//slogan
            window.addEventListener('mousemove', handleMouseMove);
            window.addEventListener('resize', handleWindowResize);

            const spansSlow = document.querySelectorAll('.spanSlow');
            const spansFast = document.querySelectorAll('.spanFast');

            let width = window.innerWidth;

            function handleMouseMove(e) {
                let normalizedPosition = e.pageX / (width/2) - 1;
                let speedSlow = 100 * normalizedPosition;
                let speedFast = 200 * normalizedPosition;
                spansSlow.forEach((span) => {
                    span.style.transform = `translate(${speedSlow}px)`;
                });
                spansFast.forEach((span) => {
                    span.style.transform = `translate(${speedFast}px)`
                })
            }
            function handleWindowResize() {
                width = window.innerWidth;
            }
        }());

        (function(){//faq
            let listContent = $('.faq_list .list_content');
                listContent.hide();

            let firstLi = $('.faq_list li:first-child');
            firstLi.addClass('on');
            firstLi.children('.list_content').show();

            $('body').on('click', '.faq_list .list_head', function(e) {
                let $this = $(this);
                let thisLi = $this.parent('li');

                listContent.filter(':visible').slideUp().parent('li').removeClass('on');
                thisLi.children('.list_content').slideToggle();
                thisLi.toggleClass('on');
            });
        }());

    });
}(jQuery));
