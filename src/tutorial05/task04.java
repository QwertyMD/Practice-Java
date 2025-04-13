package tutorial05;

interface Employee {
    void printEmployeeId();

    void printSalary();
}

class Manager implements Employee {
    @Override
    public void printEmployeeId() {
        System.out.println("Manager ID: 123");
    }

    public void printSalary() {
        System.out.println("Manager Salary: 10000");
    }
}

class Developer implements Employee {
    @Override
    public void printEmployeeId() {
        System.out.println("Developer ID: 456");
    }

    public void printSalary() {
        System.out.println("Developer Salary: 5000");
    }

}

public class task04 {
    public static void main(String[] args) {
        Manager manager = new Manager();
        Developer developer = new Developer();
        manager.printEmployeeId();
        manager.printSalary();
        developer.printEmployeeId();
        manager.printSalary();
    }
}
