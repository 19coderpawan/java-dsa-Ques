import java.util.*;
public class swap_in_array {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};

        swap(arr,0,4);
        System.out.println(Arrays.toString(arr));

    }
    public static void swap(int[] arr,int index0,int index1){
            int temp=arr[0];
            arr[0]=arr[4];
            arr[4]=temp;

    }
}
