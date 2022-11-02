package org.base;

import java.util.Set;
import java.util.TreeSet;

public class DuplicatesInArray {
	public static void main(String[] args) {
		int[] ar = new int[] { 10, 30, 30, 50, 80, 60, 50 };
		Set<Integer> s = new TreeSet<>();
		for (int i = 0; i < ar.length; i++) {
			s.add(ar[i]);
		}
		for (Integer x : s) {
			System.out.println(x);
		}

	}

}
