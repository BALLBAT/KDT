// 21_dom_handing_children.js
// TODO: 선택한 태그의 자식 태그 선택하기.
// TODO: 사용법 : 
// let 부모태그변수 = document.querySelector("부모태그");
// 부모태그변수.children[인덱스번호].속성;

// TODO: 1) 부모태그(ul) 선택
let ul = document.querySelector("ul"); // ul 태그

// TODO: 2) 자식 태그(li) 선택
let two = ul.children[1].innerHTML; // 2nd li text
let three = ul.children[2].innerHTML; // 3rd li text

// 배열을 이용해서 자식 태그를 선택한다.

// 출력
console.log("two", two);
console.log("three", three);