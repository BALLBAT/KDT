// 22_dom_handing_classList.js
// TODO: classList (특수)속성 소개
// TODO: 1) #content div 태그 선택
let content = document.querySelector("#content"); // div 태그

// TODO: 빨간색 클래스 추가
// TODO: 1) css의 .red 클래스 추가
// TODO: 사용법 : 태그변수.classList.add("클래스명");
content.classList.add("skyblue");

// TODO: 2) css의 .red 클래스를 삭제
// TODO: 사용법 : 태그변수.classList.remove("클래스명");
content.classList.remove("red");

// TODO: 3) css의 클래스 있으면 추가하고 없으면 삭제
// TODO: 사용법 : 태그변수.classLits.toggle("클래스명");
content.classList.toggle("red");