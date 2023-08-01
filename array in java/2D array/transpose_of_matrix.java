import java.util.*;
public class transpose_of_matrix {
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        System.out.println("enter the row");
        int row=sc.nextInt();
        System.out.println("enter the coloumn");
        int col=sc.nextInt();
        int [][]arr=new int[row][col];
        for(int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("the transpose of the matrix is -:");
        for(int j=0;j<col;j++){
            for(int i=0;i<row;i++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
