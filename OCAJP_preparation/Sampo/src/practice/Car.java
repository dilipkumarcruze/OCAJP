package practice;


// Class and Object
public class Car {
    String brand;
    int year;

    public void startEngine() {
        System.out.println("Engine started!");
    }

    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.brand = "Toyota";
        myCar.year = 2021;
        myCar.startEngine();
        System.out.println("Brand: " + myCar.brand);
        System.out.println("Year: " + myCar.year);
    }
}
