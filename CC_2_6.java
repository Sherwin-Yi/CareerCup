/*
 * 	Given a circular linked list, implement an algorithm which returns the node at the beginning of the loop. 
 */


public class CC_2_6 
{
	
	/* a very tricky solution */
    public static Node findLoop(Node head) {
            Node fastRunner = head.next.next;
            Node slowRunner = head.next;
            
            while(fastRunner != slowRunner && fastRunner != null && slowRunner != null) {
                    fastRunner = fastRunner.next.next;
                    slowRunner = slowRunner.next;
            }
            slowRunner = head;
            while(slowRunner != fastRunner) {
                    slowRunner = slowRunner.next;
                    fastRunner = fastRunner.next;
            }
            return fastRunner;
    }
    
    public static void main(String[] args) {
            /* 1 -> 2 -> 3 -> 4 ->5 -> 3 */
            Node n1 = new Node(1); 
            n1.next = new Node(2);
            n1.next.next = new Node(3);
            n1.next.next.next = new Node(4);
            n1.next.next.next.next = new Node(5);
            		        
            Node n3 = n1.next.next;
            Node n5 = n3.next.next;
            n5.next = n3;
            //n1.print();
            Node loopStart = findLoop(n1);
            System.out.print(loopStart.data);
    }
}