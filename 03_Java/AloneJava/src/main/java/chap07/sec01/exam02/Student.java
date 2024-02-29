package chap07.sec01.exam02;

/**
 * packageName : chap07.sec01.exam02
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
public class Student extends People{
    public int studentNo; // 학번

    public Student(String name, String ssn, int studentNo) {
        super(name, ssn); // 부모 생성자(매개변수 2개)를 호출
        this.studentNo = studentNo; // 자식 속성
    }
}
