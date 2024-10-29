import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TextFileWriter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder content = new StringBuilder();
        
        System.out.println("Write whatever you want!!! (insert nothing to end):");
        
        // keeps reading until the user puts a empty space
        while (true) {
            String line = scanner.nextLine();
            if (line.isEmpty()) {  // controlla se la linea è vuota
                break;
            }
            content.append(line).append(System.lineSeparator());
        }
        
        scanner.close();
        
        // writes
        try (FileWriter writer = new FileWriter("output.txt")) {
            writer.write(content.toString());
            System.out.println("The content has been written in  'output.txt'");
        } catch (IOException e) {
            System.out.println("Error while writing: " + e.getMessage());
        }
    }
}
