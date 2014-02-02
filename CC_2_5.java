/*
 * You have two numbers represented by a linked list, where each node contains a single digit. The digits are stored in reverse order, 
 * such that the 1st digit is at the head of the list. write a function that adds the two numbers and returns the sum as a linked list. 
 * Input: (7->1->6) + (5 -> 9 -> 2). That is, 617 +  295
 * Output: 2 -> 1 -> 9. That is 912.
 */


public class CC_2_5 
{
	public static void addition(Node list1, Node list2)
	{
		Node list = null;
		int carry = 0; 
		int sum = 0; 

		while(list1 != null && list2 != null)
		{
			int total = list1.data + list2.data + carry;
			sum = total % 10;
			carry = total / 10;
			list.add(sum);
			
		}
		
		while(list1 != null)
		{
			int total = list1.data + carry;
			sum = total % 10;
			carry = total/10;
			list.add(sum);
		}
		while(list2 != null)
		{
			int total = list2.data + carry; 
			sum = total % 10;
			carry = total /10;
			list.add(sum);
		}
		
		if(carry == 1)
			list.add(carry);
		
	}
	


}
