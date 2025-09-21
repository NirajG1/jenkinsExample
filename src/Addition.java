import java.util.Scanner;
public class Addition {
	public static void main(String [] args) {
		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		//int b=sc.scanner();
		 if (a%3==0 && a%5==0)
			{
				System.out.println("FizzBuz");
			}
	
		 else if(a%3==0) {
			System.out.println("Fizz");
		}
			 else if(a%5==0) {
			System.out.println("buzz");
			}
		  
		}
		
		
	}


