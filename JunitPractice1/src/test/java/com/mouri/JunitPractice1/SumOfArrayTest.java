package com.mouri.JunitPractice1;

import static org.junit.Assert.*;
import org.junit.Test;

public class SumOfArrayTest {

	SumOfArray soa = new SumOfArray();
	
	@Test
	public  void testSumOfTwoArrays() {
	
		assertArrayEquals(new int[] {77,121,128},soa.SumOfTwoArrays());
	}
	

}