package chap12.sec01.exam09;

/**
 * packageName : chap12.sec01.exam09
 * fileName : SubStringApplication
 * author : GGG
 * date : 2024-02-15
 * description : TODO: String 클래스 함수 : substring()
 * 요약 :
 * TODO: 1) 사용법 : 문자열.substring(시작 인덱스, 끝 인덱스+1)
 *       => return 값 : 시작 ~ 끝-1까지 부분 문자열 출력
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-15         GGG          최초 생성
 */
public class SubStringApplication {
    public static void main(String[] args) {
        String ssn = "123456-1234567";

//      주민번호 앞자리만 출력하기
        String str = ssn.substring(0, 6); // 0부터 (6-1)까지 잘림
        System.out.println(str); // 123456
    }
}
