/*
 * Given two strings, write a method to decide if one is a permutation of the other.
 */

import java.util.Arrays;

public class CC_1_3 {

	public String sort(String s) {
		char[] content = s.toCharArray();
		Arrays.sort(content);
		// return new String(content);
		return Arrays.toString(content);
	}

	public boolean permutation(String s, String t) {
		if (s.length() != t.length())
			return false;
		return sort(s).equals(sort(t));

	}

}
