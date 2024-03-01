package basic;

import java.util.Scanner;

/**
 * packageName : basic
 * fileName : Simple047
 * author : GGG
 * date : 2024-02-01
 * description : 2675	 문자열 반복
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-01         GGG          최초 생성
 */
public class Simple047 {
    public static void main(String[] args) {
//      알고리즘 정리 :
//        0) 해석 : 문자 반복 횟수 입력 값,
//            문자열의 각 문자를 문자 반복 횟수 만큼 문자열 붙이기 하고 출력
//        예) 3 "abc" > "aaa" + "bbb" + "ccc" 임
//      힌트 : 문자.repeat(반복횟수) : 문자를 반복시켜주는 함수
//        Scanner scanner = new Scanner(System.in);
//        int T = scanner.nextInt(); // 테스트 케이스 개수

//        for (int i = 0; i < T; i++) { // 테스트 돌리는 반복문
//            int R = scanner.nextInt(); // 반복 횟수
//            String S = scanner.next(); // 문자열
//            for (int j = 0; j < S.length(); j++) { // 문자열 길이만큼 반복
//                for (int k = 0; k < R; k++) { // 반복 횟수 입력값 만큼 반복
//                    System.out.print(S.charAt(j));
//                }
//            }
//            System.out.println();
//    }
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt(); // 반복 횟수(반복문) : 2

//      반복문 : 0 ~ num 까지 실행
        for (int i = 0; i < num; i++) {
            int repeatNum = scanner.nextInt(); // 1개 문자 반복 횟수 : 3
            String str = scanner.next(); // 반복할 문자열 입력 : ABC
            String result = ""; // 완성될 문자열 (""는 초기화값)

//      반복문 #2 : 반복할 문자열의 길이만큼 반복
            for (int j = 0; j < str.length(); j++) {
//              1개 문자 가져오기 : ABC
                char temp = str.charAt(j); // 'A'
//              문자열.repeat(반복횟수) 적용
                String strTemp = String.valueOf(temp).repeat(repeatNum); // 'A' -> "A" -> "AAA"

//              누적 문자열 만들기 : result = result + "누적문자열"
//              j = 0 일때 result = "AAA"
//              j = 1 일때 result = "AAA" + "BBB"
//              j = 3 일때 result = "AAA" + "BBB" + "CCC"
                result = result + strTemp; // (반복문 끝 : "AAABBBCCC")
            }
            System.out.println(result);
        }

    }
}
