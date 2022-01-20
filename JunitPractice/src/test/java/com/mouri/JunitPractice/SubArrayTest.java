package com.mouri.JunitPractice;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class SubArrayTest {

	@Test
	public void testSubArrayBetween() {
		SubArr sa = new SubArr();
		System.out.println(Arrays.toString(sa.SubArrayBetween()));
		assertArrayEquals(new int[] {30,25,40,32,31},sa.SubArrayBetween());
		
	}

}