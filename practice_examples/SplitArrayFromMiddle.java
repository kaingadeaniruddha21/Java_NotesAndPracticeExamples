package practice_examples;

import java.util.Arrays;

public class SplitArrayFromMiddle {

	public static void main(String[] args) {
		
		int [] abc = {58,24,13,15,63,9,8,81,1,78};
		int n = abc.length;
		
		//System.out.println(n);
		
		int [] a = new int [n/2];
		int [] b = new int [n-a.length];
		
		
		for(int i=0; i<n; i++)
		{
			if(i<a.length)
			{
				a[i] = abc[i];
			}
			else
			{
				b[i-a.length]=abc[i];
			}
		}
		
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		

	}

}