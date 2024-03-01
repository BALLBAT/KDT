package basic;

import java.util.Scanner;

/**
 * packageName : basic
 * fileName : Simple045
 * author : GGG
 * date : 2024-02-01
 * description : 11720	 숫자의 합
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-01         GGG          최초 생성
 */
public class Simple045 {
    public static void main(String[] args) {
//       알고리즘 정리 :
//          0) 해석 : int(자료형) <-> char(자료형) 성질 이용
//             힌트 : 1) 입력값 : 숫자 -> 문자로 입력
//                   예) "123" -> '1' '2' '3'
//                      -> '1' -> "1" -> 1 (문자 -> 문자열 -> 숫자)
//                      -> '2' -> "2" -> 2 (문자 -> 문자열 -> 숫자)
//                      -> '3' -> "3" -> 3 (문자 -> 문자열 -> 숫자)
//                      sum = 1 + 2 + 3 => 출력
//                  문자열.charAt(인덱스번호), Integer.parseInt(문자열)
//                  String.valueOf(문자)

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt(); // 반복횟수 : 5
        String str = scanner.next(); // 문자열 입력값 : "54321"
        int sum = 0; // 자리수 합칠 변수

//        반복문 : 0 ~ num 까지
        for (int i = 0; i < num; i++) {
//            char 변수 = 문자열.charAt(인덱스번호); // 문자열 인덱스번호에 해당하는 1 문자 가져오기
            char temp = str.charAt(i); // 1문자 가져오기 : '5'
//            String 변수 = String.valueOf(문자); // 문자 -> 문자열 변환
            String strTemp = String.valueOf(temp);
//            int 변수 = Integer.parseInt(문자열); // 문자열 -> 숫자 변환
            int val = Integer.parseInt(strTemp);
//            자리수 합계 : 누적합 코드
            sum = sum + val;
        }
//        결과 : 누적합은 반복문 종료 후에 확인 : sum
        System.out.println(sum);


//        Scanner scanner = new Scanner(System.in);
//        int num = scanner.nextInt();
//        String a = scanner.next();
//        int sum = 0;
//
//        for (int i = 0; i < num; i++) {
//            sum += a.charAt(i)-'0';
//        }
//        System.out.println(sum);
    }
}
