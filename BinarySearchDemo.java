// made by JIBIN WILSON S7 CSE
import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchDemo {
    public static int binarySearch(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) return mid;
            if (arr[mid] < target) low = mid + 1; else high = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " integers (unsorted allowed):");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        Arrays.sort(arr);
        System.out.print("Enter target to search: ");
        int target = sc.nextInt();
        int idx = binarySearch(arr, target);
        System.out.println("Sorted array: " + Arrays.toString(arr));
        if (idx >= 0) {
            System.out.println("Found at index: " + idx);
        } else {
            System.out.println("Not found.");
        }
        sc.close();
    }
}


