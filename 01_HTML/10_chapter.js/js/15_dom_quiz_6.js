// 15_dom_quiz_6.js
let char = prompt("입력창");

let y = document.querySelector("#app");
if(char =="y"){
    y.innerHTML = "<button>글쓰기</button>";
} else{
    y.innerHTML = "<button>글수정</button>";
}
