/* In this program we are going to see how we can find the target value in the infinite array.
 * (ie. basically when you dont know the size of the array. means you cant use arr.length in code.)
 */
public class find_target_in_infinite_arr {
    public static void main(String[] args) {
        /* so we can easily seach the target value uisng the binary search but here we dont 
         * know what is the start and end of the array.
         * so our first job is to find the start and end of the array.
         */
        int []arr={1,2,3,4,5,6,7,8,9};
        int target=6;
       System.out.println(findrange(arr, target)); 
    }
    public static int findrange(int[]arr, int target){
        /* so, how are we going to find out the range it's simple we are going to divide the arr
         * into smaller chunks and try to find the target in them if target is not found in that chunk 
         * we will double the size of the next chunks as compare to previous chunks and then find the 
         * target in it and if target in not present we will again find the target in the next 
         * chunk which is double the size of pre chunk.
         */
        // firstly lets assume that are first chunk is of length 2.
        int start=0;
        int end=1;
        // now if target in not in the chuck lets double it.
        while(target>arr[end]){
            //  we are going to use an temperory variable to store the new start
            int newstart=end+1;
            // and your end will we end=previous end+(sizeof previous box*2);
             end= end+(end-start+1)*2;
            //  here we have updted start later on becaue we have to use the pre value of start in above 
            // formula for start.
             start=newstart;
        }
       return  binary_search(arr,target,start,end);
    }
    public static int binary_search(int[]arr,int target,int start,int end){
        while(start<=end){
        int midvalue=start+(end-start)/2;

        if(arr[midvalue]==target){
           return midvalue;
        }
        else if(arr[midvalue]<target){
           start=midvalue+1;;
        }
        else if(arr[midvalue]>target){
            end=midvalue-1;
        }
    }
    return -1;
    }
}
