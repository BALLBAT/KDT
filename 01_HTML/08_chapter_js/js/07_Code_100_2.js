// 07_Code_100_2.js
// 📃 1010) 퀴즈
// 1010
// 입력 : 15
// 출력 : 15

// let num = prompt("enter")
// alert(num);

// 📃 1011) 퀴즈
// 1011
// 입력 : p
// 출력 : p

// let char = prompt("enter")
// alert(char);

// 📃 1012) 퀴즈
// 입력 : 1.414213
// 출력 : 1.414213

// let num = prompt("enter")
// alert(num)

// TODO: 예제 1) 배열
// TODO: 변수 : 1개의 값을 저장하는 곳(공간)
//       => 변수명 (1개)
//       예) 1, 2, 3 각각 변수에 저장
//         let num1 = 1;
//         let num2 = 2;
//         let num3 = 3;
// TODO: 배열변수 : 여러개의 값을 저장하는 곳(공간)
//       => 변수명 (1개)
//         let num;
//         num[0] = 1, num[1] = 2, num[2] = 3, ~ num[n] = n+1     - [index번호]

// 📃 1013) 퀴즈
// 출력 : 1 2
// 입력 : 1 2
// Number() : 문자열 -> 숫자로 변경
// split() : 문자열을 잘라서 배열에 넣어주는 함수
// 예)
// let char = "a b".split(" ")  // char[0]="a", char[1]="b"
// alert(char[0] + " " + char[1]);

// let char = prompt("공백을 기준으로 2개 입력").split(" ")
// alert(char[0] + " " + char[1]);

// 📃 1014) 퀴즈
// 입력 : A b
// 출력 : b A

// let char = prompt("공백을 기준으로 2개 입력").split(" ")
// alert(char[1] + " " + char[0])

// 📃 1015) 퀴즈
// 입력 : 1.59254
// 출력 : 1.59
// TODO : 1015) 힌트 : .tofixed() : 소수점 자르기(버림) 함수
// TODO : 숫자.toFixed(잘라낼 자릿수)

// let num = Number(prompt("enter"))
// alert(num.toFixed(2));
// 직접 해결해내었음.

// 📃 1017) 퀴즈
// 입력 : 125
// 출력 : 125 125 125

// let num = prompt("enter")
// alert(num+" "+num+" "+num)

// 📃 1018) 퀴즈
// 입력 : 3:16
// 출력 : 3:16

// let char = prompt("enter")
// alert(char);

// 📃 1019) 퀴즈
// 입력 : 2013.8.5
// 출력 : 2013.08.05
// num[0] = 2013, num[1] = 8, num[2] = 5

// let num = prompt("날짜 입력").split(".");
// let year = num[0];            // 2013
// let month = ".0" + num[1];    // .08
// let day = ".0" + num[2];      // .05
// alert(year+month+day);

// 📃 1020) 퀴즈
// 입력 : 000907-1121112
// 출력 : 0009071121112

// let num = prompt("enter").split("-") // 000907-1121112
// alert(num[0]+num[1]);                          // 0009071121112

// 📃 1021) 퀴즈
// 입력 : Informatics
// 출력 : Informatics

// let char = prompt("enter")
// alert(char);

// 📃 1022) 퀴즈
// 입력 : Programming is very fun!!
// 출력 : Programming is very fun!!

// let char = prompt("enter");
// alert(char);

// 📃 1023) 퀴즈
// 입력 : 1.414213
// 출력 : 1
// 414213
// split : 숫자가 대상이 아님, 문자열이 대상

// let num = prompt("enter").split(".");
// alert(num[0]+"\n"+num[1]);

// 📃 1024) 퀴즈
// 입력 : Boy
// 출력 : 'B'
// 'o'
// 'y'
// TODO: C-언어 <- 자바, js
//       char[0] = 'B', char[1] = 'o', char[2] = 'y'
// let char = prompt("enter"); // char[0] = 'B', char[1] = "o", char[2] = "y"
// alert("'"+char[0]+"'"+"\n"+"'"+char[1]+"'"+"\n"+"'"+char[2]+"'"+"\n");


// 📃 1025) 퀴즈
// 입력 : 75254
// 출력 : [70000][5000]
//        [200][50]
//        [4]

// 입력 : 75254 -> "75254", 
// let num = prompt("enter"); //num[0] = 7, num[1] = 5, num[2] = 2, num[3] = 5, num[4] = 4
// alert("[" +num[0] +  "0000" + "]" + "["+num[1] + "000" + "]" + "\n" + "[" + num[2] + "00" + "]" + "[" + num[3] + "0" + "]" + "\n" + "[" + num[4] + "]") // 70000
// TODO: 좀 보기 편하게 가자면은
// let num = prompt("1char"); // 75254
// let first  = "[" + num[0] + "0000" + "]"; // [70000]
// let second = "[" + num[1] + "000" + "]";  // [5000]
// let third  = "[" + num[2] + "00" + "]";   // [200]
// let forth  = "[" + num[3] + "0" + "]";    // [50]
// let fifth  = "[" + num[4] + "]";    // [4]
// alert(first + second + "\n" + third + forth + "\n" + fifth);


// 📃 1026) 퀴즈
// 입력 : 17:23:57
// 출력 : 23

// let num = prompt("enter").split(":")
// alert(num[1]);


// 📃 1027) 퀴즈
// 입력 : 2014.07.15
// 출력 : 15-07-2014

// let num = prompt("enter").split(".")
// alert(num[2] + "-" + num[1] + "-" + num[0]);

// 📃 1028) 퀴즈
// 입력 : 2147483648
// 출력 : 2147483648

// let num = prompt("enter")
// alert(num);


// 📃 1029) 퀴즈
// 입력 : 3.14159265359
// 출력 : 3.14159265359

// let num = prompt("enter")
// alert(num);

// 📃 1030) 퀴즈
// 입력 : -2147483649
// 출력 : -2147483649

// let num = prompt("enter")
// alert(num);
