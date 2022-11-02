package org.base;

public class ArrayAddition {
	public static void main(String[] args) {
		int[] ar = new int[] { 10, 40, 70, 100, 1000 };
		int sum = 0;
		for (int i = 0; i < ar.length; i++) {
			sum = sum + ar[i];

		}
		System.out.println("sum of the array is :" + sum);

	}

}
