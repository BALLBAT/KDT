package chap07.verify.exam12;

/**
 * packageName : chap07.verify.exam12
 * fileName : StockGraph
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
public class StockGraph extends Graph{
    public StockGraph() {
    }

    @Override
    public void draw() {
        System.out.println("주가변경 추이를 그립니다.");
    }
}
