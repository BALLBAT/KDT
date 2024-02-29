package chap07.verify.exam02;

/**
 * packageName : chap07.verify.exam02
 * fileName : Point
 * author : GGG
 * date : 2024-02-06
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-06         GGG          최초 생성
 */
public class Point {
    int x;
    int y;

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    void showPoint(){
        System.out.println("(" + x + "," + y + ")");
    }
}
