/*
 * Given an image represented by an n*n matrix, where each pixl in the image is 4 bytes, write a method to rotate
 * the image by 90 degrees. Can you do this in place?
 */

public class CC_1_6 {

	public static void rotate(int[][] matrix, int n)
	{
		for(int layer = 0; layer < n/2; ++layer)
		{
			int first = layer; 
			int last = n -1 - layer;
			for(int i = first; i < last; ++i)
			{
				int offset = i - first;
				
				int top = matrix[first][i];
				matrix[first][i] = matrix[last - offset][first];
				matrix[last-offset][first] = matrix[last][last - offset];
				matrix[last][last - offset] = matrix[i][last];
				
				matrix[i][last] = top;
			}
		}
	}
	

}
