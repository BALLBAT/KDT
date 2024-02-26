// 19_dom_quiz_8.js
let cup = document.querySelector("#cup");
function chagePic(){
    cup.addEventListener("click", function(){
        cup.src = "./img/cup-2.png";
    })
}

// TODO: 이미지 바꾸기
// 1) img 태그 : src 속성 = "./img/cup-1.png"
// => img 태그 : src 속성 = "./img/cup-2.png"
// TODO: 1) img 태그를 선택(접근) :
// 사용법 : document.querySelector("css선택자")

// TODO: 2) 클릭했을 때 위의 소스를 적용
// TODO: 클릭 함수 정의
// 사용법 : document.querySelector("#cup").src = "./img/cup-2.png"; // img 태그


// TODO: 자동 정렬 단축키 : ctrl + alt + l
// TODO: 이미지 바꾸기

// TODO: 2) 클릭했을때 위의 소스를 적용
// TODO: 클릭 함수 정의
// function chagePic() {
    // 1) img 태그 : src속성 ="./img/cup-1.png"
    // => img 태그 : src속성 ="./img/cup-2.png"
    
    // TODO: 1) img 태그를 선택(접근) :
    // 복습 : css 선택자 : id선택자, class선택자, 태그선택자
    // 사용법 : document.querySelector("css선택자")
    // document.querySelector("#cup").src = "./img/cup-2.png"; // img 태그
//   }