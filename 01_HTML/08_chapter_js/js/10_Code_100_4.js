// 10_Code_100_4.js

// 📃 1049) 퀴즈
// 두 정수(a,b) 입력받아 비교하기1(설명)
// a가 b보다 큰 경우 1을, 그렇지 않은 경우 0을 출력한다.
// 입력 : 9 1
// 출력 : 1

// let num = prompt("enter").split(" ");
// let f = Number(num[0]);
// let s = Number(num[1]);

// if(f > s){
//     alert("1")
// } else{
//     alert("0")
// }


// 📃 1050) 퀴즈
// 두 정수 (a,b) 입력받아 비교하기2(설명)
// a와 b의 값이 같은 경우 1을, 그렇지 않은 경우 0을 출력한다.
// 입력 : 0 0
// 출력 : 1

// let num = prompt("enter").split(" ");
// let f = Number(num[0]);
// let s = Number(num[1]);

// if(f == s){
//     alert("1")
// } else{
//     alert("0")
// }


// 📃 1051) 퀴즈
// 두 정수 입력받아 비교하기3(설명)
// b가 a보다 크거나 같은 경우 1을, 그렇지 않은 경우 0을 출력한다.
// 입력 : 0 -1
// 출력 : 0

// let num = prompt("enter").split(" ");
// let f = Number(num[0]);
// let s = Number(num[1]);

// if(f <= s){
//     alert("1")
// } else{
//     alert("0")
// }


// 📃 1052) 퀴즈
// 두 정수 입력받아 비교하기4(설명)
// a와 b가 다른 경우 1을, 그렇지 않은 경우 0을 출력한다.
// 입력 : 0 1
// 출력 : 1

// let num = prompt("enter").split(" ");
// let f = Number(num[0]);
// let s = Number(num[1]);

// TODO: !=(같지않음)
// if(f != s){
//     alert("1")
// } else{
//     alert("0")
// }


// 📃 1053) 퀴즈
// 참 거짓 바꾸기(설명)
// 입력된 값이 0이면 1, 1이면 0을 출력한다.(단, 0 또는 1 만 입력된다.)
// 입력 : 1
// 출력 : 0

// let num = Number(prompt("enter"));
// if(num == 1){
//     alert("0")
// } else{
//     alert("1")
// }


// 📃 1054) 퀴즈
// 둘 다 참(1)일 경우에만 1을 출력하고, 그 외의 경우에는 0을 출력한다.
// 입력 : 1 0
// 출력 : 0
// TODO: 힌트 : 비교연산자(>=, ==), 논리연산자(%%(and, 그리고), ||(or, 이거나))
// TODO: 조건문
// let num = prompt("enter").split(" ");
// let f = Number(num[0])
// let s = Number(num[1])

// 1) first와 second가 1인지 각각 비교
// (f == 1) => true/false
// (s == 1) => true/false
// 2) 위의 결과를 다시 && 연산해서 결과를 나타냄

// if(f == 1 && s == 1){
//     alert(1);
// } else {
//     alert(0);
// }


// 📃 1055) 퀴즈
// 하나라도 참이면 참 출력하기(설명)
// 하나라도 참(1)일 경우 1을 출력하고, 그 외의 경우에는 0을 출력한다.
// 입력 : 1 0
// 출력 : 1
// TODO: 힌트 : 비교연산자(>=, ==), 논리연산자(%%(and, 그리고), ||(or, 이거나))

// let num = prompt("enter").split(" ");
// let f = Number(num[0])
// let s = Number(num[1])

// 조건문
// 1) f == 1, s == 1 각각 비교 => 결과 : true/false
// 2) 위의 각 결과 다시 ||(or 이거나) 연산 => 결과 : true/false
// if(f==1 || s==1){
//     alert("1")
// } else{
//     alert("0")
// }


// 📃 1056) 퀴즈
// 참(1)/거짓(0)이 서로 다를 때에만 1을 출력하고, 그 외의 경우에는 0을 출력한다.
// 입력 : 1 1
// 출력 : 0

// let num = prompt("enter").split(" ");
// let f = Number(num[0])
// let s = Number(num[1])

// if(f != s){
//     alert("1")
// } else{
//     alert("0")
// }


// 📃 1057) 퀴즈
// 참(1)/거짓(0)이 서로 같을 때에만 참 출력하기
// 입력 : 0 0
// 출력 : 1

// let num = prompt("enter").split(" ");
// let f = Number(num[0])
// let s = Number(num[1])

// if(f == s){
//     alert("1")
// }


// 📃 1058) 퀴즈
// 둘 다 거짓(0)일 경우에만 1을 출력하고, 그 외의 경우에는 0을 출력한다.
// 입력 : 0 1
// 출력 : 0

// let num = prompt("enter").split(" ");
// let f = Number(num[0])
// let s = Number(num[1])

// if(f = 0&& s= 0) {          //이렇게 해도 되기는 하는데, 정확하게 하려면 비교연산자를 사용하는게 좋다.
//     alert("1")
// } else{
//     alert("0")
// }