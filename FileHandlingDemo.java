import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandlingDemo {
    public static void main(String[] args) {

        String fileName = "student.txt";

        try {
            // Writing to file
            FileWriter writer = new FileWriter(fileName);
            writer.write("Student ID: 101\n");
            writer.write("Name: Arushi\n");
            writer.write("Course: Java Development\n");
            writer.close();

            System.out.println("Data written successfully.");

            // Reading from file
            FileReader reader = new FileReader(fileName);
            int ch;

            System.out.println("\nFile Content:");
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }

            reader.close();

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
