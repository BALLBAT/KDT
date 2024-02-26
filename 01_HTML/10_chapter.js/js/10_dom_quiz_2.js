// 10_dom_quiz_2.html
// 버튼 클릭 함수 정의 - 펑션부터 준다.
// button onclick="innerhtml()"  여기서 "여기"에 펑션을 주는것.
function innerhtml() {
    // TODO: 1) div(output) 태그 사이에 시간을 넣기(.innerHTML)
    let output = document.querySelector("#output");
    // TODO: 2) 현재시간
    let date = new Date(); // 현재시간
    // TODO: 3) 현재시간 div(ouput) 넣기
    output.innerHTML = date;
}