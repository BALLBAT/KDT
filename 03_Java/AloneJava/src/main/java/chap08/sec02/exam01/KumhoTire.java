package chap08.sec02.exam01;

/**
 * packageName : chap08.sec02.exam01
 * fileName : KumhoTire
 * author : GGG
 * date : 2024-02-08
 * description : TODO: 자식 클래스 #1
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-08         GGG          최초 생성
 */
public class KumhoTire implements Tire{
    @Override
    public void roll() {
        System.out.println("금호 타이어가 굴러감");
    }
}
