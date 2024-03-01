package basic;

import java.util.Scanner;

/**
 * packageName : basic
 * fileName : Simple031
 * author : GGG
 * date : 2024-01-30
 * description : 10807	 개수 세기
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-01-30         GGG          최초 생성
 */
public class Simple031 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);            // 객체 생성

        int num = Integer.parseInt(scanner.nextLine());      // 개수입력(반복횟수)
        String[] input = scanner.nextLine().split(" "); // 문자열 입력
        int findNum = Integer.parseInt(scanner.nextLine());  // 찾을 숫자 입력

        int count = 0;                                       // 찾은 개수 변수

//      num 까지 반복해서 찾을숫자(2) 가 있는것을 세기 : count 변수에 저장
        for (int i = 0; i < num; i++) {
            int temp = Integer.parseInt(input[i]); // 문자열숫자 -> 숫자 변경

            if(temp == findNum) {
                count = count + 1;                 // 찾으면 1증가
            }
        }

        System.out.println(count);                  // 결과 출력(찾은 개수)
    }

}
