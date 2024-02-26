// 01_function.js
// TODO: 함수(==메소드) : 어떤 기느을 미리 코딩해놓은 것
// 예) .toFixed(), Math.max()
// 장점 : 코딩 효율성 증가

// TODO: 함수를 만드는 방법(함수 정의)
// TODO: 1) 함수 정의
// TODO: 사용법
// 함수 정의 방법
// function 함수명(){
//     실행문;
// }

// 함수명(); // 함수 실행

// 함수 정의
// function hello(){
//     alert("안녕하세요");
// }

// hello(); // 함수 실행


// 연습 1) "hello world" 라고 출력하는 함수를 작성하고 함수를 실행하세요.
// function hello2(){
//     alert('"hello world"');
// }

// hello2();

// TODO: 2) 함수 정의 : 코딩 효율성 증가
// TODO: 사용법 :
// TODO: 함수명("문자열"); -> function 함수명("문자열") {실행문("문자열")}
// TODO: params (변수) = "문자열";
// function 함수명(매개변수){
// 실행문(매개변수)}
// 함수명("문자열");         // 함수 실행

// 함수 정의 (정의 부분은 수정할 필요 없이)
// function hello(params){
    // alert(params);
// }
// 함수 실행 (실행 부분에서만 수정하면 돼서 편함)
// hello("안녕하세요.");

// 연습 2) 매개변수를 이용해서 화면엘 출력하는 함수를 정의하고 실행하세요.
// 출력 : hello world
// 코드 완성하세요
// function hello2(params){
    // alert(params);
// }

// hello2("hello world"); // 함수 실행

// TODO: 3) 함수 정의 : (*)
// TODO: 사용법
// TODO: return 역할 : 함수 밖으로 결과 내보내기 예약어
// function 함수명(매개변수){
//     return 매개변수 + "추가가공"} 

// function hello(params){
    // return params + " world";
// }
// let result = hello("hello"); // 함수 실행
// alert(result);               // 결과 출력

// 연습 1) 어떤 수를 매개변수를 전달 받아 +1 함수를 정의하고 실행하세요
// 출력 : 3

// let result = sumFunc(2);
// alert(result); // 3

// function sumFunc(params){
//     return params + 1;
// }
