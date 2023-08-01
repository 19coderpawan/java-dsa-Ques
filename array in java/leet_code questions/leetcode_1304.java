/* Given an integer n, return any array containing n unique integers such that they add up to 0.

 

Example 1:

Input: n = 5
Output: [-7,-1,1,3,4]
Explanation: These arrays also are accepted [-5,-1,1,2,3] , [-3,-1,2,-2,4] */

/* approach can be
 * one approach can be like the following:
if n = 4 then numbers are like [ -2, -1, 1, 2 ]
if n = 5 then numbers are like [ -2, -1, 0, 1, 2 ]
so, we are able to find out that when n is even there is no zero and 
if n is odd then there is 0 at n/2th position of the array. 
And 0th position of the array is n/2 with negative sign.
 */
import java.util.*;
public class leetcode_1304 {
    public static void main(String[] args) {
        int n=5;
        System.out.println(Arrays.toString(sumZero(n)));
        
    }
    public static int[] sumZero(int n) {
        // first thing is to find out the first index value.
        int d=-(n/2);
        int arr[]=new int[n];
        // now check for odd and even.
        if(n%2!=0){
            for(int i=0;i<n;i++){
                arr[i]=d;
                d++;
            }
        }
        // if its is even then . 
        else{
            for(int i=0;i<n;i++){
                // if d==0; then increment it.
                /* this will do two things first is that if n=0 then it will return empty array and 
                 * also in case of even we dont need to include the 0 to find the ans.
                 */
                if(d==0){
                    d++;
                }
                arr[i]=d;
                d++;
            }
        }
        return arr;
    }
}
