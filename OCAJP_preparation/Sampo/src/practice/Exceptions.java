package practice;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Exceptions {
    public static void main(String[] args) {
        // Checked exception example
        try {
            FileReader file = new FileReader("file.txt");
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }
        
        // Unchecked exception example
        int num1 = 10;
        int num2 = 0;
        try {
            int result = num1 / num2;
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero!");
        }
    }
}
