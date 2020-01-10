package org.song.example;

import org.song.example.sort.BubbleSorter;
import org.song.example.sort.QuickSorter;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sort_Algorithm_Test {

	@Test
	public void Test_Bubble_Sort() {
		long[] emptyArray = new long[0];
		
		BubbleSorter.Sort(emptyArray);
		Assert.assertEquals(emptyArray.length, 0);
		
		long[] singleEntryArray = {123};
		
		BubbleSorter.Sort(singleEntryArray);
		Assert.assertEquals(singleEntryArray.length, 1);
		
		long[] multipleEntryArray = {500, 2, 34, 2, 3, 199, 0, 1, 66, 0, -20, -20};
		BubbleSorter.Sort(multipleEntryArray);
		
		for (int i = 0; i < multipleEntryArray.length - 1; i++) {
			Assert.assertTrue(multipleEntryArray[i] <= multipleEntryArray[i + 1]);
			//Reporter.log(Long.toString(multipleEntryArray[i]), true);
		}
		
		//Reporter.log(Long.toString(multipleEntryArray[multipleEntryArray.length - 1]), true);
	}
	
	@Test
	public void Test_Quick_Sort() {
		long[] emptyArray = new long[0];
		
		QuickSorter.Sort(emptyArray);
		Assert.assertEquals(emptyArray.length, 0);
		
		long[] singleEntryArray = {123};
		
		QuickSorter.Sort(singleEntryArray);
		Assert.assertEquals(singleEntryArray.length, 1);
		
		long[] multipleEntryArray = {500, 2, 34, 2, 3, 199, 0, 1, 66, 0, -20, -20};
		QuickSorter.Sort(multipleEntryArray);
		
		for (int i = 0; i < multipleEntryArray.length - 1; i++) {
			Assert.assertTrue(multipleEntryArray[i] <= multipleEntryArray[i + 1]);
			//Reporter.log(Long.toString(multipleEntryArray[i]), true);
		}
		
		//Reporter.log(Long.toString(multipleEntryArray[multipleEntryArray.length - 1]), true);
	}
}
