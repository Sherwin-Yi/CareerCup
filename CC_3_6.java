
/*
	 * Write a program to sort a stack in ascending order(with biggest items on the top). You may use at most one additional
	 * stack to hold items, but you may not copy the elements into any other data structure(such as an array). 
	 * The stack supports the following operations: push, pop, peek, and isEmtpy. 
	 * */

import java.util.Stack;

public class CC_3_6 {

		public static Stack<Integer> sort (Stack<Integer> s)
		{
			Stack<Integer> r = new Stack<Integer>();
			while(!s.isEmpty())
			{
				int tmp = s.pop();
				while(!r.isEmpty() && r.peek() > tmp)
				{
					  s.push( r.pop());
				}
				r.push(tmp);
			}
			
			return r;
		}

	}