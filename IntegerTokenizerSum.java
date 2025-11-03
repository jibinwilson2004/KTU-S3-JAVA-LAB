// made by JIBIN WILSON S7 CSE
import java.util.Scanner;
import java.util.StringTokenizer;

public class IntegerTokenizerSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a line of integers (space-separated):");
        String line = scanner.nextLine();
        StringTokenizer tokenizer = new StringTokenizer(line);
        long sum = 0;
        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            try {
                int value = Integer.parseInt(token);
                System.out.println(value);
                sum += value;
            } catch (NumberFormatException e) {
                System.out.println("Skipping non-integer token: " + token);
            }
        }
        System.out.println("Sum = " + sum);
        scanner.close();
    }
}


