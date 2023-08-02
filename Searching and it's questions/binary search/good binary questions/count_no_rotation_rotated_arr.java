/* in this program we know that how many times the rotation happens in the roataed array. 
 *  for theroy explanation go to the notes in my notebook.
*/
public class count_no_rotation_rotated_arr {
    public static void main(String[] args) {
        int []arr={1,2,3,12,15,18};
        int pivot_count=find_pivot(arr);
        System.out.println("the no of rotation happens in the rotated arr are ->"+(pivot_count+1));
    }
    public static int find_pivot(int[]arr){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            else if(mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            else if(arr[start]<=arr[mid]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
      
    }
}
