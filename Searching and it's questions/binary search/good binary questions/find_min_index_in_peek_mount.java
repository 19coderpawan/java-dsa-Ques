// in this program you have to find the target value first which is of minimum index in the pekk of the mountain
// problem.leet code Q[1095].

public class find_min_index_in_peek_mount{
    public static void main(String[] args) {
        int[] arr={0,5,3,1};
        int target=3;
       int peek= peek_element(arr,target);
       System.out.println(peek);
       int first_half= binary_search(arr,target,0,peek);
       if(first_half==-1){
        System.out.println("second");
        int second_half=binary_search(arr, target, peek+1,arr.length-1);
        System.out.println(second_half+"is ans");
       }
       else{
           System.out.println(first_half);
       }
      
       
    }
    public static int peek_element(int[]arr,int target){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]<arr[mid+1]){
                start=mid+1;
            }
            else{
                end=mid;
            }
        }
        return start;
    }
    public static int binary_search(int[]arr,int target,int start,int end){
        System.out.println("the start value is"+start);
        boolean isAsc=arr[start]<arr[end];
        System.out.println(isAsc);
        int ans=-1;
        if(target > arr[end] && target > arr[start]){
            return -1;
        }
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                   System.out.println("came in this");
                    ans=mid;
                   System.out.println("here is the ans"+ans);
                    end=mid-1;
                }
           else if(isAsc==true){
                System.out.println("start");
                if(arr[mid]<target){
                    // System.out.println(1);
                    start=mid+1;
                }
                else if(arr[mid]>target){
                    // System.out.println(2);
                    end=mid-1;
                }
                
            }
            else if(isAsc==false) {
                System.out.println("decs");
                if(arr[mid]<target){
                    end=mid-1;
                }
                else if(arr[mid]>target){
                    start=mid+1;
                }
               
            }
        }
        System.out.println(ans);
        return ans;
        
    }
}