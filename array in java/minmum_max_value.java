// in this program we have to find the minimum and maximum value .well we can find it using ususll method but in java we have specific constants for them.

import java.util.*;
public class minmum_max_value{
     public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int max=Integer.MIN_VALUE; // here this integer stores the minimum value .
        int min=Integer.MAX_VALUE; // here this integer stores the maximum value.
        for(int i=0;i<arr.length;i++){
           if(arr[i]<min){
            min=arr[i];
           }
           else if(arr[i]>max){
            max=arr[i];
           }
        }
        System.out.println("the maximum value is "+max);
        System.out.println("the minimum value is "+min);
        sc.close();
     }
}