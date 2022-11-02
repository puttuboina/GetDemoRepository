package org.base;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraySort {
	public static void main(String[] args) {
		int[] ar = new int[] { 12, 40, 100, 500, 7000 };

		Arrays.sort(ar);
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);

		}
	}

}
