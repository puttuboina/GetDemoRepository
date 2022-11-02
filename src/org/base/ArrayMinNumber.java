package org.base;

public class ArrayMinNumber {
	public static void main(String[] args) {
		int[] ar = new int[] { 2000, 1000, 100, 500, 300 };
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar.length; j++) {
				if (ar[i] < ar[j]) {
					int temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp;
				}
			}
		}
			System.out.println(ar[0]);
		
	}


}
