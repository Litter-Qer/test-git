import org.junit.Test;
import pojo.Square;
import pojo.Triangle;

public class LoopPrintTest {
    final char LABEL = '*';           //打印的标识
    final char[] aligns = {'l','r'};  //三种对齐方式
    @Test
    public void envTest(){
        assert true;
        System.out.println("This test does nothing but checking the running env.");
    }

    @Test
    public void printSquareTest()
    {
        System.out.println("This test should print a square underneath");
        int SIDE = 5;                   //边长

        Square sq = new Square(SIDE);
        for (char align: aligns) {
            sq.setAlign(align);
            sq.setLabel(LABEL);
            LoopPrint.printShape(sq);
        }
    }
    @Test
    public void printTriangleTest()
    {
        System.out.println("This test should print a square underneath");
        final int HEIGHT = 4;

        Triangle sq = new Triangle(HEIGHT);
        for (char align: aligns) {
            sq.setAlign(align);
            sq.setLabel(LABEL);
            LoopPrint.printShape(sq);
        }
    }
}
