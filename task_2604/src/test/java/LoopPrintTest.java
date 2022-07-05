import org.junit.Test;
import pojo.Square;

public class LoopPrintTest {
    @Test
    public void envTest(){
        assert true;
        System.out.println("This test does nothing but checking the running env.");
    }

    @Test
    public void printSquareTest()
    {
        System.out.println("This test should print a square underneath");
        char[] aligns = {'l','m','r'};  //三种对齐方式
        int side = 1;                   //边长
        Square sq = new Square(side);

        for (char align: aligns) {
            sq.setAlign(align);
            LoopPrint.printShape(sq);
        }

    }

}
