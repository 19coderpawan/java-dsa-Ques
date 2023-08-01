import java.util.*;
public class array_methods_to_print{
    public static void main(String[] args){
        // to input.
       Scanner sc=new Scanner(System.in);
        int[] arr= new int[5];

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        // to print.
        // for(int i=0;i<arr.length;i++){
        //     System.out.print(arr[i]+" ");
        // }


        // we can aslo use ehanced loop also i.e for each loop.
        // for(int num:arr){ // for each element in array print the element.
        //     System.out.print(num+" ");// here num represent the elements in the array.
        // }

        // another good method to print is use the Array.toString() method.
        System.out.println(Arrays.toString(arr));// it will convert the arr to string and then print.
    }
}