
/*
 * Write an algorithm to find the next node(i.e., in-order successor) of a given node in a binary search tree. you may 
 * assume that each node has a link to its parent. 
 */
public class CC_4_6 
{
	public static TreeNode inOrderSucc(TreeNode n)
	{
		if(n == null)  return null;
		if(n.right != null)
			return leftMostChild(n.right);
		else
		{
			TreeNode q = n;
			TreeNode x = q.parent;
			while(x!= null && x.left != q)
			{
				q = x; 
				x = x.parent;
			}
			return x;
		}
	}
	public static TreeNode leftMostChild(TreeNode r)
	{
		if ( r == null)
			return null;
		while(r.left != null)
			r = r.left;
		return r;
	}
}
