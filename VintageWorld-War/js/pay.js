(function($) {
    $(document).ready(function() {

        (function(){//order
            var tabs = $('.ob_tabs');
            var headerHeight = $('header').height();
            var tabsOffsetTop = tabs.offset().top - 200;
    
            $(window).scroll(function() {
                var scrollTop = $(window).scrollTop();
    
                if (scrollTop >= tabsOffsetTop) {
                    tabs.addClass('fixed');
                } else {
                    tabs.removeClass('fixed');
                }
            });
        }());
        
    });
})(jQuery);

function submitComment() {
    var commentInput = document.getElementById('commentInput');
    var commentList = document.getElementById('commentList');
  
    var comment = commentInput.value;
  
    var newComment = document.createElement('li');
    newComment.innerText = comment;
    commentList.appendChild(newComment);
  
    commentInput.value = "";
  }