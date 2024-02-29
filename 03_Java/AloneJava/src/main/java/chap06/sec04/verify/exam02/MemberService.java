package chap06.sec04.verify.exam02;

/**
 * packageName : chap06.sec04.verify.exam02
 * fileName : MemberService
 * author : GGG
 * date : 2024-02-05
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-05         GGG          최초 생성
 */
public class MemberService {
    void login(String id, String password){
        if (id.equals("hong") && password.equals("12345")){
            System.out.println("로그인 되었습니다.");
        } else {
            System.out.println("id 또는 password가 올바르지 않습니다.");
        }
    }
}
