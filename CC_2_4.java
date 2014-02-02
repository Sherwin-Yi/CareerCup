/*
 * Write code to partition a linked list around a value x, such that all nodes less than x come before all nodes greater than or equal to x.
 */

public class CC_2_4 {
	public static void reorder(Node n, int x) {
 
		


		
		Node curr = n;
		Node head = curr;
		
		Node tail = n;
		while(tail !=null)
		{
			tail = tail.next;
		}
		
		
		
		/*
		if (curr.data > x) {
			curr = curr.next;
			head = curr;

		}*/

		while (curr != null) 
		{
			if (curr.data >= x)

			{
				Node value = curr;
			
				curr.data = curr.next.data;
				curr.next = curr.next.next;
				
				tail = value;
				tail = value.next;
				
		
				
			}
			else
				curr = curr.next;
		}

		while(head!=null)
		{
			System.out.println(head.data);
			head= head.next;
		}
		
		
		
		
	}

	public static void main(String[] args) {

		Node a = new Node(5);
		Node b = new Node(4);
		Node c = new Node(3);
		Node d = new Node(2);
		Node e = new Node(1);

		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;
		e.next = null;
		reorder(a, 4);
		
		
	}
}