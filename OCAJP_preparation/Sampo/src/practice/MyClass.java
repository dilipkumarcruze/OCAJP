package practice;

//Access modifiers example
public class MyClass {
    private int privateVar;
    protected int protectedVar;
    int defaultVar;
    public int publicVar;
}

public class Main {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        // Accessible within the class
        obj.privateVar = 10;
        obj.protectedVar = 20;
        obj.defaultVar = 30;
        obj.publicVar = 40;
        
        // Accessible outside the class
        System.out.println(obj.publicVar);
    }
}
