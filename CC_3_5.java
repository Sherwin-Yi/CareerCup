	// Implement a MyQueue class which implements a queue using two stacks.

	import java.util.Stack;
	public class CC_3_5 {
	
	       // private Queue<String> str = new LinkedList<String>();

		    private Stack<String> inbox = new Stack<String>();
		    private Stack<String> outbox = new Stack<String>();

		    public void queue(String item) {
		        inbox.push(item);
		    }

		    public String dequeue() {
		        if (outbox.isEmpty()) {
		            while (!inbox.isEmpty()) {
		               outbox.push(inbox.pop());
		            }
		        }
		        return outbox.pop();
		    }

		

	}