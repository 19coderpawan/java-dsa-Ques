/* so, in this program you have to find the target in the rotated sorted array which is been rotated from the 
 * unknown pivot element.(pivot element is the largest element in the array.)
 */

 /* Steps to follow to solve this problem 
  1>find the pivot element in the rotated array.
    --to find the pivot element you have to follow these steps.
      1.1> case1=>if mid>mid+1 return mid as it is a pivot element. 

 */
public class find_target_in_rotated_arr {
    public static void main(String[] args) {
        int []nums={2,9,9,2,2,2};
        int target=2;
        int pivot=find_pivot(nums,target);
        System.out.println(pivot);
        int first_half=binary_search(nums,target,0,pivot);
        if(first_half==-1){
            int second_half=binary_search(nums,target,pivot+1,nums.length-1);
            System.out.println(second_half);
        }
        else{
            System.out.println(first_half);
        }
    }
    public static int find_pivot(int []nums,int target){
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            // 1case
            if(mid<end && nums[mid]>nums[mid+1]){
                return mid;
            }
            else if(mid>start&&nums[mid]<nums[mid-1]){
                return mid-1;
            }
            else if(nums[start]>=nums[mid]){
                end=mid-1;
            }
            else if(nums[start]<nums[mid]){
                start=mid+1;
            }
        }
        return -1;
    }
    public static int binary_search(int[]nums,int target,int start,int end){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target){
                return mid;
            }
            if(nums[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
}
