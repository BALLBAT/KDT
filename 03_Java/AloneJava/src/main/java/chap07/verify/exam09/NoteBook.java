package chap07.verify.exam09;

/**
 * packageName : chap07.verify.exam09
 * fileName : NoteBook
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
public class NoteBook extends Computer{
    public NoteBook() {
    }

    @Override
    public void display() {
        System.out.println("NoteBook Display()");
    }

    @Override
    public void typing() {
        System.out.println("NoteBook Typing()");
    }
}
