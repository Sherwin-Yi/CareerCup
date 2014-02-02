/*
 * Write code to remove duplicates from an unsorted linked list. 
 * FOLLOW UP
 * How would you solve this problem if a temporary buffer is not allowed?
 */

import java.util.HashSet;

public class CC_2_1 {

	public static void deleteDups(Node list) {
		HashSet<Integer> table = new HashSet<Integer>();
	
		Node pre = list;
		Node curr = list.next;
		if (pre != null)
			table.add(pre.data);

		while (curr != null) {
			
			if (table.contains(curr.data)) 
			{
				//System.out.println("contain");
				pre.next = curr.next;
			
			} 
			else 
			{
				table.add(curr.data);
				
				pre = pre.next;
			}

			curr = curr.next;
		}
		
	
		
       // System.out.println("table size: " + table.size());
	}

	public static void main(String[] args) {

		Node a = new Node(2);
		Node b = new Node(3);
		Node c = new Node(4);
		Node d = new Node(4);
		Node e = new Node(5);

		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;
		e.next = null;

		deleteDups(a);

		}
		
		
/*
 * if don't use a buffer, we can iterate with two pointers: current which iterates through the linked list, and runner which 
 * checks all subsequent nodes, for duplicates. 
 */
	

}
