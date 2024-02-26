// 12_Code_100_5.js

// 📃 1059) 퀴즈
// 비트단위로 NOT 하여 출력하기(설명)
// 힌트 : ~ (비트의 값을 반전시킴)
// 비트 단위로 1 -> 0, 0 -> 1로 바꾼 후 그 값을 10진수로 출력한다.
// 입력 : 2
// 출력 : -3
// let num = prompt("enter");  // 2
// alert(~num);  // -3


// 📃 1060) 퀴즈
// 비트단위로 AND 하여 출력하기(설명)
// 힌트 : 2 & 3 (같은 비트몀 1 , 다른 비트면 0으로 바꾸어 출력됨)
// 입력 : 3 5
// 출력 : 1
// let num = prompt("enter").split(" ");
// let f = Number(num[0])  // 3
// let s = Number(num[1])  // 5
// alert(f & s);  // 1


// 📃 1061) 퀴즈
// 두 정수를 비트단위(bitwise)로 or 계산을 수행한 결과를 10진수로 출력한다.
// 힌트 : 2 | 3 (둘중에 하나라도 1이면 1 , 아니면 0으로 바꾸어 출력됨)
// 입력 : 3 5
// 출력 : 7

// let num = prompt("enter").split(" ");
// let f = Number(num[0]);
// let s = Number(num[1]);
// alert(f|s);



// 📃 1062) 퀴즈
// 비트단위로 XOR 하여 출력하기(설명)
// 힌트 : 2 3 (같은 비트면 0 , 다른 비트면 1으로 바꾸어 출력됨)
// 입력 : 3 5
// 출력 :

// let num = prompt("enter").split(" ");
// let f = Number(num[0]);
// let s = Number(num[1]);
// alert(f^s);


// 📃 1063) 퀴즈
// 두 정수 중 큰 값을 10진수로 출력한다.
// 입력 : 123 456
// 출력 : 456

// TODO: 조건문 #1
// let num = prompt("enter").split(" ");
// let f = Number(num[0]); // 123
// let s = Number(num[1]); // 456
// if(f > s){
//     alert(f)
// } else if(s > f){
//     alert(s)
// }

// TODO: Math.max(숫자1, 숫자2, ...) : 수학 js 함수 (최대값 구하기) #2
// let num = prompt("enter").split(" ");
// let f = Number(num[0]);
// let s = Number(num[1]);
// alert(Math.max(f, s));


// 📃 1064) 퀴즈
// 정수 3개 입력받아 가장 작은 수 출력하기(설명)
// 가장 작은 값을 출력한다.
// 입력 : 3 -1 5
// 출력 : -1
// TODO: 최소값 구하는 js 함수 : Math.min(숫자1, 숫자2, ...) 사용법

// let num = prompt("enter").split(" ");
// let f = Number(num[0]);
// let s = Number(num[1]);
// let t = Number(num[2]);
// alert(Math.min(f, s, t));
