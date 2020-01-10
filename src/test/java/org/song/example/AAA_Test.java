package org.song.example;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class AAA_Test {
	private String[] items = {"Fibonacci-like Sequence", "List Sorting", "Basic Decision Logic"};
	
	@Test
	public void AAA_Test_A() {
		for (int i = 0; i < items.length; i++) {
			Reporter.log(items[i], true);
		}
	}
}
