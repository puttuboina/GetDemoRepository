package org.base;

public class StringReverse1 {
	public static void main(String[] args) {
		String s1 = "my name is lakshmi prasanna";
		String s2 = " ";
		String[] s3 = s1.split(" ");
		for (String s4 : s3) {
			String s5 = " ";
			for (int i = s4.length() - 1; i >= 0; i--) {
				char c = s4.charAt(i);
				s5 = s5 + c + " ";
			}
			s2 = s2 + s5 + " ";
		}
		System.out.println(s2);

	}

}
