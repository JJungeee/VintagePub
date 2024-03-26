//장바구니 선택상품 삭제
function deleteSelected() {
    var checkboxes = document.querySelectorAll('input[type="checkbox"]');
    checkboxes.forEach(function(checkbox) {
        if (checkbox.checked) {
        	checkbox.parentNode.parentNode.remove();
        }
    });
}



