/*
 * Implement a function void reverse(char * str) in C or C++ which reverses a null-terminated String.  
 */

public class CC_1_2 {

	public static String reverse(String str) {
		StringBuffer str2 = new StringBuffer();
		;

		for (int i = str.length() - 1; i >= 0; i--) {

			str2.append(str.charAt(i));

		}

		return str2.toString();
	}

	public static void main(String[] args)

	{
		String str = "Hello";

		System.out.println(reverse(str));

	}

}
