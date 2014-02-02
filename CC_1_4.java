/*
 * Write a method to replace all spaces in a string with '%20'. You may assume that the String has sufficient space
 * at the end of the string to hold the additional characters, and that you are given the "true" length of the String.
 * (Note: if implementing in java, please use a character array so that you can perform this operation in place. 
 * Input: "Mr John Smith  "
 * Output: "Mr%20John%20Smith"
 */
public class CC_1_4 {
	
	public static String replaceSpaces2(String str)
	{
		StringBuffer strBuf = new StringBuffer();
		for(int i = 0; i < str.length(); i++)
		{
			//System.out.println(str.charAt(i));
			if(str.charAt(i) == ' ')
			{
				strBuf.append("%20");
			}
			else 
				strBuf.append(str.charAt(i));
			
		}
		
		return strBuf.toString();
	}
	
	public static void replaceSpaces(char[] str, int length)
	{
		int spaceCount = 0, newLength, i;
		for(i = 0; i < length; i++)
		{
			if(str[i] == ' ')
				spaceCount ++;
		}
		
		newLength = length + spaceCount * 2;
		str[newLength] = '\0';
		for( i = length - 1; i >= 0; i--)
		{
			if(str[i] == ' ')
			{
				str[newLength - 1] = '0';
				str[newLength - 2] = '2';
				str[newLength - 3] = '%';
				newLength = newLength - 3;
			}
			else 
			{
				str[newLength - 1] = str[i];
				newLength = newLength -1;
			}
		}
	}
	
	
	
	public static void main(String[] args)
	{
		String str2 = "good nihao hello";
		
		String string = replaceSpaces2(str2);
		System.out.println(string);
	}

}

