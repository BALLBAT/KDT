package chap04;

import java.util.Scanner;

/**
 * packageName : chap04
 * fileName : Verify01
 * author : ballbat
 * date : 2024-01-29
 * description : 종합 문제
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-01-29         ballbat          최초 생성
 */
public class Verify01 {
    public static void main(String[] args) {
        /**
         * 문자열 반복해서 출력하기
         * 입력 : string 5
         * 출력 : stringstringstringstringstring
         */
//        Scanner scanner = new Scanner(System.in);
//        String str = scanner.next(); // 1단어 입력 (string)
//        int num    = scanner.nextInt(); // 1정수 (5)

//      1) string 문자열을 5회 반복 + 줄바꿈 없이(print())
//        for (int i = 0; i < num; i++) {
//            System.out.print(str);
//        }

        /**
         * 대소문자 바꿔서 출력하기
         * 입력 : aBcDeFg
         * 출력 : AbCdEfG
         * TODO: 문자열.charAt(인덱스번호)
         * TODO: 문자열.toUpperCase()
         * TODO: 문자열.toLowerCase()
         */
//        Scanner scanner = new Scanner(System.in);
//        String str = scanner.next();   // aBcDeFg

//      str.length() : 문자열의 길이를 가져오는 함수
//        for (int i = 0; i < str.length(); i++) {
//          i=0 => temp = 'a'  => 'a' => 'A'(문자열.toUpperCase())
//          i=1 => temp = 'B'
//          ...
//          String.valueOf() : 정수, char, 실수 => 문자열 변환
//            char temp = str.charAt(i); // char 자료형 내보내기가 됨
//          String : 문자열 자료형 => equals, toLowerCase() = 문자열만 가능
//            String str2 = String.valueOf(temp);

//          i = 0 일때, str2 = "a" == (str2.toLowerCase() : "a") : true
//          i = 1 일때, str2 = "B" == (str2.toLowerCase() : "b") : false
//            if(str2.equals(str2.toLowerCase()) == true) {
//                대문자 바꿔서 바로 출력 (줄바꿈 없이) : print()
//                System.out.print(str2.toUpperCase());
//            } else {
//                소문자 바꿔서 바로 출력 : print()
//                str2 = "B" => str2.toLowerCase() ; "b"
//                System.out.print(str2.toLowerCase());
//            }
//        }


        /**
         * 문자열 돌리기
         * 입력 : abcde
         * 출력 :
         * a
         * b
         * c
         * d
         * e
         */
//       문자열.charAt(인덱스번호) : 문자 1개씩 뽑기 (char 자료형)
//       1) 입력값(문자열)을 1개씩 뽑아서 줄바꿈 해서 차례대로 출력 (반복문)

//        Scanner scanner = new Scanner(System.in);
//        String f = scanner.next(); // 1개 단어 : abcde

//        for (int i = 0; i < 5; i++) {
//            char temp = f.charAt(i);  // 0번쨰 문자
//          줄바꿈 해서 바로 출력
//            System.out.println(temp);
//        }
        /** 4)
         * 덧셈식 출력하기
         * 입력 : 4 5
         * 출력 : 4 + 5 = 9
         */

//        Scanner scanner = new Scanner(System.in);
//        int f = scanner.nextInt();
//        int s = scanner.nextInt();
//        System.out.println(f+" + "+s+" = "+(f+s));

        /** 5)
         * 문자열 붙여서 출력하기
         * 입력 : apple pen
         * 출력 : applepen
         */

//        Scanner scanner = new Scanner(System.in);
//        String f = scanner.next();
//        String s = scanner.next();
//        System.out.println(f+s);

        /** 6)
         * 홀짝 구분하기
         * 입력 : 100
         * 출력 : 100 is even
         */

//        Scanner scanner = new Scanner(System.in);
//        int i = scanner.nextInt();
//
//        if (i % 2 == 0){
//            System.out.println(i+" is even");
//        } else {
//            System.out.println(i+" is odd");
//        }

        /**
         * n의 배수
         * 정수 num과 n이 매개 변수로 주어질 때,
         * num이 n의 배수이면 1을 return n의 배수가 아니라면 0을 출력하세요
         *
         *  입력  98 2
         *  결과   1
         */

//        Scanner scanner = new Scanner(System.in);
//        int num = scanner.nextInt();
//        int n = scanner.nextInt();
//
//        if (num % n == 0){
//            System.out.println(1);
//        } else {
//            System.out.println(0);
//        }

        /**
         * 공배수
         * 정수 number와 n, m이 주어집니다.
         * number가 n의 배수이면서 m의 배수이면 1을 아니라면 0을 출력하세요
         *
         * 입력 60 2 3
         * 결과 1
         */

//        Scanner scanner = new Scanner(System.in);
//        int number = scanner.nextInt();
//        int n = scanner.nextInt();
//        int m = scanner.nextInt();
//
//        if (number % n == 0 && number % m == 0){
//            System.out.println(1);
//        } else {
//            System.out.println(0);
//        }


        /** 9)
         * flag에 따라 다른 값 반환하기
         * 두 정수 a, b와 boolean 변수 flag가 매개변수로 주어질 때,
         * flag가 true면 a + b를 false면 a - b를 return 하는 solution 함수를 작성해 주세요.
         *
         * 입력 -4 7 true
         * 결과  3
         */

//        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        boolean flag = scanner.nextBoolean();
//
//        if (flag == true){
//            System.out.println(a+b);
//        } else {
//            System.out.println(a-b);
//        }

        /**
         *  10) 두수 의 최대값 구하세요
         *  입력 : 10 100
         *  출력 : 100
         */

//        Scanner scanner = new Scanner(System.in);
//        int f = scanner.nextInt();
//        int s = scanner.nextInt();
//        System.out.println(Math.max(f,s));

//        Scanner scanner = new Scanner(System.in);
//        int f = scanner.nextInt();
//        int s = scanner.nextInt();
//        if(f > s) {
//            System.out.println(f);
//        } else {
//            System.out.println(s);
//        }

        /**
         * 11) 세수의 최소값 구하세요
         * 입력 : 10 20 30
         * 출력 : 10
         */

//      TODO: 수학함수 : Math.max(값, 값2), Math.min(값, 값2)
//        js에서는 여러 수 가능하나 여기선 2개의 값만 가능
//        so 변수 활용해서 사용

//        Scanner scanner = new Scanner(System.in);
//        int f = scanner.nextInt();
//        int s = scanner.nextInt();
//        int t = scanner.nextInt();
//        int min = 0;

//       TODO: 1번 풀이

//        if (f < s && f < t){
//            System.out.println(f);
//        } else if (s < f && s < t) {
//            System.out.println(s);
//        } else {
//            System.out.println(t);
//        }

//        TODO: 2번 풀이

//      1) 두수 판단 : 최소값 찾기
//        if (f < s){
//            min = f;
//        } else {
//            min = s;
//        }

//      2) min 과 t 비교 : 최소값 찾기
//        if (min < t){
//            System.out.println(min); // 세수의 최소값
//        } else {
//            System.out.println(t);  // 세수의 최소값
//        }

//        TODO: 3번 풀이 Math.min()
//        min = Math.min(f,s); // 두 수의 최소값
//        System.out.println(Math.min(min, t));




        /**
         * 12) 서로 다른 주사위 2개의 면의 개수 n, m이 공백을 두고 입력된다.
         * 단, n, m은 10이하의 자연수
         * 입력 : 2 3
         * 출력 :
         * 1 1
         * 1 2
         * 1 3
         * 2 1
         * 2 2
         * 2 3
         */

        Scanner scanner = new Scanner(System.in);
        int f = scanner.nextInt(); // 2
        int s = scanner.nextInt(); // 3

//      2, 3을 만족하는 모든 경우의 수 출력 : (1,1), (1,2), (1,3) ... (2,3)
        for (int i = 1; i <= f; i++) {
            for (int j = 1; j <= s; j++) {
                System.out.println(i + " " + j);
            }
        }

    }
}