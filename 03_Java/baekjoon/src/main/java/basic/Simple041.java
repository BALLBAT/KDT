package basic;

import java.util.Scanner;

/**
 * packageName : basic
 * fileName : Simple041
 * author : GGG
 * date : 2024-01-31
 * description : 27866	 문자와 문자열
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-01-31         GGG          최초 생성
 */
public class Simple041 {
    public static void main(String[] args) {
//        알고리즘 정리 :
//        0) 해석 : 입력 문자열에 자리수에 해당하는 문자 출력
//           문자열에 해당 인덱스번호의 문자 가져오기 함수 : 문자열.charAt(인덱스번호)
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();     // 문자열 입력값 : Sprout
        int i = scanner.nextInt()-1;   // 자리수 입력값 : 3-1 -> 2(인덱스번호)

//        문자열에서 자리수에 해당하는 문자 가져오기
        char result = S.charAt(i);
//        출력
        System.out.println(result);

//        for (int j = 0; j <= i; j++) {
//        }
//        char A = S.charAt(i-1);
//        System.out.println(A);
    }
}
