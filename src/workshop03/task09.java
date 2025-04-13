package workshop03;

class Box {
    int width, height, depth;

    public Box(int length) {
        this.width = length;
        this.height = length;
        this.depth = length;
    }

    public Box(int width, int height, int depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public Box() {
        this.width = 10;
        this.height = 8;
        this.depth = 12;
    }

    public void getVolume() {
        int volume = width * height * depth;
        System.out.println("Volume: " + volume);
    }
}

public class task09 {
    Box cube = new Box(5);
    Box cuboid = new Box(5, 10, 15);
    Box defaultBox = new Box();

    public static void main(String[] args) {
        task09 mainInstance = new task09();
        mainInstance.getVolume();
    }

    public void getVolume() {
        cube.getVolume();
        cuboid.getVolume();
        defaultBox.getVolume();
    }
}
