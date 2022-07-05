package pojo;

public class Triangle extends Shape {
    final int height;
    final int bottom;

    public Triangle(int height, int bottom) {
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
