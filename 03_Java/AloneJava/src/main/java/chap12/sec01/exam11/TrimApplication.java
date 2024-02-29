package chap12.sec01.exam11;

/**
 * packageName : chap12.sec01.exam11
 * fileName : TrimApplication
 * author : GGG
 * date : 2024-02-15
 * description : TODO: String 클래스 함수 : trim()
 * 요약 :
 * TODO: 1) 사용법 : 문자열.trim()
 *           => return 값 : 양쪽 공백 제거된 문자열
 *           => 중간의 공백은 제거하지 않음
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-15         GGG          최초 생성
 */
public class TrimApplication {
    public static void main(String[] args) {
        String tel = " 02";
        String tel2 = " 02 ";
        String tel3 = " 0 2 ";

        System.out.println(tel.trim()); // 02
        System.out.println(tel2.trim()); // 02
        System.out.println(tel3.trim()); // 0 2
    }
}
