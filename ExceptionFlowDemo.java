// made by JIBIN WILSON S7 CSE
import java.util.Scanner;

public class ExceptionFlowDemo {
    static int divide(int a, int b) throws ArithmeticException {
        return a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter dividend: ");
            int a = sc.nextInt();
            System.out.print("Enter divisor: ");
            int b = sc.nextInt();
            int result = divide(a, b); // may throw
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed.");
            sc.close();
        }
    }
}


