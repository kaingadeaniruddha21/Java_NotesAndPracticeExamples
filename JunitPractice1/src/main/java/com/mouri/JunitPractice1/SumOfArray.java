package com.mouri.JunitPractice1;


public class SumOfArray {

	public int[] SumOfTwoArrays() {
		int array1[] = {34,56,78};
		int array2[] = {43,65,50};
		int array3[] = new int[3];
		
		for(int i = 0; i< array3.length ; i++) {
			array3[i]=array1[i]+array2[i];
			
		}
		return array3;	
	}	
}