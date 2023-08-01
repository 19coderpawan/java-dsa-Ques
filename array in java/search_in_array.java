import java.util.*;
public class search_in_array{
    public static void  main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the nth number you  want to take data of -:");
        int num=sc.nextInt();
        int []arr=new int[num];
        int count=0;
        System.out.println("enter the elements of arrays.");
        for(int i=0;i<arr.length;i++){
             arr[i]=sc.nextInt();
        }
        System.out.println("enter the target element ");
        int target=sc.nextInt();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                System.out.println("yes the target element-:"+target+" is present in array");
                 count=1;
            }  
        }
        if(count==0){
            System.out.println("no the target value is not present in the array.");
        }
        sc.close();
    }
}