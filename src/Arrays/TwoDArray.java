package Arrays;
import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] box = new int[2][3];

        System.out.println("Enter elements for the 2x3 array:");
        for (int i = 0; i < box.length; i++) {
            for (int j = 0; j < box[i].length; j++) {
                box[i][j] = sc.nextInt();
            }
        }

        System.out.println("Array elements are:");
        for (int i = 0; i < box.length; i++) {
            for (int j = 0; j < box[i].length; j++) {
                System.out.print(box[i][j] + " ");
            }
            System.out.println();
        }
    }
}