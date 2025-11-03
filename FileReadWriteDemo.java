// made by JIBIN WILSON S7 CSE
import java.io.*;

public class FileReadWriteDemo {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java FileReadWriteDemo <inputFile> <outputFile>");
            return;
        }
        File inFile = new File(args[0]);
        File outFile = new File(args[1]);
        try (BufferedReader reader = new BufferedReader(new FileReader(inFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }
            System.out.println("Copied from " + inFile.getAbsolutePath() + " to " + outFile.getAbsolutePath());
        } catch (IOException e) {
            System.out.println("I/O Error: " + e.getMessage());
        }
    }
}


