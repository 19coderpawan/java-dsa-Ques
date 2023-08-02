/* in this question we have to find the target in 2D array where your arr is sorted in row wise and 
 * coloumn wise manner.
 */

import java.util.Arrays;

public class first_2d_search {
    public static void main(String[] args) {
        int [][]arr={
        {10,20,30,40},
        {15,25,35,45},
        {28,29,37,49}
        //  {1,2,3,4},
        // {5,6,7,8},
        // {9,10,11,12}
    };
    int target=27;
    System.out.println(Arrays.toString(binary_search(arr,target)));
    }
    public static int[] binary_search(int[][]arr,int target){
        int start=0;// row 
        int end=arr[0].length-1;// last col of the row .

        System.out.println(arr.length);
        while(start<arr.length && end>=0){
            System.out.println("end value-:"+end);
            System.out.println("start value-:"+start);
            if(arr[start][end]==target){
                return new int[]{start,end};
            }
            else if(arr[start][end]>target){
                end--;
                
            }
            else if(arr[start][end]<target){
                start++;
                
            }
            
        }
        System.out.println("end value-:"+end);
            System.out.println("start value-:"+start);
        return new int[]{-1,-1};
    }
}
