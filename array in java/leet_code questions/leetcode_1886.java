/*  Determine Whether Matrix Can Be Obtained By Rotation
Easy
1.3K
99
Companies
Given two n x n binary matrices mat and target, return true if it is possible to make mat equal to target by rotating mat in 90-degree increments, or false otherwise.

 

Example 1:


Input: mat = [[0,1],[1,0]], target = [[1,0],[0,1]]
Output: true
Explanation: We can rotate mat 90 degrees clockwise to make mat equal target.

Example 2:
Input: mat = [[0,0,0],[0,1,0],[1,1,1]], target = [[1,1,1],[0,1,0],[0,0,0]]
Output: true
Explanation: We can rotate mat 90 degrees clockwise two times to make mat equal target.*/
import java.util.*;
public class leetcode_1886 {
    public static void main(String[] args) {
        int[][]mat={
            {0,0,0},
            {0,1,0},
            {1,1,1}
        };
        int [][]target={
            {1,1,1},
            {0,1,0},
            {0,0,0}
        };
       System.out.println( findRotation(mat, target));

    }
    public static boolean findRotation(int[][] mat, int[][] target) {
       for(int i=0;i<4;i++){
        rotateMatrix(mat,target);
        if(equalsmatrix(mat,target)){
            return true;
        }
       }
       return false;
    }
    public static void rotateMatrix(int[][] mat,int[][]target){
        // transpose the matrix.
        for(int i=0;i<mat.length;i++){
            // here j=i+1 because we know that certain elements remains on the same postion like [0,0] so 
            // there is no point in traversing or shifting them.
            for(int j=i+1;j<mat.length;j++){
                // preform swap here.
                int temp=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=temp;
            }
        }
        // Now to rotate it 90 dec you have to reverse the transpose of the matrix.
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat.length/2;j++){
                // now swap again.
                int temp=mat[i][j];
                mat[i][j]=mat[i][mat.length-1-j];
                mat[i][mat.length-1-j]=temp;
            }
        }
    }
    public static boolean equalsmatrix(int[][] mat,int[][] target){
        for(int row=0;row<mat.length;row++){
           if(!Arrays.equals(mat[row],target[row])){
            return false;
        }
        }
        return true ;
        
    }
}
