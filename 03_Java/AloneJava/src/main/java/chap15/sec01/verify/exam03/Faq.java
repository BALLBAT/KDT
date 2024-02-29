package chap15.sec01.verify.exam03;

/**
 * packageName : chap15.sec01.verify.exam03
 * fileName : Faq
 * author : GGG
 * date : 2024-02-13
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-13         GGG          최초 생성
 */
public class Faq {
    public int fid;
    public String subject;
    public String text;

    public Faq(int fid, String subject, String text) {
        this.fid = fid;
        this.subject = subject;
        this.text = text;
    }

    public int getFid() {
        return fid;
    }

    public String getSubject() {
        return subject;
    }

    public String getText() {
        return text;
    }
}
