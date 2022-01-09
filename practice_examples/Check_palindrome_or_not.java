package practice_examples;

import java.util.Scanner;


public class Check_palindrome_or_not {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("check whether it is palindrome or not");
		
	
		   int num;
		
			System.out.println("Enter number : ");
			num = sc.nextInt();
			
			int r, sum=0, temp;
			
			temp=num;
			while(num>0)
			{
				r=num%10;
				sum=(sum*10)+r;
				num=num/10;
			}
			if(temp==sum)
				System.out.println("Its a palindrome no.");
			else
				System.out.println("not a palidrome");
			

	}

}






