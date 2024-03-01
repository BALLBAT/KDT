package basic;

import java.util.Arrays;
import java.util.Scanner;

/**
 * packageName : basic
 * fileName : Simple038
 * author : GGG
 * date : 2024-01-31
 * description : 3052	 나머지
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-01-31         GGG          최초 생성
 */
public class Simple038 {
    public static void main(String[] args) {
//  알고리즘 정리 :
//        0) 입력값이 10개 입력된다. 각 입력값을 42로 나눈 나머지가 몇개인지 출력
//        (단, 중복된 값은 세지 않는다.)
//        1) 10개짜리 정수 배열 준비 : -1을 모두 넣어둔다.
//        2) 반복문 : 0 ~ 10 까지 반복(10 제외)
//        2-1) 입력 값 1개 받기
//        2-2) find 참/거짓 값 준비 : false 넣어두기
//        2-3) 반복문 #2 : 0 ~ 배열 크기만큼 실행
//        2-3-1) 배열값을 순차적으로 입력값%42와 비교해서 값이 있으면
//               find = true 로 변경
//        2-4) find 값이 false 일때만 배열[인덱스번호] = 입력 값 % 42;
//        (why? find 값이 true 이면 중복된 값이 배열에 있기 때문에 다시 넣으면 안됨)

//        3) count 변수 준비 : 0 넣어두기
//        4) 출력 : 배열의 값 중 -1 보다 큰 수일 경우 count 1 증가
//        5) count 수 출력 : 나머지 개수

        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10]; // 10개짜리 정수 배열
        for (int i = 0; i < arr.length; i++) { // 입력값에 -1 넣기
            arr[i] = -1; // why? 나머지는 음수가 없음
        }

        for (int i = 0; i < arr.length; i++) { // 0 ~ 10 까지 반복문
            int num = scanner.nextInt(); // 번호 : 10개 번호 입력 받기
            boolean bfind = false; // 중복된 값 찾으면 true 로 바뀜

//          2-4) 반복문 #2 : 0 ~ 배열크기만큼 실행 : 중복된 값 체크를 위해
            for (int j = 0; j < arr.length; j++) {
                if(arr[j] == num%42){
                  bfind = true;         // 중복값이 있음을 표시
                }
            }

            if(bfind != true){
                arr[i] = num%42;        // 42로 나눈 나머지가 arr 배열에 들어감
            }

        }

//      디버깅 : 변수 출력 : 배열 출력 : Arrays.toString(배열)
//        System.out.println(":::" + Arrays.toString(arr));

        int count = 0;       // 나머지 개수 세기 변수
//      arr 배열에 나머지 개수 세기
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != -1){
                count = count + 1;     // 1 증가 하기 (나머지 세기)
            }
        }
//      출력
        System.out.println(count);
    }
}
