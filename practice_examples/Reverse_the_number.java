package practice_examples;



import java.util.Scanner;


public class Reverse_the_number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("reverse the number");
		
		int num;
	
			System.out.println("Enter number : ");
			num = sc.nextInt();
			
			
			  int reverse=0;
			  while(num!=0) 
			  { 
			  int remainder= num%10;
			  reverse= reverse*10+remainder; 
			  num=num/10; 
			  }
			 
			/*
			 * int reverse=0; for(;num!=0;num=num/10) { int remainder =num%10;
			 * reverse=reverse*10+remainder; }
			 */
			
			System.out.println("reverse no is : "+ reverse);
			
	
	}

}






