package chap07.verify.exam09;

/**
 * packageName : chap07.verify.exam09
 * fileName : DeskTop
 * author : GGG
 * date : 2024-02-07
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-07         GGG          최초 생성
 */
public class DeskTop extends Computer{
    public DeskTop() {
    }

    @Override
    public void display() {
        System.out.println("DeskTop Display()");
    }

    @Override
    public void typing() {
        System.out.println("DeskTop Typing()");
    }
}
