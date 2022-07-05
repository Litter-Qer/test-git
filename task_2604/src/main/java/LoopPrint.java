import pojo.Shape;

public class LoopPrint {
    /**
     * 决定打印的图形类型和对齐方式，将参数传到print里面
     * @param shape 一个图形对象
     */
    public static void printShape(Shape shape){
        shape.print();
    }
}
