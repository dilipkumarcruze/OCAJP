package practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CSVFileHandler {
    public static void main(String[] args) {
        String inputFile = "input.csv";
        String outputFile = "output.csv";

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {

            String line;
            while ((line = reader.readLine()) != null) {
                String[] values = line.split(",");
                // Process the values or perform any necessary operations
                // ...

                // Write the processed values to the output file
                String outputLine = String.join(",", values);
                writer.write(outputLine);
                writer.newLine();
            }

            System.out.println("CSV file processing completed.");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
