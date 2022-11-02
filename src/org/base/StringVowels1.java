package org.base;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class StringVowels1 {
	public static void main(String[] args) {
		String s = "my name is lakshmi prasanna";
		char[] ch = s.toCharArray();
		Map<Character, Integer> m = new LinkedHashMap<>();
		for (int j = 0; j < ch.length; j++) {
			char c = ch[j];
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O'
					|| c == 'Z') {
				if (m.containsKey(c)) {
					Integer integer = m.get(ch[j]);
					m.put(c, integer + 1);
				} else {
					m.put(c, 1);
				}
			}
		}
		Set<Entry<Character, Integer>> m1 = m.entrySet();
		for (Entry<Character, Integer> s1 : m1) {
			System.out.println(s1);
		}

	}
}
