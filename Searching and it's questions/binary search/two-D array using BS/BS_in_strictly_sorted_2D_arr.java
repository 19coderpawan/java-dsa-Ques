/* in this program we are going to search strictly sorted 2D array using Binary search.we can use the previous
program also to search in 2D array but the TC(n) remains but if you want the time complexity (logn). use
this approach.*/
import java.util.*;
public class BS_in_strictly_sorted_2D_arr {
    public static void main(String[] args) {
        int [][]arr={
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
        int target=15;
        // System.out.println(arr[0].length);
        System.out.println(Arrays.toString(search(arr,target))) ;
    }
    /* this will search in the the provided row and the cStart and cEnd here say the 
     * range of the column you have to search in that particular row.
     */
    public static int[] binary_search(int[][]arr,int row,int cStart,int cEnd,int target){
       while(cStart<=cEnd){
        int mid=cStart+(cEnd-cStart)/2;
        if(arr[row][mid]==target){
            return new int[]{row,mid};
        }
       else if(arr[row][mid]>target){
            cEnd=mid-1;
        }
        else{
            cStart=mid+1;
        }
       }
       return new int[]{-1,-1};
    }

    public static int[] search(int[][]arr,int target){
        // there might be possibilites that you arr is 1D so in that case we have 1 row only and for col.
        int row=arr.length;
        // System.out.println(row);
        int col=arr[0].length;
    // if you have only one row simply apply binary search on it.
        if(row==1){
            return binary_search(arr,0,0,col-1,target);
        }
    /* now what you have to do is find the remaning  rows by eleminating the not required rows. */
    int rStart=0;
    int rEnd=row-1;
    // System.out.println(rEnd);
    int cmid=col/2;
    // System.out.println(cmid);
    while(rStart<(rEnd-1)){ // this will run when we have more than 2 rows.
    //    we are going to perfrom our three cases.
    // System.out.println("enter into the while loop");
    int mid=rStart+(rEnd-rStart)/2;

    if(arr[mid][cmid]==target){
        return new int[]{mid,cmid};
    }
    else if(arr[mid][cmid]>target){
        rEnd=mid;
    }
    else{
        rStart=mid;
    }
    }
    // once the loops has terminated we now have tow rows.
    //  firstly we have to check if the mid col elements are equal to the targets.
      if(arr[rStart][cmid] == target){
        return new int[]{rStart,cmid};
      }
    //   if not check the midcol next element.
     else if(arr[rStart+1][cmid]==target){
        return new int[]{rStart+1,cmid};
     }
    //  other wise check in the other four  parts of the row's.
    // first part .
    else if(arr[rStart][cmid-1]>=target){
        return binary_search(arr,rStart,0,cmid-1,target);
    }
    // second part.
    else if(arr[rStart][cmid+1]<=target && target<=arr[rStart][col-1]){
        return binary_search(arr, rStart, cmid+1, col-1, target);
    }
    // third part
    else if(arr[rStart+1][cmid]>=target){
        return binary_search(arr, rStart+1, 0, cmid-1, target);
    }
    // forth part
    else if(arr[rStart+1][cmid+1]<=target && target<=arr[rStart+1][col-1]){
        return binary_search(arr, rStart+1, cmid+1, col-1, target);
    }
    return new int[]{-1,-1};
    }
}
