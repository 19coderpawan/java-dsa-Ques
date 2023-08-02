/* In this we have to find the smallest of the largest sum. */
public class split_array_largest_sum {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5};
        int k=2;
        System.out.println(splitArray(arr,k));
        

    }
    public static  int splitArray(int[] nums, int k) {
        // first thing to do is to find the range i.e max and min value.
        int start=0;//min value
        int end=0;//max value
        for(int i=0;i<nums.length;i++){
         start=Math.max(start,nums[i]);// to find the largest element in array.
         end+=nums[i];
        }

        // once you got the range now it's time to apply binary search.
        while(start<end){
            int mid=start+(end-start)/2;
            // now we have to calculate the no of pieces in which you can split the arr with max sum i.e(mid).
            int sum=0;
            int pieces=1;// atleast once you can split the arr.
            for(int num:nums){
                if(sum+num>mid){
                    // if your num exceed the mid then add in another subarr. 
                    sum=num;
                    // if new subarr is created then no of splits also increases.
                    pieces++;
                }
                else{
                    // if the case fails then simply add the nums in the first subarray.
                    sum+=num;
                }
            }
          if(pieces<=k){
            end=mid;
          }
          else if(pieces>k){
            start=mid+1;
          }
        }

        return end;
    }
}
