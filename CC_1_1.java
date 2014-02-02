/*
 *   Implement an algorithm to determine if a string has all unique characters. what if you cannot use additional data structure?
 */

public class CC_1_1 {

	public static boolean isUniqueChars(String str) {
		if (str.length() > 256)
			return false;
		boolean[] char_set = new boolean[256];

		for (int i = 0; i < str.length(); i++) {
			int val = str.charAt(i);

			if (char_set[val])
				return false;
			char_set[val] = true;
		}
		return true;

	}

	public static boolean isUniqueChars2(String str) {

		for (int i = 0; i < str.length(); i++)
			for (int j = 0; j < str.length(); j++) {
				if (i != j && str.charAt(i) == str.charAt(j))
					return false;

			}

		return true;
	}

	public static void main(String[] args) {
		String str = "abcdefghijklmnopqarstuvwxyz";

		System.out.println(isUniqueChars2(str));
	}

}
