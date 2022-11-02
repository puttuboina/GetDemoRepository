package org.base;

public class NumberofWordsInString {
	public static void main(String[] args) {
		String s = "my name is lakshmi prasanna";
		String[] ch = s.split(" ");
		int length = ch.length;
		System.out.println(" number of words in String is :" + length);
	}

}
