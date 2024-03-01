package basic;

import java.util.Scanner;

/**
 * packageName : basic
 * fileName : Simple043
 * author : GGG
 * date : 2024-01-31
 * description : 9086	 문자열
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-01-31         GGG          최초 생성
 */
public class Simple043 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        for (int i = 0; i < num; i++) {
            String word = scanner.next();
            String s = String.valueOf(word.charAt(0));
            String f = String.valueOf(word.charAt(word.length()-1));
            System.out.println(s+f);
        }
    }
}
