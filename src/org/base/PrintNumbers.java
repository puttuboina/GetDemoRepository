package org.base;

public class PrintNumbers {
	public static void main(String[] args) {
		for (int i = 1; i < 6; i++) {
			for (int j = 5; j >= 1; j--) {
				System.out.print("  ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print(" * ");
			}
			System.out.println();

		}
	}
}
