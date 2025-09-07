import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class FormattedOutput {
    public static void main(String[] args) {
        String fileName = "report.txt";

        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
            writer.println("Report Title: Student Scores");
            writer.printf("Student 1: Score = %d%n", 85);
            writer.printf("Student 2: Score = %d%n", 93);
            System.out.println("Data written to " + fileName);
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}