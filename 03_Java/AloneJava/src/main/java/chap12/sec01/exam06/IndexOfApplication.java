package chap12.sec01.exam06;

/**
 * packageName : chap12.sec01.exam06
 * fileName : IndexOfApplication
 * author : GGG
 * date : 2024-02-15
 * description : TODO: String 클래스 함수 : indexOf()
 * 요약 :
 * TODO: 1) 사용법 : 문자열.indexOf("찾을 문자열")
 *          => return 값 : 문자열이 시작하는 인덱스번호
 *          => 못 찾을 경우 : -1이 결과로 나옴
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-15         GGG          최초 생성
 */
public class IndexOfApplication {
    public static void main(String[] args) {
        String subject = "자바 프로그램";

//      프로그램의 위치(인덱스 번호) 출력
        int pos = subject.indexOf("프로그램");
        System.out.println(pos); // 3
    }
}
