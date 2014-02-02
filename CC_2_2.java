

/*
 * Implement an algorithm to find the kth to last element of a singly linked list. 
 */

public class CC_2_2 
{
	public static Integer findNth(Node list, int n)
	{
			Node front = list; 
			Node end = list; 
			for(int i = 0; i < n; i++)
			{
				if(end!=null)
					
				end = end.next;
			}
			
			while(end != null)
			{
				end = end.next;
				front = front.next;
			}
			return front.data;
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
			System.out.println(findNth(a,4));
			}
			
}
