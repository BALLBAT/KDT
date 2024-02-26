// 08_Code_100_3.js
// TODO: 진법 : 2진수, 8진수, 16진수
// 10진수 : 0 ~ 9 숫자로 표기
//         9 이후의 숫자는? 10 ~ 19
//         19 이후는? 20 ~ 29
// 2진수 : 0, 1 만으로 표시
// ex) 2진수 표기 : 0 -> 0
//               : 1 -> 1
//               : 2 -> 10
//               : 3 -> 11
//               : 4 -> 100
//               : 5 -> 101
//               : 6 -> 110
//               : 7 -> 111

// 예제) 진법 변환 : 10진수 -> 8진수 변환 함수
// TODO: 사용법 : 숫자 -> 문자열 변경
// TODO: 10진수 -> ?진수 변경
// TODO: 숫자.toString(진법); [진법의 값을 생략하면 10진수]
// let num = 12;
// alert(num.toString(8)); // "12"  숫자 -> 문자열로 변경  투스트링 괄호에 8들어가면 8진수 문자열로 변경
// alert(num.toString(16));
// alert(num.toString(2));

// TODO: ?진수 -> 10진수로 변경
// Number() : 문자열 -> 숫자 변경
// TODO: 사용법 : parseInt(숫자 값, 진수표시) => 결과가 10진수로 나옴
// let char = 10; // 8진수
// alert(parseInt(char, 8)); // 10진수로 변경

// 📃 1031) 퀴즈
// 8진수로 출력하시요
// 입력 : 10
// 출력 : 12

// let num = Number(prompt("enter"));
// TODO: 숫자.toString(진수) // 숫자 -> 문자열로 변경
// alert(num.toString(8));

// 📃 1032) 퀴즈
// 16진수로(소문자) 출력하시요
// 입력 : 255
// 출력 : ff

// let num = Number(prompt("enter"))
// alert(num.toString(16))

// 📃 1033) 퀴즈
// 16진수로(대문자) 출력하시요
// 입력 : 255
// 출력 : FF
// TODO: 힌트 : 문자열.toUpperCase(); => 대문자로 변경

// let num = Number(prompt("enter"))
// TODO: 힌트 : 숫자.toString(진수) // 숫자 -> 문자열로 변경
// let char = num.toString(16); // "ff"        변수를 하나 더 줘버리는거임 위에서 넘버에 변수를 줬고 그 변수가 부여된 넘버에 다시 변수를 부여
// alert(char.toUpperCase()); // "FF"


// 📃 1034) 퀴즈
// 8진수 10진수로 출력하시요
// 입력 : 13
// 출력 : 11

// TODO: 사용법 : parseInt(숫자, 특정진수) => 10진수 숫자
// TODO: 사용법 : parseInt(문자열, 특정진수) => 10진수 숫자
// let num = Number(prompt("enter"))
// alert(parseInt(num, 8))

// 📃 1035) 퀴즈
// 16진수 8진수로 출력하시요
// 입력 : f
// 출력 : 17

// let num = prompt("enter"); // "f" f가 16진순지 영문자인지 알 수 없어서 오류가 나기 때문에 우선 문자열로 받는거다.
// 문자열 -> 숫자 (특정 진수의) 변경
// let num2 = parseInt(num, 16); // "15" 10진수가 되었고
// 10진수 -> 8진수로 변경
// alert(num2.toString(8));

// TODO: 아스키 코드표
// 컴퓨터는 0, 1의 숫자만 인식함
// 이 0, 1의 숫자와 문자로 대응해놓은 표가 있음 이게 아스키 코드
// 아스키 코드표 : 숫자와 문자를 연결한 표

// 예제 1) 문자 -> 아스키코드
// let char = "CDA";
// TODO: 사용법 : 문자열.charCodeAt(배열인덱스번호)
// alert(char.charCodeAt(0)); // 67

// 예제 2) 아스키코드 -> 문자
// let num = "67"; // 아스키코드
// TODO: 사용법 : String.fromCharCode(숫자);
// alert(String.fromCharCode(num)); // "C"

// 📃 1036) 퀴즈
// 문자를 아스키코드 숫자값으로 출력한다.
// 입력 : A
// 출력 : 65

// let num = prompt("enter");  // "A" 
// alert(num.charCodeAt(0));   // "65"


// 📃 1037) 퀴즈
// 아스키코드 값을 문자로 출력한다.
// 입력 : 65
// 출력 : A

// let num = prompt("enter");      // "65"
// alert(String.fromCharCode(num)); // "A"


// 📃 1038) 퀴즈
// 두 정수의 합을 출력한다.
// 입력 : 123 -123
// 출력 : 0

// num[0] = 123, num[1] = -123
// let num = prompt("enter").split(" "); // 문자열로 해서 잘라두고 밑에다가 잘린 문자열에 숫자 값을 만들어주면 됨.
// let f = Number(num[0]) // 123
// let s = Number(num[1]) // -123
// alert(f + s);

// 📃 1039) 퀴즈
// 두 정수의 합을 출력한다.
// 입력 : 2147483648 2147483648
// 출력 : 4294967296

// let num = prompt("enter").split(" ");
// let f = Number(num[0]);
// let s = Number(num[1]);
// alert(f + s)


// 📃 1040) 퀴즈
// 부호를 바꿔 출력한다.
// 입력 : -1
// 출력 : 1

// let num = prompt("enter").split(" ");
// let f = Number(num[0]);
// alert(f * f)


// 📃 1042) 퀴즈
// 정수 2개 입력된다. a를 b로 나눈 몫을 출력한다.
// 입력 : 1 3
// 출력 : 0
// 힌트 : 산술연산 : a/b => 실수 (정수.소수점)
// parseInt() : 1) 문자열 -> 숫자 변경
//            : 2) 숫자 -> ?진수의 숫자 변경
//             위의 숫자(정수) (*) ==> 예) parseInt(1.234) => 1(결과)

// num[0] = 1, num[1] = 3
// let num = prompt("enter").split(" ");
// 임시변수 활용 => 문자열 -> 정수 변환
// let f = Number(num[0]) // 1
// let s = Number(num[1]) // 3
// 결과 : 정수만 취함 : 몫
// alert(parseInt(f / s)) // 0


// 📃 1043) 퀴즈
// 정수 2개 입력된다. a를 b로 나눈 나머지를 출력한다.
// 입력 : 10 3
// 출력 : 1
// TODO: 힌트 : % (나머지 연산자)

// let num = prompt("enter").split(" ");
// let f = Number(num[0]);
// let s = Number(num[1]);
// alert(f % s);


// 📃 1044) 퀴즈
// 입력된 정수에 1을 더해 출력한다.
// 입력 : 2147483647
// 출력 : 2147483648

// let num = Number(prompt("enter"));
// alert(num + 1)


// 📃 1045) 퀴즈
// 정수 2개 입력받아 자동 계산하기
// 첫 줄에 합
// 둘째 줄에 차,
// 셋째 줄에 곱,
// 넷째 줄에 몫,
// 다섯째 줄에 나머지,
// 입력 : 10 3
// 출력 : 13
// 7
// 30
// 3
// 1

// let num = prompt("enter").split(" ");
// let f = Number(num[0])
// let s = Number(num[1])

// let plus = (f + s) + "\n";
// let minus = (f - s) + "\n";
// let multipl = (f * s) + "\n";
// let division = parseInt(f / s) + "\n";  // 몫에 정수값만 내야함 parseInt 필요
// let rest = (f % s) + "\n";

// alert(plus + minus + multipl + division + rest)


// 📃 1046) 퀴즈
// 정수 3개 입력받아 합과 평균 출력하기
// 입력 : 1 2 3
// 출력 : 6
//       2.0
// TODO: 3개 값의 합/3 = 평균

// let num = prompt("enter").split(" ");
// 내 실수는 num[] 값에 일일이 숫자를 안주고 시작해서 안된거였음
// let f = Number(num[0])
// let s = Number(num[1])
// let t = Number(num[2])

// let sum = f + s + t;
// let avg = sum/3;

// alert(sum + "\n" +avg);



// 📃 1047) 퀴즈
// 정수 1개 입력받아 2배 곱해 출력하기(설명)
// 입력 : 1024
// 출력 : 2048

// let num = Number(prompt("enter")); // 1024
// alert(num * 2); // 2048


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

let num = Number(prompt("enter"));
if(num = "0"){
    alert("1")
} else{
    alert("0")
}