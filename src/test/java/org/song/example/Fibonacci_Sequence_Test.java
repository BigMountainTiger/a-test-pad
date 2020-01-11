package org.song.example;

import org.song.example.fib.FibonacciMatrixGenerator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Fibonacci_Sequence_Test {
	private long[] fib_samples = {0,1,1,2,3,5,8,13,21,34,55,89,144,233,
			377,610,987,1597,2584,4181,6765,10946,17711,28657,
			46368,75025,121393,196418,317811};
	
	// fib_Recursive_Generator
	private long fib_Recursive_Generator(long n) {
		
		if (n < 0) {
			String msg = "Negative number is not valid "
					+ "for Fibonacci Numbers";
			throw new IllegalArgumentException(msg);
		}
		
		if (n == 0 || n == 1) { return n; }
		
		return fib_Recursive_Generator(n - 2)
				+ fib_Recursive_Generator(n - 1);
		
	}
	
	// fib_Loop_Generator
	private long fib_Loop_Generator(long n) {
		// n is the sequence index - 0, 1, 2, 3, 4
		
		if (n < 0) {
			String msg = "Negative number is not valid "
					+ "for Fibonacci Numbers";
			throw new IllegalArgumentException(msg);
		}
		
		if (n == 0 || n == 1) { return n; }
		
		long p_2 = 0, p_1 = 1, p = 1;
		for (int i = 2; i <= n; i++) {
			p = p_2 + p_1;
			
			p_2 = p_1;
			p_1 = p;
		}
		
		return p;
		
	}
	
	// fib_Loop_Array_Generator
	private long[] fib_Loop_Array_Generator(long n) {
		
		// n is the sequence index - 0, 1, 2, 3, 4
		// The number of entries in the array = n + 1
		
		if (n < 0) {
			String msg = "Negative number is not valid "
					+ "for Fibonacci Numbers";
			throw new IllegalArgumentException(msg);
		}
		
		long[] result = new long[(int) (n + 1)];
		
		for (int i = 0; i < result.length; i++) {
			result[i] = i;
		}
		
		if (n == 0 || n == 1) {
			return result;
		}
		
		long p_2 = 0, p_1 = 1, p = 1;
		for (int i = 2; i <= n; i++) {
			p = p_2 + p_1;
			
			p_2 = p_1;
			p_1 = p;
			
			result[i] = p;
		}
		
		return result;
		
	}

	@Test
	public void Test_By_Loop() {

		for (int i = 0; i < fib_samples.length; i++) {
			Assert.assertEquals(fib_Loop_Generator(i), fib_samples[i]);
		}
		
	}
	
	@Test
	public void Test_By_Loop_Array() {
		long[] result = fib_Loop_Array_Generator(0);
		Assert.assertEquals(result.length, 1);
		
		result = fib_Loop_Array_Generator(1);
		Assert.assertEquals(result.length, 2);
		
		result = fib_Loop_Array_Generator(2);
		Assert.assertEquals(result.length, 3);
		for (int i = 0; i < result.length; i++) {
			Assert.assertEquals(result[i], fib_samples[i]);
		}
		
		result  = fib_Loop_Array_Generator(fib_samples.length - 1);
		Assert.assertEquals(result.length, fib_samples.length);
		
		for (int i = 0; i < fib_samples.length; i++) {
			Assert.assertEquals(result[i], fib_samples[i]);
		}
	}
	
	@Test
	public void Test_By_Recursion() {

		for (int i = 0; i < fib_samples.length; i++) {
			Assert.assertEquals(fib_Recursive_Generator(i), fib_samples[i]);
		}
	}
	
	@Test
	public void Test_By_FibonacciMatrixGenerator() {
		for (int i = 0; i < fib_samples.length; i++) {
			Assert.assertEquals(FibonacciMatrixGenerator.fib(i), fib_samples[i]);
		}
	}
	
	@Test
	public void Test_By_FibonacciMatrixGenerator_Recursive() {
		for (int i = 0; i < fib_samples.length; i++) {
			Assert.assertEquals(FibonacciMatrixGenerator.fib_Recursive(i), fib_samples[i]);
		}
	}
}
