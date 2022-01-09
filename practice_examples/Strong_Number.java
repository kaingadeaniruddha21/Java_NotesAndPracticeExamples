package practice_examples;

import java.util.Scanner;


public class Strong_Number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("strong number");
		
	     	int num;
	
			System.out.println("Enter number : ");
			num= sc.nextInt();
			int k;
			int fact1;
			int lastdigit;
			
			int total=0;
			int temp_n=0;
			while(num!=0)
			{
				k=1;
				fact1=1;
				lastdigit = num%10;
				
				while(k<=lastdigit)
				{
					fact1 = fact1*k;
					k++;
				}
				total = total + fact1;
				num = num/10;
				
			}
			if(total==temp_n)
			{
			System.out.println(temp_n+"is a strong number\n");	
			}
			else
				System.out.println(temp_n+"not a strong number");
			
		

	}

}






