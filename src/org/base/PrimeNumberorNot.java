package org.base;

public class PrimeNumberorNot {
	public static void main(String[] args) {
		int a = 13;
		int count = 0;
		for (int i = 2; i < a / 2; i++) {
			if (a % i == 0) {
				count++;
			}
		}
		if (count == 0) {
			System.out.println("it is prime number");
		} else {
			System.out.println("it is not prime number");
		}

	}
}
