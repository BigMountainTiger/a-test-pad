package org.song.example;

import java.util.Arrays;
import java.util.Collections;

import org.testng.Assert;
import org.testng.annotations.Test;

public class List_Sorting_test {
	
	@Test
	public void Test_Sort_Array() {
		Integer[] array = {3, 1, 2, 8};
		Integer[] clone = array.clone();
		
		// Asc
		Arrays.sort(array);
		
		int v = array[0];
		for (int i = 1; i < array.length; i++) {
			Assert.assertTrue(array[i].intValue() >= v);
			v = array[i];
		}
		
		// Desc
		Arrays.sort(array, Collections.reverseOrder());
		
		v = array[0];
		for (int i = 1; i < array.length; i++) {
			Assert.assertTrue(v >= array[i].intValue());
			v = array[i];
		}
	}
	
	@Test
	public void Test_Sort_Array_Comparator() {
		Integer[] array = {3, 1, 2, 8};
		
		// Asc
		Arrays.sort(array, (a, b)-> a - b);
		
		int v = array[0];
		for (int i = 1; i < array.length; i++) {
			Assert.assertTrue(array[i].intValue() >= v);
			v = array[i];
		}
		
		// Desc
		Arrays.sort(array, (a, b)-> b - a);
		
		v = array[0];
		for (int i = 1; i < array.length; i++) {
			Assert.assertTrue(v >= array[i].intValue());
			v = array[i];
		}
	}
}
