package practice_examples;


import java.util.Scanner;


public class SwitchPractice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. find factorial");
		System.out.println("2. reverse the number");
		System.out.println("3. whether it is palindrome or not");
		System.out.println("4. perfect number");
		System.out.println("5. strong number");
		
		System.out.println("Enter your choice : ");
		
		int choice = sc.nextInt();
		int num;
		
		switch (choice)
		{
		case 1:
			System.out.println("Enter number :");
			num = sc.nextInt();
			
			int i, fact=1;
			
			for(i=1;i<=num;i++)
			{
				fact=fact*i;
			}
			System.out.println("Factorial of" + num + "is" +fact);
			break;
			
		case 2:
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
			break;
			
		case 3:
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
			break;
			
			
		case 4:
			System.out.println("Enter number : ");
			num = sc.nextInt();
			
			int j=1;
		    int sum1=0;
		    
		    while(j<=num/2)
		    {
		    	if(num%j==0)
		    	{
		    		sum1=sum1+j;
		    	}
		    	j++;
		    }
		    if(sum1==num)
		    {
		    	System.out.println(num+ "is a perfect number.. ");
		    }
		    else
		    	System.out.println(num+"not a perfect number.");
		    break;
		    
		    
		case 5:
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
			break;
		}

	}

}






