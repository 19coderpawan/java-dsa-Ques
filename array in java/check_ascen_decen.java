import java.util.*;
public class check_ascen_decen{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int[]arr=new int[4];
        System.out.println("enter the element in array");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int count=0;
        
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]<arr[i+1] || arr[i]>arr[i+1]){
              count++;
            }
        }
      
      
        if(count==arr.length-1){
            System.out.println("its an sorted array ");
        }
        else{
            System.out.println("its not a sorted array");
        }
        sc.close();
    }
}