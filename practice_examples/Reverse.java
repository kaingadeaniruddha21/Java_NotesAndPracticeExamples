package practice_examples;

public class Reverse {

	public static void main(String[] args) 
	{
		String s="123";
		String r="";
		int i;
		
			for( i=s.length()-1;i>=0;i--)
			{
				r=r+s.charAt(i);
			}
		
		System.out.println("Original:"+s);
		
		System.out.println("Reverse:"+r);
		
	

	}

}