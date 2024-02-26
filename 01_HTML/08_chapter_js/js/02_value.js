// 02_vlue.js
// TODO: 자료형
// 1) 문자열(String) : ex) "가나다", "abc" 등
// alert("가나다");

// 2) 숫자(Number) : ex) 1,2,3    따옴표 필요없음
// alert(1);

// TODO: 표현식 : 변수, 상수, 값
// TODO: 수학 방정식 등은 기호로 표시하는데 유사하게 식을 만들어 표시
// 1) 변수 : 변하는 값을 저장하는 곳(공간)
//    변수 사용법 : let 변수명 = 값;
// 샘플) let hello(변수명) =(저장) "Hello JS"(문자열 값);
// TODO: 코딩 추천 : 변수를 사용한 결과 출력 (소프트 코딩 - 실무)
// TODO: 문자열 다 넣어서 하는 코딩 (하드 코딩 - 십비추)
// let hello = "Hello JS";
// 변수는 값을 수정할 수 있음   let 떼고 변수명만 해서 수정하면 됨 그럼 수정된 값이 출력
// hello = "Hello JS2";
// alert(hello);

// 2) 상수 : 변하지 않는 값을 저장하는 곳
//    상수 사용법 : const 상수명 = 값;
// const hello = "Hello JS";
// TODO: 상수값은 수정 불가
// hello = "Hello JS2";
// alert(hello);

// TODO: 연산자
// 1) 사칙연산 : + - * /
//TODO:        %(나머지 연산자 : 나누었을 때 나머지가 결과로 나옴)

// 실습)
// 1) 덧셈
// let Num = 52+273;
// alert(Num);

// 2) 뺄셈
// let Num2 = 52-273;
// alert(Num2);

// 3) 곱셈
// let num3 = 52*273;
// alert(num3);

// 4) 나눗셈
// let num4 = 52/273;
// alert(num4);

// 5) 나머지 연산자
// let num5 = 8 % 2;
// alert(num5);

// TODO: 문자열 특수문자 : \(역슬래쉬), /(슬래쉬)
// 1) 줄바꿈 : \n
// let hello = "안녕하세요\n홍길동입니다.";
// alert(hello);

// 2) 홑따옴표, 쌍따옴표 출력
// TODO: 특수문자 : \"", \' 
// 결과 : '안녕하세요' 라는 값을 받고 싶으면?
// let hello = "'안녕하세요'"
// alert(hello);

let hello = '안녕 \'하세요"'
alert(hello);