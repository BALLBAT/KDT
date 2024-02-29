package chap12.sec01.exam05;

/**
 * packageName : chap12.sec01.exam05
 * fileName : StringCharAtApplication
 * author : GGG
 * date : 2024-02-15
 * description : TODO: (*) String 함수들 : charAt()
 * 요약 :
 * TODO: 1) 사용법 : 문자열.charAt(인덱스번호)
 *          => return 값 : 1개 문자 (char)
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-15         GGG          최초 생성
 */
public class StringCharAtApplication {
    public static void main(String[] args) {
        String ssn = "123456-1234567";

//      주민번호 뒷자리 첫 문자를 출력
        System.out.println(ssn.charAt(7)); // 1
    }
}
