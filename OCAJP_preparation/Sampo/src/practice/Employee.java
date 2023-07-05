package practice;
class Person {
    private String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    protected void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Employee extends Person {
    private double salary;

    public Employee(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    public void displaySalary() {
        displayInfo();
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        Employee employee = new Employee("John Doe", 30, 5000.0);
        employee.displaySalary();
    }
}
