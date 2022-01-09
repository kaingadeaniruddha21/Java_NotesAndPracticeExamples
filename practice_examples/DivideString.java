package practice_examples;


public class DivideString {

	public static void main(String[] args)
	{
		String s = "aaaabbbbcccc";
		int temp = 0;
		int len = s.length(); 
		int n = 3; 
	    int chars = len/n;
		
	    //stores the array of string
	    
		String equalStr[] = new String[n];
		
				if(len % n!=0)
				{
					System.out.println("sorry string can not be divide into "+ n + " equal parts");
				}
				else
				{
					for(int i=0;i<len;i=i+chars)
					{
						//int temp = 0;
						
						String parts = s.substring(i,i+chars);  
						equalStr[temp] = parts;
						temp++;		
					}
					System.out.println(n+" equal parts of given strings are..");
			
							for(int i=0;i<equalStr.length;i++)
							{
								System.out.println(equalStr[i]);		
							}
		}
	}
}