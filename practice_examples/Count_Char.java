package practice_examples;

public class Count_Char {

	public static void main(String[] args) 
	{
		String s = "mouri";
		int count = 0;
		
	    for(int i = 0;i<s.length();i++)
		{
	    	if(s.charAt(i)!=' ')
	    		count++;
			
		}
		
		System.out.println("count is "+count);
	}

}
