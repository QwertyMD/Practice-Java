package workshop04.section01;

class Person {
    protected String address;

    public Person(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }
}

class Employee extends Person {
    String department;

    public Employee(String address, String department) {
        super(address);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }
}

public class quest04 {
    public static void main(String[] args) {
        Employee employee = new Employee("NYC Street", "Engineering");
        System.out.println("Address: " + employee.getAddress());
        System.out.println("Department: " + employee.getDepartment());
    }
}