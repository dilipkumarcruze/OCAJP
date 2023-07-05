package practice;

public class Student {
    private String name;
    private int age;
    private String[] subjects;

    public Student(String name, int age, String[] subjects) {
        this.name = name;
        this.age = age;
        this.subjects = subjects;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Subjects: ");
        for (String subject : subjects) {
            System.out.println("- " + subject);
        }
    }

    public static void main(String[] args) {
        String[] subjects = {"Math", "Science", "English"};
        Student student = new Student("John Doe", 17, subjects);
        student.displayInfo();
    }
}
