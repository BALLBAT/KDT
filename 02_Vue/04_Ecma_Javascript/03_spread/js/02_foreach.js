// 02_foreach.js
// TODO: 함수형 프로그래밍(코딩)
// TODO: 자바스크립트(스크립트언어) vs 자바(컴파일언어)
// TODO: 스크립트언어: 줄(행)단위로 해석 -> 바로 실행
// TODO: 컴파일언어  : 소스 -> 전부 해석함(5줄) -> 해석 종료 후 실행 (성능 빠름)
// TODO: 구조적 프로그래밍(C언어) -> 객체지향 프로그래밍(자바, JS 등) -> 함수형 프로그래밍(클로저 등)
// TODO: 위협 : 인건비 -> 객체지향 개발자 30명 개발 = 함수형 개발자 5명(at&t : SKT, KT) 

// TODO: foreach
// TODO: 대상 : only 배열변수
// TODO: 특징 : 1) 자동으로 반복문을 실행함
// TODO:        2) return이 없는 실행문에 대해 사용 : 값 출력용 사용
// TODO:        3) break문 사용 못함

// 예제 1) 1 ~ 5 출력
// let arr = [1,2,3,4,5];

// 일반 반복문
// for(let i=0; i<arr.length; i++){
//     console.log(arr[i]);
// }

// foreach 함수
// TODO: 사용법 : 배열변수.forEach((매개변수)=>{실행문(매개변수);})
// arr.forEach((value) => console.log(value)); // 1,2,3,4,5

// 연습 1) forEach() 이용 출력
// let str = ["a","b","c","d","e"];
// str.forEach((value)=>console.log(value));