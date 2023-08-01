import java.util.*;
public class first_2D_array{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no of rows");
        int row=sc.nextInt();
        System.out.println("enter the number of coloumn");
        int col=sc.nextInt();
        int [][]arr=new int [row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("your data is ");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(arr[i][j]+" "); // with this way we can print our output in matrix order.
            }
            System.out.println();
        }
        sc.close();
    }
}