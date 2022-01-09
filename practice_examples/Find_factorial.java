package practice_examples;

import java.util.Scanner;


public class Find_factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("find factorial");
		
	
		   int num;
		
			System.out.println("Enter number :");
			num = sc.nextInt();
			
			int i, fact=1;
			
			for(i=1;i<=num;i++)
			{
				fact=fact*i;
			}
			System.out.println("Factorial of" + num + "is" +fact);
		
		
		}

}






