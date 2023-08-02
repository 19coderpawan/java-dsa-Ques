/* In this question we have to find the peek of the mountain array.(mountain array=> the 
elements are first in assecending order and then in descending order and the element at top
is the peek element.) here you cant apply liner search because you have to find the ans in O(logn). */

/*
 this is the good example how we can use the binary search when the array is not sorted perfectely.
 */
public class find_mountain_peek_leet_code {
    public static void main(String[] args) {
        int[]arr={0,10,5,2};
       System.out.println(binary_search_tofindpeek(arr)); 
    }
    public static int binary_search_tofindpeek(int[]arr){
        int start=0;
        int end=arr.length-1;
        
        /* so here the condition for loop to terminate is that if only one element is remaning 
         * i.e if your start and end are pointing to the one element then that element will the 
         * largest element in the array .
         * so , at the point when you start==end then return the start or end ;
         */
        while(start!=end){
            int mid=start+(end-start)/2;
            if(arr[mid]<arr[mid+1]){
                // the peek is on the right hand side.
                start=mid+1;
            }
            else if(arr[mid]>arr[mid+1]){
                // the peek might be the mid value or their might be values on the left hand side. 
                //  that is the largest value. that's why.
                end=mid;
            }

        }
        return start;
    }
}
