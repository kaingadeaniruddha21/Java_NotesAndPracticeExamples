package practice_examples;

public class SwapString {

	public static void main(String[] args)
	{
		String s1= "Good";
		String s2= "morning";
		
		System.out.println("Before Swapping:  "+s1+" "+s2);
		
		s1=s1+s2;
		
		//extract s2 from updated s1
		s2= s1.substring(0,(s1.length()-s2.length()));
		
		//extract s1 from updated s1

		s1= s1.substring(s2.length());
		System.out.println("After Swapping:  "+s1+" "+s2);

	}
}
