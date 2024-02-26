// 01_window.open.js
// TODO: 새창/새탭 열기/닫기 예제
// TODO: let num - 좋은 코딩 방법인뒈
// TODO: 변수 => 전역변수/지역변수(let num)
// TODO: 전역변수 : 어떤 소스에서도 사용가능 But 과하면 메모리 부족 현상
// TODO: 지역변수 : 추천하는 변수 형태 ex.) let 변수
// 열기 클릭 함수 정의
function openWin(){
    myWin = window.open("notice.html", "dolt", "width=400, height=350");
}

// 닫기 클릭 함수 정의
function closeWin(){
    myWin.close(); 
}