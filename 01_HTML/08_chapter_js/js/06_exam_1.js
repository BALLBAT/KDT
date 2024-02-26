// 06_exam_1.js
// 1) 입력함수 : prompt() 이용해서 입력받기
// 아래 코딩을 완성하세요
// 입력 1 : a
// 입력 2 : b
// 출력 : b a

// let char1 = prompt("1개 입력") //a
// let char2 = prompt("1개 입력") //b
// 출력
// alert(char2+" "+char1); //ba
// 저 공백에 뭐가 들어가도 된다. 깨닳았다. 저렇게 변수를 2개 만들고
// 2개를 더해서 나오게 하면 출력이 잘 된다. 입력을 이제 a랑 b를 하고
// 뒤에가 먼저 나오도록 하게 하면 된다.
// 이건 좀 더 연습해야함 내 것으로 만들기 위해


// 2) 입력받은 정수를 줄을 바꿔 3번 출력한다.
// 단, 줄바꿈 특수문자(\n)를 사용해서 한번에 출력하세요
//    (alert, console.log 1번만 사용)
// TODO: 힌트 : "\n"(줄바꿈), 문자열 붙이기(+)
// 입력 : 3
// 출력 : 3
//       3
//       3

// let num = prompt("enter 1") //3
// alert(num + "\n" + num + "\n" + num);

// 나 이거 직접 꺠닳아버림.

// 3) 단어 2개가 입력된다.
// 2개를 거꾸로 붙여서 출력하세요
// 입력 1 : hello
// 입력 2 : world
// 출력   : worldhello
// 힌트 : 문자열붙이기 (+)

// let char1 = prompt("입력하세요") //hello
// let char2 = prompt("입력하세요") //world

// alert(char2+char1);   //worldhello

// 이거는 굉장히 쉽게 풀어냈음

// 4) 입력 1: Hello
//    입력 2 : World
//    출력 : Hello
//          World 
// 힌트 : \n (줄바꿈)

// let char1 = prompt("입력") //Hello
// let char2 = prompt("입력") //World

// alert(char1+"\n"+char2); // 줄바꿈된 Hello World

// TODO: 예제 1) js 입력방법 : prompt("표시문자열") => 결과 문자열
// TODO: 예) let num = prompt(""); // 3 => "3"

// 예제 1) 1개의 정수를 입력 받아 그대로 출력하세요.
// 입력 : 3
// 출력 : 4
// let num = Number(prompt("1개 숫자"));3 // 3 (문자열 -> 숫자로 변경)
// alert(num + 1); // 31로 출력됨

// 5) 두 정수의 합을 출력하세요
// 입력 1: 123
// 입력 2: -123
// 출력 : 0
// 힌트 : let 변수명 = Number(prompt("문자열")) (문자열 -> 숫자)

// let num1 = Number(prompt("입력")) //123
// let num2 = Number(prompt("입력")) //-123

// alert(num1+num2);  //0