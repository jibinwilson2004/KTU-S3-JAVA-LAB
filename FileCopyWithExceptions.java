// made by JIBIN WILSON S7 CSE
import java.io.*;

public class FileCopyWithExceptions {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java FileCopyWithExceptions <source> <destination>");
            return;
        }
        String src = args[0];
        String dest = args[1];
        try (FileInputStream fis = new FileInputStream(src);
             FileOutputStream fos = new FileOutputStream(dest)) {
            byte[] buffer = new byte[8192];
            int read;
            while ((read = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, read);
            }
            System.out.println("Copied successfully.");
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (SecurityException e) {
            System.out.println("Security exception: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("I/O exception: " + e.getMessage());
        } finally {
            System.out.println("Copy attempt finished.");
        }
    }
}


