package org.song.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.testng.Assert;
import org.testng.Reporter;
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
	
	@Test
	public void Test_Sort_List() {
		long[] data = {1, 3, 2, 5, 9, 8, 10, 4, 77, 200, 120, 0}; 
		List<Long> list = new ArrayList<Long>();
		
		for (int i = 0; i < data.length; i++) {
			list.add(data[i]);
		}
		
		Assert.assertEquals(list.size(), data.length);
		
		List<Long> clone = new ArrayList<Long>(list);
		Collections.sort(clone);
		
		for (int i = 0; i < clone.size() - 1; i++) {
			Assert.assertTrue(clone.get(i) <= clone.get(i + 1));
		}

		clone = new ArrayList<Long>(list);
		Collections.sort(clone, Collections.reverseOrder());
		
		for (int i = 0; i < clone.size() - 1; i++) {
			Assert.assertTrue(clone.get(i) >= clone.get(i + 1));
		}
	}
	
	@Test
	public void Test_Sort_String() {
		String data = "GeeksForSongLi"; 
		
		char[] array = data.toCharArray();
		Assert.assertEquals(array.length, data.length());
		Arrays.sort(array);
		Reporter.log(String.valueOf(array), true);
		
		String[] list = data.split("");
		Assert.assertEquals(list.length, data.length());
		
		StringBuilder builder = new StringBuilder();
		for(String s : list) {
		    builder.append(s);
		}
		Reporter.log(builder.toString(), true);
		
		Arrays.sort(list, Collections.reverseOrder());
		builder = new StringBuilder();
		for(String s : list) {
		    builder.append(s);
		}
		Reporter.log(builder.toString(), true);
		
		for(int i = 0; i < list.length - 1; i++) {
			String s0 = list[i];
			String s1 = list[i + 1];
			
			// May be duplicate characters
			Assert.assertTrue(s0.compareTo(s1) >= 0);
		}
		
	}
}
