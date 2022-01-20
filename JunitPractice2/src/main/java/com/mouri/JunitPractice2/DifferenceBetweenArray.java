package com.mouri.JunitPractice2;

import java.util.Scanner;

public class DifferenceBetweenArray {

	public int MinDifferenceArray() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int arraySize=sc.nextInt();
		
		int array1[] = new int[arraySize];
		System.out.println("Enter the elements in the array");
		for(int i=0;i<array1.length;i++) {
			array1[i]=sc.nextInt();
		}
	
	        int difference_min = Integer.MAX_VALUE; 
	      
	        // Find the min diff by comparing difference 
	        // of all possible pairs in given array 
	        int n=array1.length;
	        for (int i=0; i<n-1; i++) 
	            for (int j=i+1; j<n; j++) 
	                if (Math.abs((array1[i] - array1[j]) )< difference_min) 
	                	difference_min = Math.abs((array1[i] - array1[j])); 
	        System.out.println("minimum difference is =" + difference_min);
	      
	        // Return min diff     
	        return difference_min; 
	    } 
       public int MaxDifferenceArray() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int arraySize=sc.nextInt();
		
		
		int array1[] = new int[arraySize];
		System.out.println("Enter the elements in the array");
		for(int i=0;i<array1.length;i++) {
			array1[i]=sc.nextInt();
		}
	
		int difference_max = Integer.MIN_VALUE;
		 
        int n = array1.length;
        if (n == 0) {
            return difference_max;
        }
 
        for (int i = 0; i < n - 1; i++)
        {
            for (int j = i + 1; j < n; j++) {
                if (array1[j] > array1[i]) {
                	difference_max = Integer.max(difference_max, array1[j] - array1[i]);
                }
            }
        }
              System.out.println("maximum difference is=" + difference_max);
        return difference_max;
	    } 	
	}
	
	
	
	
