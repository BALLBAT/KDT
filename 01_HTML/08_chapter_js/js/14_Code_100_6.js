// 14_Code_100_6.js

// 📃 1065) 퀴즈
// 정수 3개 입력받아 짝수만 출력하기(설명)
// 입력 : 1 2 4
// 출력 : 2
//        4

// TODO: %(나머지 연산자)
// let num = prompt("enter").split(" ");
// let f = Number(num[0]); // 1
// let s = Number(num[1]); // 2
// let t = Number(num[2]); // 4

// 임시변수
// let result = "";

// 조건문 #1 : f = 1
// if(f % 2 == 0){
//     result = result + f + "\n";
// }
// 조건문 #2 : s = 2
// if(s % 2 == 0){
//     result = result + s + "\n";
// }
// 조건문 #3 : t = 4
// if(t % 2 == 0){
//     result = result + t + "\n";
// }

// alert(result);               // 갑자기 어려워짐 임시변수를 활용해야하는 부분..


// let num = prompt("enter").split(" ");
// let f = Number(num[0]); // 1
// let s = Number(num[1]); // 2
// let t = Number(num[2]); // 4

// TODO: #2

// 조건문 #1 : f = 1
// if(f % 2 == 0){
//     console.log(f);
// }
// 조건문 #2 : s = 2
// if(s % 2 == 0){
//     console.log(s);
// }
// 조건문 #3 : t = 4
// if(t % 2 == 0){
//     console.log(t);
// }


// 📃 1066) 퀴즈
// 정수 3개 입력받아 짝/홀 출력하기(설명)
// 입력 : 1 2 8
// 출력 : odd
//       even
//       even

// let num = prompt("enter").split(" ");
// let f = Number(num[0]); // 1
// let s = Number(num[1]); // 2
// let t = Number(num[2]); // 8

// let result = "";

// if(f % 2 == 0){
//     result = result + "even" + "\n";
// } else{
//     result = result + "odd" + "\n";
// }
// if(s % 2 == 0){
//     result = result + "even" + "\n";
// } else{
//     result = result + "odd" + "\n";
// } 
// if(t % 2 == 0){
//     result = result + "even" + "\n";
// } else{
//     result = result + "odd" + "\n";
// }

// alert(result);

// 집에서 해결해보기. => 위에 임시변수값 이용해서 해결

// 풀이
// let num = prompt("enter").split(" ");
// let f = Number(num[0]); // 1
// let s = Number(num[1]); // 2
// let t = Number(num[2]); // 8

// if(f % 2 == 0){
//     console.log("even")
// } else{
//     console.log("odd")
// }
// if(s % 2 == 0){
//     console.log("even")
// } else{
//     console.log("odd")
// }
// if(t % 2 == 0){
//     console.log("even")
// } else{
//     console.log("odd")
// }

// 아니; 어제 학원에서도 집에서도 안되던게 오늘 오니까 콘솔로그가 됨


// 📃 1067) 퀴즈
// 입력된 정수에 대해
// 첫 줄에 minus 나 plus 를 출력하고,
// 두 번째 줄에 odd 나 even 을 출력한다.
// 입력 : -2147483648
// 출력 : minus
// even

// let num = Number(prompt("enter"))
// 조건문 #1 : minus / plus
// if(num >= 0){
//     console.log("plus")
// } else{
//     console.log("minus")
// }
// 조건문 #2 : odd / even
// if(num % 2 == 0){
//     console.log("even")
// } else{
//     console.log("odd")
// }


// 📃 1068) 퀴즈
// 점수(정수, 0 ~ 100)를 입력받아 평가를 출력해보자.
// 평가 기준
// 점수 범위 : 평가
// 90 ~ 100 : A
// 70 ~ 89 : B
// 40 ~ 69 : C
// 0 ~ 39 : D
// 로 평가되어야 한다.
// 입력 : 73
// 출력 : B

// let num = Number(prompt("enter"));
// 90 <= num <= 100 - 여기서는 이렇게 표현할 수 없고.
// 90 <= num && num <= 100 - 이렇게 표현
// 어차피 결과는 하나만 나오면 되기 때문에 else if문 사용
// if(90 <= num && num <= 100){
//     console.log("A")
// } else if(70 <= num && num <= 89){
//     console.log("B")
// } else if(40 <= num && num <= 69){
//     console.log("C")
// } else if(0 <= num && num <= 39){
//     console.log("D")
// }


// 📃 1069) 퀴즈
// 평가 출력
// 평가 : 내용
// A : best!!!
// B : good!!
// C : run!
// D : slowly~
// 나머지 문자들 : what?
// 입력 : A
// 출력 : best!!!

// let char = prompt("enter");
// if( char =="A" ){
//     alert("best!!!")
// } else if( char == "B" ){
//     alert("good!!")
// } else if( char == "C" ){
//     alert("run!")
// } else if( char == "D" ){
//     alert("slowly~")
// } else {
//     alert("what?")
// }


// 📃 1070) 퀴즈
// 월이 입력될 때 계절 이름이 출력되도록 해보자.
// 월 : 계절 이름
// 12, 1, 2 : winter
// 3, 4, 5 : spring
// 6, 7, 8 : summer
// 9, 10, 11 : fall
// 입력 : 12
// 출력 : winter

// let num = prompt("enter");
// if(num == 12 || num == 1 || num == 2){
//     alert("winter")
// } else if(3<= num && num <=5){
//     alert("spring")
// } else if(6<= num && num <=8){
//     alert("summer")
// } else if(9<= num && num <=11){
//     alert("fall")
// }