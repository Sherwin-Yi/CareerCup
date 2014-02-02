/*
 * Implement a function to check if a linked list is a palindrome. 
 */
public class CC_2_7 
{
	
	public static boolean palindromeLinkedlist(Node list)
	{
		Node curr = list; 
		while(curr!= null)
		{
			curr = curr.next;
		}
		
		Node head = list;
		Node end = curr.previous;
		
		while(head.next != null && end.previous != null)
		{
			if(head.data != end.data)
			{
				return false;				
			}
			else
			{
			    head = head.next;
			    end = end.next;
			}
			
		}
		
		return true;
		
	}



}
