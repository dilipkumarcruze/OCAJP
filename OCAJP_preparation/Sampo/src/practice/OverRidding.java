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
    
    public void draw(int radius, String color) {
        System.out.println("Drawing a " + color + " circle with radius " + radius);
    }
}

public class OverRidding {
    public static void main(String[] args) {
        Shape shape = new Circle();
        shape.draw();
        
        Circle circle = new Circle();
        circle.draw(5);
        circle.draw(8, "red");
    }
}
