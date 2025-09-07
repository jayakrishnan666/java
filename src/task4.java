import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class UserInputToFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fileName = "user_input.txt";

        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
            System.out.print("Enter line 1: ");
            writer.println(scanner.nextLine());

            System.out.print("Enter line 2: ");
            writer.println(scanner.nextLine());

            System.out.print("Enter line 3: ");
            writer.println(scanner.nextLine());
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }

        System.out.println("Wrote input to " + fileName);
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