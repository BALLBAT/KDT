package chap07.verify.exam10;

/**
 * packageName : chap07.verify.exam10
 * fileName : Dog
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
public class Dog extends Animal{
    public Dog() {
    }

    @Override
    void crying() {
        System.out.println("멍멍!!!");
    }
}
