package stringTokenizer;

import java.util.StringTokenizer;

public class Split_StringInTwoWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s ="This is the exxample of String Tokenizer hey hii..!";
		StringTokenizer words = new StringTokenizer(s);
		while(words.hasMoreTokens())
		{
			System.out.println(words.countTokens());
			System.out.println(words.nextToken());
		}
	}

}
