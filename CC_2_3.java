/*
 * Implement an algorithm to delete a node in the middle of a single linked list, given only access to that node. 
 */
public class CC_2_3 {

    public static boolean removeMiddle(Node mid) 
    {
            if(mid == null || mid.next == null) return false;
            
            mid.data = mid.next.data;
            mid.next = mid.next.next;
            return true;
    }
    

}