/*
 * Implement a method to perform basic string compression using the counts of repeated characters. 
 * For example, the string aabcccccaaa would become a2b1c5a3. if the "compressed" string would not become
 * smaller than the original string, your method should return the original string.  
 */



public class CC_1_5 {

	public static String compress(String str)
	{
		StringBuffer mystr = new StringBuffer();
		char last = str.charAt(0);
		int count = 0;
		for(int i = 0; i < str.length(); i++)
		{
			if(str.charAt(i) == last)
			{
				count ++;
			}
			
			else
			{
				mystr.append(last + "" + count);
				//mystr += last + "" + count;
				last = str.charAt(i);
				count = 1;
			}
		}
		
		return (mystr.append(last + "" + count)).toString();
	}
	
	
	public static void main(String []  args)
	{
		String string = "aaabccccaaa";
		System.out.println(compress(string));
	}

}
