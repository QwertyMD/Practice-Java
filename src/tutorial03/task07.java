package tutorial03;

class Triangle {
    float base, height;

    static float calcArea(float base, float height) {
        return 0.5f * base * height;
    }
}

public class task07 {
    float area;

    public static void main(String[] args) {
        task07 mainInstance = new task07();
        mainInstance.printArea();
    }

    public void printArea() {
        area = Triangle.calcArea(5, 10);
        System.out.println("Area: " + area);
    }
}
