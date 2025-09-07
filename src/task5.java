import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class SummationToFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fileName = "sum.txt";
        int sum = 0;

        System.out.println("Enter 5 integers:");

        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter integer " + i + ": ");
            int num = scanner.nextInt();
            sum += num;
        }

        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
            writer.println("Sum = " + sum);
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }

        System.out.println("Sum written to " + fileName);
        System.out.println("Reading file contents:");

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line = reader.readLine();
            while (line != null) {
                System.out.println(line);
                line = reader.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }

        scanner.close();
    }
}