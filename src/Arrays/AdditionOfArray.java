package Arrays;
import java.util.Scanner;

public class AdditionOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] marks = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            marks[i] = sc.nextInt();
        }
        int total = 0;
        System.out.println("Array elements are:");
        for (int i = 0; i < n; i++) {
            System.out.println(marks[i]);
            total += marks[i];
        }
        System.out.println("Total = " + total);
    }
}