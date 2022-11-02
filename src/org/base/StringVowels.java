package org.base;

public class StringVowels {
	public static void main(String[] args) {
		String s = "my name is lakshmi prasanna";
		char[] ch = s.toCharArray();
		int count = 0;
		for (int i = 0; i < ch.length; i++) {
			char c = ch[i];
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'O' || c == 'I'
					|| c == 'U') {
				count++;
			}
		}
		System.out.println("vowels count is : " + count);
	}

}
