package com.mouri.JunitPractice2;

import static org.junit.Assert.*;
import org.junit.Test;
import junit.framework.Assert;

public class TestDifferenceBetweenArray {

	@Test
	public void testMinDifferenceArray() 
	{
		DifferenceBetweenArray dba = new DifferenceBetweenArray();
		assertEquals(1, dba.MinDifferenceArray());
	}
	
	@Test
	public void testMaxDifferenceArray() 
	{
		DifferenceBetweenArray dba = new DifferenceBetweenArray();
		assertEquals(1, dba.MaxDifferenceArray());
	}
}