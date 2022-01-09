package practice_examples;


import java.util.Scanner;


public class Perfect_Number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Check perfect number");
	
		    int num;
				
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
		    
		  	    
	

	}

}






