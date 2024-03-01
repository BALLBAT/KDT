import java.util.Scanner;

/**
 * packageName : PACKAGE_NAME
 * fileName : Practice
 * author : GGG
 * date : 2024-02-19
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-19         GGG          최초 생성
 */
public class Practice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a > b && b > c && a > c) {
            System.out.println(a+" "+b+" "+c);
        }
    }
}
