package pojo;

public class Trapezoid extends Shape{
    private int height;
    private int top;
    private int bottom;

    public Trapezoid(int height, int top, int bottom) {
        super();
        this.height = height;
        this.top = top;
        this.bottom = bottom;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getTop() {
        return top;
    }

    public void setTop(int top) {
        this.top = top;
    }

    public int getBottom() {
        return bottom;
    }

    public void setBottom(int bottom) {
        this.bottom = bottom;
    }

    @Override
    public void print() {
        super.print();
    }
}
