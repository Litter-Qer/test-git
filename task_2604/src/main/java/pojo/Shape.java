package pojo;

public class Shape {
    private char align;

    private char label;

    public Shape() {
    }

    public char getAlign() {
        return align;
    }

    public void setAlign(char align) {
        this.align = align;
    }

    public char getLabel() {
        return label;
    }

    public void setLabel(char label) {
        this.label = label;
    }

    public void print(){
        System.out.println("printing...");
    }
}