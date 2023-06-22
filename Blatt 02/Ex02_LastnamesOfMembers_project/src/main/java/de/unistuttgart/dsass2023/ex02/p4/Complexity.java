package de.unistuttgart.dsass2023.ex02.p4;
 

public class Complexity {

	
	/**
	 * 
	 * @param n positive integer n
	 * @return some new number based on n
	 */
	public static int couldBeBetter1(int n) {
		int result = 0;
		for (int i = 0; i <= n; i++) {
			result += 2;
		}
		return result;
	}
	
	
	/**
	 * 
	 * @param n positive integer n
	 * @return some new number based on n
	 */
	public static int couldBeBetter2(int n) {
		int temp = 1;
		int result = 1;
		for (int i = 1; i <= n; i++) {
			result = 0;
			for (int j = 1; j <= i; j++) {
				result += temp;
			}
			temp = result;
		}
		return result;
	}
	
	/**
	 * 
	 * @param n positive integer
	 * @return some new number based on n
	 */
	public static int couldBeBetter3(int n) {
		
		if (n < 0) throw new IllegalArgumentException("n has to be positive!");
		else if (n <= 1) return 1;
		else return couldBeBetter3(n-1)+ couldBeBetter3(n-2);
	}
	
	
	/**
	 * Why better: we do not use additional variables and loops,
	 * so the execution of this function is much faster and more efficient.
	 *
	 * @param n positive integer
	 * @return same number as couldBeBetter1, but faster
	 */
	public static int isDoneBetter1(int n) {
		return (n*2);
	}
	
	
	/**
	 * Why better: because it has a time complexity of O(n),
	 * while couldBeBetter2 has a time complexity of O(n^2).
	 * And also it doesn't use additional variable.
	 *
	 * @param n positive integer
	 * @return same number as couldBeBetter1, but faster
	 */
	public static int isDoneBetter2(int n) {
		int result = 1;
		for (int i = 2; i <= n; i++) {
			result *= i;
		}
		return result;
	}

	
	/**
	 * Why better:because it has a time complexity of O(n),
	 * while couldBeBetter3 has a time complexity of O(2^n).
	 * Our function uses a simple iterative approach
	 * that calculates the nth Fibonacci number in a single loop.
	 *
	 * @param n positive integer
	 * @return same number as couldBeBetter1, but faster
	 */
	public static int isDoneBetter3(int n) {
		if (n < 0) throw new IllegalArgumentException("n has to be positive!");
		int a = 0;
		int b = 1;
		for (int i = 0; i < n; i++) {
			int temp = a;
			a = b;
			b = temp + b;
		}
		return a;
	}

}
