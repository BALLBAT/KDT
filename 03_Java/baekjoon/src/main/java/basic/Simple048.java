package basic;

import java.util.Scanner;

/**
 * packageName : basic
 * fileName : Simple048
 * author : GGG
 * date : 2024-02-01
 * description : 1152	 단어의 개수
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-01         GGG          최초 생성
 */
public class Simple048 {
    public static void main(String[] args) {
//       알고리즘 정리 :
//          0) 해석 : 입력값 -> 1라인 으로 입력받기
//            -> 1) 앞/뒤로 공백이 있을수 있음 : 문자열.trim() 사용
//            -> 2) .split(" ") -> 잘린단어가 배열
//            -> 배열의 개수 세기 : "", " " -> 제외하고 세기
//        Scanner scanner = new Scanner(System.in);
//        int S = scanner.nextInt();
//        int[] arr = new int[S];
//        String ss = String.valueOf(S);
//        ss.trim();
//        ss.split(" ");
//        int count = 0;
//
//        for (int i = 0; i < arr.length; i++) {
//            count = count+i;
//        }
//        System.out.println(count);

        Scanner scanner = new Scanner(System.in);
//        1줄 입력 : .trim().split(" ")
//        nextLine() : 한줄로 입력 받기 : 공백 제거 후 자르기
        String[] str = scanner.nextLine().trim().split(" ");

//      The Curious Case of Benjamin Button
//      str[0] : "", str[1] : The, ...
//      str[0] : " "
        if (str[0].equals("") || str[0].equals(" ")){
            System.out.println(0);
        } else {
            System.out.println(str.length);
        }
    }
}
