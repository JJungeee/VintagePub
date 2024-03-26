//로그인 폼 데이터 전송
function login() {
    var userId = document.getElementById('userId').value;
    var userPw = document.getElementById('userPw').value;

    //폼 데이터 생성
    var formData = new FormData();
    formData.append('userId', userId);
    formData.append('userPw', userPw);

    //AJAX 요청 생성
    var xhr = new XMLHttpRequest();
    xhr.open('POST', 'login.do');
    xhr.onload = function() {
        //로그인 처리 결과
        if (xhr.status === 200) {
        alert('로그인 성공');
        //페이지 이동 등 추가 동작 수행
        } else {
        alert('로그인 실패');
        }
    };
    xhr.send(formData);
}
  
//아이디 중복 확인
function checkId() {
    var userId = document.getElementById('userId').value;

    //폼 데이터 생성
    var formData = new FormData();
    formData.append('userId', userId);

    //AJAX 요청 생성
    var xhr = new XMLHttpRequest();
    xhr.open('POST', 'idcheck.do');
    xhr.onload = function() {
        if (xhr.status === 200) {
        alert('사용 가능한 아이디!');
        } else {
        alert('이미 사용 중인 아이디');
        }
    };
    xhr.send(formData);
}
  
//회원가입 폼 데이터 전송
function signup() {
    var userId = document.getElementById('userId').value;
    var userPw = document.getElementById('userPw').value;

    //폼 데이터 생성
    var formData = new FormData();
    formData.append('userId', userId);
    formData.append('userPw', userPw);

    //AJAX 요청 생성
    var xhr = new XMLHttpRequest();
    xhr.open('POST', 'signup.do');
    xhr.onload = function() {
        if (xhr.status === 200) {
        alert('회원가입 완료');
        } else {
        alert('회원가입 실패');
        }
    };
    xhr.send(formData);
}
  
//로그아웃
function logout() {
    //AJAX 요청 생성
    var xhr = new XMLHttpRequest();
    xhr.open('GET', 'logout.do');
    xhr.onload = function() {
        if (xhr.status === 200) {
        alert('로그아웃');
        } else {
        alert('로그아웃에 실패');
        }
    };
    xhr.send();
}