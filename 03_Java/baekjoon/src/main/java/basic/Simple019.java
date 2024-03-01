package basic;

import java.util.Scanner;

/**
 * packageName : basic
 * fileName : Simple019
 * author : GGG
 * date : 2024-01-30
 * description : 2525	 오븐 시계
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-01-30         GGG          최초 생성
 */
public class Simple019 {
    public static void main(String[] args) {
//      시간 표현 : 1) 분에 대해 이전 시간 계산 :
//                   (1) 분 + 요리시간 < 60 : 현재시간 + 요리시간 결과값 그대로 출력
//                       예) 10시 10분(입력값) + 20분 = 10시 30분
//                        => 시(그대로 출력) , 분(그대로출력)
//                   (2) 분 + 요리시간 >= 60 :
//                       2-1) 시간 수정 :
//                             시간 = 시 + ( 분 + 요리시간(분))/60
//                       ,     분   = (분 + 요리시간(분))%60
//                       *) 시간 계산(1) : (분 + 요리시간(분))/60 = 180/60 = 3시간
//                       *) 분 계산(2)   : (분 + 요리시간(분))%60 = 180%60 = 0분
//                   (3) 시간 계산 수정 : 총시간(분 + 요리시간) > 23
//                              총시간(분 + 요리시간) - 24;
//                        예시) 총시간 26시간 > 23 => 26 - 24 = 2
        Scanner scanner = new Scanner(System.in);

        int hour   = scanner.nextInt();     // 시간
        int minute = scanner.nextInt();     // 분
        int cook   = scanner.nextInt();     // 요리시간

        int minUpdate = minute + cook;      // 분 + 요리시간
//        분 + 요리시간 < 60
        if(minUpdate < 60) {
            // 현재시간 + 요리시간 결과값 그대로 출력
            System.out.println(hour + " " + minUpdate);
        } else {
            //  분 + 요리시간 >= 60
//          2-1) 시간 수정 :
//               시간 = 시 + ( 분 + 요리시간(분))/60 : (시간)
//               분   = (분 + 요리시간(분))%60      : (분)
            int hourUpdate = hour + (minUpdate/60);  // 시간
            minUpdate      = minUpdate % 60       ;  // 분

            if(hourUpdate > 23) {
//                시간 = 시간 - 24;
                hourUpdate = hourUpdate - 24;
            }
//        결과 출력
            System.out.println(hourUpdate + " " + minUpdate);
        }
    }
}
