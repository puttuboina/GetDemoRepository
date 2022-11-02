package org.base;

public class PrintStarsRightSide {
	public static void main(String[] args) {
		for (int i = 0; i < 6; i++) {
			for (int j = 5; j > i - 1; j--) {
				System.out.print(" * ");
			}
			System.out.println(" ");
		}
	}

}
