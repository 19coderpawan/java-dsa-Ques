import java.util.*;
public class search_in_2D {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the rows.");
        int row=sc.nextInt();
        System.out.println("enter the coloumn");
        int col=sc.nextInt();
        int [][]arr=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("enter the value you want to find");
        int target=sc.nextInt();
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(arr[i][j]==target){
                    System.out.println("the target is at location"+"{"+i+","+j+"}");
                }
            }
        }
        sc.close();
    }
}
