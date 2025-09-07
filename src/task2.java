import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WriteReadTextFile {
    public static void main(String[] args) {
        String fileName = "welcome.txt";

        // Writing to the file
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write("Welcome to Java File I/O!\n");
            System.out.println("Wrote to file: " + fileName);
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }

        // Reading from the file
        System.out.println("Reading from file: " + fileName);
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line = reader.readLine();
            while (line != null) {
                System.out.println("From file: " + line);
                line = reader.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
    }
}