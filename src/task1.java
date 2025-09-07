import java.io.File;
import java.util.Scanner;

public class FileExistenceChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the filename: ");
        String fileName = scanner.nextLine();

        File file = new File(fileName);

        System.out.println("File name: " + file.getName());
        System.out.println("File exists: " + file.exists());
        System.out.println("Absolute path: " + file.getAbsolutePath());

        scanner.close();
    }
}