// 03_datatype.js
// TODO: 자료형 정리
// TODO: 1) 문자열(String)   : "", ''  사용
// TODO: 2) 숫자(Number)     : 1, 2, 3 사용
// TODO: 3) 참/거짓(Boolean) : true/false 사용
// TODO: 4) 객체(Object)     : let cat={name:"나비"};
// TODO: 4-2) 배열(객체의 일종) : let num=[1,2,3];
// TODO: 5) null 자료형      : 공간이 없음을 의미
// => null 사용은 과거의 코딩
// let char = null;       // 방을 예약만 해두고 체크인은 안한 상태

// 요즘 코딩
// let char = 0; or let char = "";    0이나 빈문자열 등의 값을 넣어둠

// TODO: 6) undefined 자료형 : (js만 존재, 다른 언어 X)
// TODO: 객체 정의 형태에서 나옴 : 에러로 나옴
let dog = {
    name : "삼순이",
    age  : 2
}
console.log(dog.name); // 삼순이
console.log(dog.age);  // 2
console.log(dog.code); // TODO: undefined 에러 발생