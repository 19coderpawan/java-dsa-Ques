import java.util.Arrays;

public class reverse_the_array {
    public static void main(String[] args) {
        int[] arr={2,3,4,5,6};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void reverse(int[] arr){
        // **** This is one way to do it but not good so let's try another easy approach that is 2 pointer****
    //    int[]arr2=new int[arr.length];
    //    int first=0;
    //    for(int i=arr.length-1;i>=0;i--){
    //     arr2[first]=arr[i];
    //     first++;
    //    }
    //    System.out.println(Arrays.toString(arr2));
    //    return arr2;

    /*  so in 2 pointer what we are going to do is we are having two pointer start and end 
          and we are going to swap the value's on those pointer than going to move the pointer 
          forward and backward . lets do the practical application!*/
     
     int start=0;
     int end=arr.length-1;
     while(start<end){
        swap(arr,start,end);
        start++;
        end--;
     }     
    }
    static void swap(int[]arr,int start,int end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
}
