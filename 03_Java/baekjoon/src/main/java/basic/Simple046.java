package basic;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * packageName : basic
 * fileName : Simple046
 * author : GGG
 * date : 2024-02-01
 * description : 10809	 알파벳 찾기
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-01         GGG          최초 생성
 */
public class Simple046 {
    public static void main(String[] args) {
//       알고리즘 정리 :
//          0) 해석 : 26개 배열 :
//             - 0번인덱스 : a 를 의미 가정
//             - 1번인덱스 : b 를 의미 가정
//               ...
//          1) 문자열에서 1개 문자를 가져온 후 그 문자가 b 이면
//              1번인덱스에 문자열에서 그문자가 위치한 인덱스번호를 넣어줌
//             예) "cd" -> c:0번, d:1번 (문자열 위치)
//                 배열 3번 : 0, 배열 4번 : 1
//             힌트 : 문자열.indexOf('문자') 함수 : 문자열에서 그문자의 위치를 찾아줌
//                  예) "abc" -> abc.indexOf("a") -> 0이 결과로 나옴
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next(); // 문자열 : baekjoon 입력받음

        ArrayList<Integer> list = new ArrayList<>();

//        향상된 배열 : 초기화 : -1 (26개 방)
        for (int i = 0; i < 26; i++) {
            list.add(-1); // -1 (26개 방)
        }

//        체크 : baekjoon 문자열 길이 만큼 반복문 실행
//          -> b방 : [0], a방 : [1], e방 : [2], k방 : [3], ...
//          -> 배열 : 26개(0:a방, 1:b방, 2:c방, ...)
//          -> 1) 트릭 : arr[0] => a
//          ->        : arr[입력값-97] => a
//          -> a : 97, b : 98, c : 99, ...
//          -> 2) 문자열.indexOf() 사용
        for (int i = 0; i < str.length(); i++) {
            char temp = str.charAt(i); // 1개 문자 가져오기 : 'b'(baekjoon의 b)
//          1개 문자의 아스키코드가 필요
            int num = temp;   // temp의 아스키코드 (걍 변수 하나 만들어서 쑤시기)
//          향상된 배열 값 수정 : 인덱스번호(num-97), 값(문자열에서 찾은 위치)
            list.set(num-97, str.indexOf(temp));
        }

//        향상된 배열 출력 : 값 값1 값2 ...
//        배열.length == list.size(); // 배열의 크기
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+" ");
        }

    }
}
