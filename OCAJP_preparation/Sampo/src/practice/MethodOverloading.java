package practice;

class Shape {
    public void draw() {
        System.out.println("Drawing a shape");
    }
}

class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
    
    public void draw(int radius) {
        System.out.println("Drawing a circle with radius " + radius);
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        Shape shape = new Circle();
        shape.draw();
        
        Circle circle = new Circle();
        circle.draw(5);
    }
}

