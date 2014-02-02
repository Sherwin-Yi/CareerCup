/*
 * Assume you have a method isSubstring which checks if one word is a substring of another. 
 * Given two strings, s1 and s2, write code to check if s2 is a rotation of s1 using only one 
 * call to isSubstring(eg: "waterbottle" is a rotation of "erbottlewat".)
 */


public class CC_1_8 {

	
	public static boolean isRotation(String s1, String s2)
	{
		int len = s1.length();
		
		if(len == s2.length() && len > 0)
		{
			String s1s1 = s1 + s1;
			return isSubstring(s1s1, s2);
		}
		return false;
	}
	
	//Provided by the question.
	private static boolean isSubstring(String s1s1, String s2) {
		// TODO Auto-generated method stub
		return false;
	}

}
