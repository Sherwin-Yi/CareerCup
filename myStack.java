public class myStack 
{
        StackNode top = null;
        
        public void push(StackNode n) {
                n.next = top;
                top = n;
        }
        
        public StackNode pop() {
                if(top != null) {
                        StackNode n = top;;
                        top = top.next;
                        return n;
                }
                return null;
        }
        
        public StackNode peek() {
                return top;
        }
        
        public boolean isEmpty() {
                return top == null;
        }
        
        public int size() {
                if(top != null) {
                        int count = 0;
                        StackNode n = top;
                        while(n != null) {
                                count++;
                                n = n.next;
                        }
                        return count;
                }
                return 0;
        }
        
        public void print() {
                StackNode n = top;
                while(n != null) {
                        System.out.print(n.value + " ");
                        n = n.next;
                }
                System.out.print("\n");
        }
        
        public static void main(String[] args) {
                myStack stack = new myStack();
                System.out.println(stack.isEmpty());
                stack.push(new StackNode(1));
                stack.push(new StackNode(3));
                stack.pop();
                stack.push(new StackNode(7));
                stack.print();
                stack.pop();
                System.out.println(stack.isEmpty());
                stack.pop();
                stack.pop();
                System.out.print("size:" + stack.size());
                
        }

}
 class StackNode 
{
        int value;
        StackNode next = null;
        StackNode min = null;
        
        public StackNode(int n) 
        {
                value = n;
        }
}
