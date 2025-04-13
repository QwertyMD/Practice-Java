package tutorial03;

class Student {
    private String name;
    private int id, age;

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class task08 {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Ali Baba");
        student.setId(007);
        student.setAge(33);
        System.out.println("Name: " + student.getName());
        System.out.println("ID: " + student.getId());
        System.out.println("Age: " + student.getAge());
    }
}
