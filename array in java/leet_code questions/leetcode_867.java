/* Given a 2D integer array matrix, return the transpose of matrix.

The transpose of a matrix is the matrix flipped over its main diagonal, switching the matrix's row and column indices.

 */

import java.util.Arrays;

public class leetcode_867{
    public static void main(String[] args) {
        int [][]matrix={
            {1,2,3},
            {4,5,6}
        };
      int [][]ans=  transpose(matrix);
      for(int i=0;i<ans.length;i++){
        System.out.println(Arrays.toString(ans[i]));
      }

    }
    public static int[][] transpose(int[][] matrix) {
        int row=matrix[0].length;
        int col=matrix.length;
        int mrow=0;
        int [][]ans=new int[row][col];
        for(int i=0;i<ans.length;i++){
            for(int j=0;j<ans[i].length;j++){
                ans[i][j]=matrix[mrow][i];
                mrow++;
            }
            mrow=0;
        }
        return ans;

    }
 }