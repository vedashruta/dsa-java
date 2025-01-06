package com.data.structures;

public class recursion {

	public void towerOfHanoi(int n, char begin, char end, char aux) {
		if (n == 0) {
			return;
		}
		towerOfHanoi(n - 1, begin, aux, end);
		System.out.println("Move Disk " + n + " from " + begin + " to " + end);
		towerOfHanoi(n - 1, aux, end, begin);
	}

	public int factorial(int n) {
		if (n == 0 || n == 1) {
			return 1;
		}
		return n * factorial(n - 1);
	}

	public int gcd(int m, int n) {
		if (m % n == 0) {
			return n;
		}
		return gcd(n, m % n);
	}

	public int ackermann(int m, int n) {
		if (m == 0) {
			return n + 1;
		}
		if (m > 0 && n == 0) {
			return ackermann(m - 1, 1);
		}
		return ackermann(m - 1, ackermann(m, n - 1));
	}

	public int pascalTriangle(int i, int j) {
		if (i == j || j == 0) {
			return 1;
		}
		return pascalTriangle(i - 1, j - 1) + pascalTriangle(i - 1, j);
	}
}
