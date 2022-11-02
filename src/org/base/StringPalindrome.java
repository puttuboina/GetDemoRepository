package org.base;

public class StringPalindrome {
	public static void main(String[] args) {
		String s = "my name is lakshmi prasanna";
		String rev = "";
		for (int i = 0; i < s.length(); i++) {
			rev = rev + s.charAt(i);

		}
		if (s.contains(rev)) {
			System.out.println("it is palindrome");
		} else {
			System.out.println("it is not palindrome");
		}
	}
}
