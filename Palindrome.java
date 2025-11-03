// made by JIBIN WILSON S7 CSE
import java.util.Scanner;

public class Palindrome {
    public static boolean isPalindrome(String text) {
        if (text == null) return false;
        String normalized = text.trim();
        int i = 0, j = normalized.length() - 1;
        while (i < j) {
            if (Character.toLowerCase(normalized.charAt(i)) != Character.toLowerCase(normalized.charAt(j))) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        boolean result = isPalindrome(input);
        if (result) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
        scanner.close();
    }
}


