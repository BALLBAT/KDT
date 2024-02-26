// 07_dom_onclick.js
// TODO: click #2 예제
// 예제) 3가지 글자 링크를 클릭하면 그 색깔로 배경색을 바꾸기

// 함수 정의
function changeBg(color){
    let result = document.querySelector("#result");
    // 배경색 바꾸기
    result.style.background = color; // color (green, orange, purple)
}