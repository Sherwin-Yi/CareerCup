//Implement a function to check if a binary tree is a binary search tree. 

public class CC_4_5 {
	public static boolean IsValidBST(TreeNode tn) {
		if (tn == null)
			return true;
		else if ((tn.value > tn.left.value) && (tn.value < tn.right.value)) 
		{
			
			return IsValidBST(tn.left) && IsValidBST(tn.right);
		}

		else
			return false;
	}
}
