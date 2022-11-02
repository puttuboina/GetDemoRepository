package org.base;

public class NumberPalindrome {
	public static void main(String[] args) {
		int a, sum = 0, temp;
		int n = 235634;
		temp = 0;
		while (n > 0) {
			a = n % 10;
			sum = sum * 10 + a;
			n = n / 10;
		}
		if (temp == sum) {
			System.out.println("it is pailndrome");
		} else {
			System.out.println("it is not palindrome");
		}
	}

}
