// 06_dom_display.js
// TODO: 이벤트 : click(클릭), 마우스, 키보드 키다운/업
let closeBtn = document.querySelector(".popup > button")

// 클릭 이벤트
// TODO: 사용법 :
// 변수.addEventListener("이벤트", function(){실행문;});
// 변수 안쓰고 그냥 바로 해도 됨
closeBtn.addEventListener("click", function(){
    // TODO: 클릭시 실행될 코드
    document.querySelector(".popup").style.display = "none";
})