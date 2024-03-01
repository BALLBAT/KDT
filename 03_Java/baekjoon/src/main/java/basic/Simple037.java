package basic;

import java.util.Scanner;

/**
 * packageName : basic
 * fileName : Simple037
 * author : GGG
 * date : 2024-01-31
 * description : 5597	 과제 안 내신 분..?
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-01-31         GGG          최초 생성
 */
public class Simple037 {
    public static void main(String[] args) {
//        알고리즘 정리 :
//        0) 입력값 28개 입력, 그 중에 안불린 숫자가 과제 제출안한 사람 [제출자 28명]
//        1) 31개 배열에 미리 false 를 넣어둠, arr[0] -> 사용안함
//           0 ~ 30 생성 : 0 사용 안함 ( 1 ~ 30 : false )
//        2) 반복문 : 0 ~ 28 까지( 28은 제외 ) 실행 [제출자 28명의 출석번호]
//        3) 입력 받기 : 번호 -> arr[번호] = true;
//        4) arr[번호] 값에 false 인 값이 과제 제출 안한 사람

        Scanner scanner = new Scanner(System.in);
        boolean[] arr = new boolean[31];  // 과제배열

//      1) 31개 배열에 미리 false 넣기, arr[0] -> 사용안함
        for (int i = 0; i < 31; i++) {
            arr[i] = false;    // 미리 false 넣음
        }

//      2) 반복문 : 0 ~ 28 까지( 28은 제외 ) 실행
        for (int i = 0; i < 28; i++) {
            int num = scanner.nextInt();       // 출석번호(인덱스배열번호)
//          제출한 사람 true로 바꾸기
            arr[num] = true;
        }
        
//      배열 출력 : 제출한 사람 = true, 안한 사람 = false
        for (int i = 1; i <= 30; i++) { // 0번 안쓰니까 1 ~ 30
            if (arr[i] == false){
                System.out.println(i);  // 출석번호 == 배열의 인덱스 번호
            }
        }
    }
}
