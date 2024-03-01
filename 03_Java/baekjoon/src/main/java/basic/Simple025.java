package basic;

import java.util.Scanner;

/**
 * packageName : basic
 * fileName : Simple025
 * author : GGG
 * date : 2024-01-30
 * description : 25314	 코딩은 체육과목 입니다
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-01-30         GGG          최초 생성
 */
public class Simple025 {
    public static void main(String[] args) {
//    알고리즘 정리 :
//       1) 개수 입력받기 : 4의 배수임
//          -> 4(4*1)일때 long 1개 붙임
//          -> 8(4*2)일때 long 2개 붙임
//          -> 12(4*3)일때 long 3개 붙임
//             ...
//       2) 0 ~ 개수/4  까지 반복문 실행
//          문자열 붙이기를 계속 실행함
//       3) 최종 문자열 붙이기 결과 + "int" 출력함

        //       샘플 코드 : 반복문 이용 문자열 붙이기
//        String result = "";
//        for (int i = 0; i < 3; i++) {
//            result = result + "long "; // 누적 문자열
//        }
//        System.out.println(result);


        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt(); // 개수
        String result = ""; // 문자열 누적합 할 때에는 빈 문자열 = 누적 문자열

//      2) 0 ~ 개수/n 까지 반복문 실행 : 반복문 횟수 만큼 long 문자열 붙이기
        for (int i = 0; i < num/4; i++) {
//            result = "longonglong"
            result = result + "long ";
        }
        System.out.println(result+ "int");
    }
}
