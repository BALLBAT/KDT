// 17_dom_mouseover2.js
// TODO: .addEventlistener() 함수 이용
// TODO: 1) 태그 선택(접근)
let myRect = document.querySelector("#rect"); // div 태그

// TODO: 2) 그 태그의 마우스 이벤트 적용
// TODO: 사용법 : 선택태그.addEventListner("이벤트명", 함수(){실행문;})
// TODO: 이벤트가 실행되면 함수()가 실행됨
myRect.addEventListener("mouseover", function(){
    //mouseover : 실행코드
    myRect.style.backgroundColor = "green";
    myRect.style.borderRadius = "50%";
})

// TODO: 마우스가 나갔을 때 함수 정의
myRect.addEventListener("mouseout", function(){
    //mouseout : 실행코드
    myRect.style.backgroundColor = "";
    myRect.style.borderRadius = "";
})