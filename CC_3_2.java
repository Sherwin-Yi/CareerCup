/*
 * How would you design a stack which, in addition to push and pop, also has a function min which returns the minimum element? 
 * push, pop, and min should all operate in O(1) time. 
 */

public class CC_3_2 extends myStack {

	public void push(StackNode n) {
		super.push(n);

		if (n.next == null || n.value < n.next.min.value) {
			n.min = n;
		} else {
			n.min = n.next.min;
		}
	}

	public StackNode min() {
		return top.min;
	}

	public static void main(String[] args) {
		CC_3_2 stack = new CC_3_2();
		stack.push(new StackNode(3));
		stack.push(new StackNode(5));
		stack.push(new StackNode(7));
		stack.push(new StackNode(1));
		stack.push(new StackNode(2));
		stack.print();
		System.out.print("min: " + stack.min().value);
	}
}
