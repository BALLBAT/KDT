// 04_Code_100_7.js

// 📃 1071) 퀴즈
// 입력된 정수를 줄을 바꿔 하나씩 출력하는데, 0이 입력되면 종료한다.
// 입력 : 7 4 2 3 0 1 5 6 9 10 8
// 출력 : 7
// 4
// 2
// 3

// TODO: 1) split(" ") 자르면 배열이 됨
// TODO: 2) 반복문 실행시 if문 num[i] == 0 인 확인 : break;
// TODO: 3) 아니면 console.log(num[i])
// num = [7,4,2,3,0,1,5,6,9,10,8]
// let num = prompt("enter").split(" ");
// for(let i = 0; i<11; i++){
//     if(num[i] == "0"){
//         break;
//     }
//     console.log(num[i]);
    // TODO: 조건문 : num[i] === "0" -> break
    // 콘솔로그 보다 이프문이 위로 가 있어야 0이 출력 안된다.
// }


// 📃 1072) 퀴즈
// n개의 정수를 한 개씩 줄을 바꿔 출력한다.
// 입력 : 5
// 1 2 3 4 5
// 출력 : 1
// 2
// 3
// 4
// 5

// let num = prompt("enter").split(" ");
// 반복문
// for(let i = 0; i<5; i++){
//     console.log(num[i]);
// }


// 📃 1074) 퀴즈
// 1씩 줄이면서 한 줄에 하나씩 1이 될 때까지 출력한다.
// 입력 : 5
// 출력 : 5
// 4
// 3
// 2
// 1
// TODO: 힌트 : 1) 반복문 실행시 입력결과 -1 빼기
// TODO: 힌트 : 2) 누적합 형태 : num = num - 1; 
// let num = Number(prompt("숫자 1개")); // 5

// 반복문
// for(let i=num; i> 0; i--) {
    // console.log(i); // i=5 ~ 1
// }