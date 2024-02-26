// 20_dom_quiz_9.js
// 1st 버튼 클릭 함수 : 전등 켜기 이미지 보기
function lightOn(){
    // 클릭하면 실행할 코딩
    // <img src = "./img/light_off.png" : 전등 끄기
    // <img src = "./img/light_on.png"  : 전등 켜기
    // TODO: 1) img 태그 선택(접근)
    let img = document.querySelector("img"); // img 태그
    // TODO: 2) img 태그의 src 속성 = "./img/light_on.png"
    img.src = "./img/light_on.png";
}

// 2nd 버튼 클릭 함수 : 전등 끄기 이미지 보기
function lightOff(){
    let img = document.querySelector("img");
    img.src = "./img/light_off.png";
}


// TODO: 내가 했는데 끄는거 막힌 코딩
// TODO: 바보같이 버튼에다가 변수를 맥일 생각을 해서 안된거였음
// TODO: 그냥 각각 펑션만 줬어도 됐을 일
// let button = document.querySelector("button");
// let button2 = document.querySelector("button2");
// let img = document.querySelector("img");

// function lightOn(){
//     button.addEventListener("click", function(){
//         img.src = "./img/light_on.png";
//     })
// }

// function lightOff(){
//     button.addEventListener("click", function(){
//         img.src = "./img/light_off.png";
//     })
// }