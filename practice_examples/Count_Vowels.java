package practice_examples;

public class Count_Vowels {

	public static void main(String[] args) 
			{
				int vC = 0,cC=0;
				int i;
				String s = "this is really a simple sentences";
				
				for( i=0;i<s.length();i++)
				{
						if(s.charAt(i)=='a'|| s.charAt(i)=='e'||s.charAt(i)=='i')
							vC++;
				
						else if(s.charAt(i)>='a' && s.charAt(i)<='z')
						{
							cC++;	
						}
				}			
				System.out.println("vowels is :"+vC);
				System.out.println("consonants is :"+cC);
			}			
	}
