package tutorial04;

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Employee extends Person {
    int employeeId;

    public Employee(String name, int age, int employeeId) {
        super(name, age);
        this.employeeId = employeeId;
    }
}

public class quest01_02 {
    public static void main(String[] args) {
        quest01_02 quest = new quest01_02();
        quest.printDetails();
    }

    public void printDetails() {
        Employee employee = new Employee("Jordan", 33, 123);
        System.out.println("EmployeeId: " + employee.employeeId);
        System.out.println("Name: " + employee.name);
        System.out.println("Age: " + employee.age);
    }
}
