// made by JIBIN WILSON S7 CSE
import java.util.Scanner;

public class CharFrequency {
    public static int frequencyOfChar(String text, char target) {
        if (text == null) return 0;
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == target) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        System.out.print("Enter a character to find frequency: ");
        String charStr = scanner.nextLine();
        char target = charStr.isEmpty() ? '\0' : charStr.charAt(0);
        int freq = frequencyOfChar(input, target);
        System.out.println("Frequency of '" + target + "' in \"" + input + "\" is: " + freq);
        scanner.close();
    }
}


