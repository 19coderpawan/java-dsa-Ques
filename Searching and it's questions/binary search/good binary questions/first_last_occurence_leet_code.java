/*  this ques is the leet code question in which you have to find the first and last occurence of the 
target value in the array and return in the array.*/

/*Given an array of integers nums sorted in non-decreasing order, find the starting and 
ending position of a given target value .
If target is not found in the array, return [-1, -1].
You must write an algorithm with O(log n) runtime complexity.*/

import java.util.Arrays;

public class first_last_occurence_leet_code {
    public static void main(String[] args) {
        int[]nums={5,7,7,8,8,10};
        int target=7;
        int[] ans={-1,-1};
        int start=binary_search(nums,target,true);
        int end=binary_search(nums,target,false);
         ans[0]=start;
         ans[1]=end;
         System.out.println(Arrays.toString(ans));
    }
   public static int  binary_search(int[] nums,int target,boolean isFirst){
        int start=0;
        int end=nums.length-1;
        int ans=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target){
                ans=mid;// however it's only a possibility.
                // we need to check whether for the possibility of the element in the right and left side of arr.
                // to check in the left side to find the first occurence.
                if(isFirst==true){
                   end=mid-1;
                }
                else{
                    start=mid+1;
                } 
            }
            else if(nums[mid]<target){
               start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
         return ans;
        }
               
    }       

