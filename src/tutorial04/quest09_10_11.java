package tutorial04;

class Shape {
    String color;
    int area;

    public Shape(String color) {
        this.color = color;
    }

    public int area() {
        return area;
    }
}

class Rectangle extends Shape {
    int length, width;

    public Rectangle(String color, int length, int width) {
        super(color);
        this.length = length;
        this.width = width;
        area = length * width;
    }
}

public class quest09_10_11 {
    public static void main(String[] args) {
        quest09_10_11 quest = new quest09_10_11();
        quest.printRect();
    }

    public void printRect() {
        Rectangle rect = new Rectangle("Red", 5, 6);
        System.out.println("Color: " + rect.color);
        System.out.println("Area: " + rect.area());
    }
}
