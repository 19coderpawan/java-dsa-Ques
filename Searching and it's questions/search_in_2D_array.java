import java.util.Arrays;

public class search_in_2D_array {
    public static void main(String[] args) {
        int [][]arr={ // this is how we initilize the 2D array in java directly.
            {2,3,4},
            {7,5,6},
            {8,9,29}
        };
        System.out.println(Arrays.toString(search(arr,80)));
    }
    public static int[] search(int[][]arr,int target){
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col]==target){
                    return new int[]{row ,col}; // now here we have to return an new array with {row,col}
                }
            }
        }
        return new int[]{-1,-1};
    }
    
}
