package org.base;

public class StringConsonants {
	public static void main(String[] args) {
		String s = "my name is lakshmi prasanna";
		int count = 0;
		char[] ch = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			char c = ch[i];
			if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
				if (!(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'E'
						|| c == 'I' || c == 'O' || c == 'U')) {
					count++;
				}
			}
		}
		System.out.println(count);
	}

}
