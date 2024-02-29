package chap07.verify.exam06;

/**
 * packageName : chap07.verify.exam06
 * fileName : Student
 * author : GGG
 * date : 2024-02-06
 * description : TODO: 자식클래스
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-06         GGG          최초 생성
 */
public class Student extends Person {
    public Student(String name) {
        super(name);
    }

    String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}