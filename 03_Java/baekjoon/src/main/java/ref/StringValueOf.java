package ref;

/**
 * packageName : ref
 * fileName : StringValueOf
 * author : GGG
 * date : 2024-02-01
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-01         GGG          최초 생성
 */
public class StringValueOf {
    public static void main(String[] args) {
        char temp = 'A';
//        문자 -> 문자열로 변환
        String str = String.valueOf(temp);
        System.out.println(str); // "A"
//        정수 -> 문자열로 변환
        int num = 12;
        String str2 = String.valueOf(num);
        System.out.println(str2); // "12"
    }
}
