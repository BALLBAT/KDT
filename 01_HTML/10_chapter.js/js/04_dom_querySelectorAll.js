// 04_dom_querySelectorAll.js
// TODO: querySelectotAll() 예제
// TODO: 사용법
// TODO: DOM 태그를 여러개 선택하는 함수
let elements = document.querySelectorAll("ul li");
// ul안에 li가 4개 있기 때문에 all을 써야지만 4개를 다 선택해준다.

// TODO : 배열변수.length => 배열의 개수를 알려줌
// 반복문 : for문
for(let i=0; i<elements.length; i++){
    // 로그 출력 : 변수의 값 확인용
    console.log(elements);
    // TODO: li 태그들 (배열)
    elements[i].innerHTML = i + ": 목록";
    // 글자색 변경
    elements[i].style.color = "blue";
}