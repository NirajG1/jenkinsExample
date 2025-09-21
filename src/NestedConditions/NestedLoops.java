package NestedConditions;
import java.util.Scanner;

public class NestedLoops {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int m= sc.nextInt();
		if(m>90) {
			if(m>95) {
				System.out.println("Very good");
				
			}
			else {
				System.out.println(" good");
				
			}
		}
	}

}
