package ref;

/**
 * packageName : ref
 * fileName : StringIndexOf
 * author : GGG
 * date : 2024-02-01
 * description : 문자열에서 특정 문자의 위치(인덱스번호) 찾기 함수
 *         특징 : 만약 중복된 문자가 있다면 1번째 문자만 찾아줌
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-01         GGG          최초 생성
 */
public class StringIndexOf {
    public static void main(String[] args) {
//       예제 : 문자열에서 c가 위치한 인덱스번호를 출력
        String str = "abcde";
        int pos = str.indexOf("c"); // 2
        System.out.println(pos); // 2
//       참고) 못찾을 경우 : -1이 나옴
        int pos2 = str.indexOf("z"); // -1
        System.out.println(pos2); // -1
    }
}
