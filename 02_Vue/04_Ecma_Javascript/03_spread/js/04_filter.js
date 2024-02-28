// 04_filter.js
// TODO: filter(거르다) 함수 : 배열 개수가 작은 새로운 배열을 만듦
// TODO: 특징 : 1) 자동 반복
// TODO: 특징 : 2) break 사용 불가능
// TODO: 특징 : 3) return 사용 가능

// 예제 : 3보다 큰 새로운 배열을 만드세요.
let num = [1,2,3,4,5];
// filter 함수 사용
// TODO: 사용법 : let 변수 = 배열변수.filter((매개변수)=>조건식);
// let result = num.filter((V)=> V > 3);
// console.log(result);

// 연습문제 1) filter 함수 사용해서 조작하세요
// 결과 : [1, 2]
// 조건 : value < 3
// let result = num.filter((V)=> V < 3);
// console.log(result);

// 연습문제 2) filter 함수 사용해서 조작하세요
// 결과 : [3]
let result = num.filter((V)=> 2 < V && V < 4);
console.log(result);