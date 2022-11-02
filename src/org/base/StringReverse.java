package org.base;

public class StringReverse {
	public static void main(String[] args) {
		String s = " my name is lakshmi prasanna ";
		String rev = "";
		for (int i = s.length() - 1; i > 0; i--) {
			rev = rev + s.charAt(i);
		}
		System.out.println("String reverse : " + rev);
	}

}
