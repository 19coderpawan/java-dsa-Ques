import java.util.*;
/*  There is an m x n matrix that is initialized to all 0's. There is also a 2D array indices where each indices[i] = [ri, ci] represents a 0-indexed location to perform some increment operations on the matrix.

For each location indices[i], do both of the following:

Increment all the cells on row ri.
Increment all the cells on column ci.
Given m, n, and indices, return the number of odd-valued cells in the matrix after applying the increment to all locations in indices.

 

Example 1:


Input: m = 2, n = 3, indices = [[0,1],[1,1]]
Output: 6
Explanation: Initial matrix = [[0,0,0],[0,0,0]].
After applying first increment it becomes [[1,2,1],[0,1,0]].
The final matrix is [[1,3,1],[1,3,1]], which contains 6 odd numbers. */

public class leetcode_1252 {
    public static void main(String[] args) {
        int [][]indices={
            {0,1},
            {1,1}
        };
        int m=2;
        int n=3;
        System.out.println(oddCells(m,n,indices));
    }
     public static int oddCells(int m, int n, int[][] indices) {
        int count=0;
        // first lets take an initial arr.
        int inital[][]=new int[m][n];

        // firstly we are going to update the rows of the initial arr.
        for(int i=0;i<indices.length;i++){
            int row=indices[i][0];
            int col=0;
            while(col<n){
                inital[row][col]+=1;
                col++;
            }
        }
        // now we are going to update the col of the initial arr.
        for(int i=0;i<indices.length;i++){
            int row=0;
            int col=indices[i][1];
            while(row<m){
                inital[row][col]++;
                row++;
            }
        }
        // now count the odd values in inital arr and return the count.
       
        

        for(int i=0;i<m;i++){
           for(int j=0;j<n;j++){
            if(inital[i][j]%2!=0){
                count++;
            }
           }
        }
        for(int i=0;i<inital.length;i++){
            System.out.println(Arrays.toString(inital[i]));
        }
        
        return count;
    }

}
