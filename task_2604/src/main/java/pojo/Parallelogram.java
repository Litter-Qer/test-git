package pojo;

public class Parallelogram extends Shape {
    final private int height;
    final private int bottom;

    public Parallelogram(int height, int bottom) {
        super();
        this.height = height;
        this.bottom = bottom;
    }

    public int getHeight() {
        return height;
    }

    public int getBottom() {
        return bottom;
    }

    @Override
    public void print() {
        super.print();
    }
}
