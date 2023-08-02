// this is a program based on binary search .
// also remember that binary search algo only works with the sorted array.
public class binary_search1{
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,8,9,100};
        int target=100;
        int start=0,end=arr.length-1;
      if(binary_search(arr, target, start, end)!=-1){
       System.out.println("the target value is present i.e:-"+binary_search(arr,target,start,end)); 
      }
      else{
        System.out.println("no such element is present");
      }
    }
     public static int binary_search(int[]arr,int target,int start,int end){
        // first step is to find the mid value of the array.
        
        while(start<=end){
    /*  Remember here we cant use this method to find the midvalue for very large number
        because the midvalue mid exceed the limitation of the int range.
        so , we have a better formula to find the midvalue even in case of the larger number.
     */
        // int midvalue=(start+end)/2;
        int midvalue=start+(end-start)/2;

        if(arr[midvalue]==target){
           return arr[midvalue];
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