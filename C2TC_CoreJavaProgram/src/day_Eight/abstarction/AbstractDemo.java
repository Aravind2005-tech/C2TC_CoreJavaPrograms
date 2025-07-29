package day_Eight.abstarction;


abstract class Shape {
    abstract void calArea();
    abstract void show();
}

// Square class
class Square extends Shape {
    private float side;
    private float area;

    public Square() {
        this.side = 1.0f;
    }

    public Square(float side) {
        this.side = side;
    }

    @Override
    void calArea() {
        area = side * side;
    }

    @Override
    void show() {
        System.out.println("Square Side: " + side + ", Area: " + area);
    }
}
class MyRectangle extends Shape {
    private int length;
    private int breadth;
    private int area;

    public MyRectangle() {
        this.length = 1;
        this.breadth = 1;
    }

    public MyRectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    void calArea() {
        area = length * breadth;
    }

    @Override
    void show() {
        System.out.println("Rectangle Length: " + length + ", Breadth: " + breadth + ", Area: " + area);
    }
}

public class AbstractDemo {
    public static void main(String[] args) {
        Square sq = new Square();
        MyRectangle r1 = new MyRectangle();
        sq.calArea();
        sq.show();
        r1.calArea();
        r1.show();
	}
}
}