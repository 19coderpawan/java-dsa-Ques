import java.util.*;
public class array_using_loops {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int[] marks=new int[10];
        System.out.println("enter the five subject marks ");
        for(int i=0;i<5;i++){
            System.out.print("enter the subject "+i+" mark:-");
            marks[i]=sc.nextInt();
        }
        System.out.println("-------------------------------------------------------------------------------------------------");
        for(int i=0;i<5;i++){
            System.out.println("the marks for subject"+i+"is "+marks[i]);
        }
        sc.close();
    }
}
