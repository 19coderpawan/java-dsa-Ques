import java.util.*;
public class twod_arr_declaration_and_imp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [][] arr=new int[2][3];
        // remember it's necessary to define the size of the row but not necessary to define the size of 
        // coloumn as the coloumn of individual elements may vary.

        // another way to declare the 2d array.
        // int [][] arr2={
        //     {1,2,3},
        //     {4,5},
        //     {6,7,8,9}
        // };// here also the coloumn of each individual array is different.

        //  input the 2d array.
        System.out.println(arr.length); // arr.length provide us the no of rows in the array.
         for(int row=0; row<arr.length;row++){
           for(int col=0; col< arr[row].length;col++){
              arr[row][col]=sc.nextInt();
           }
         }
        //  for(int row=0;row<arr.length;row++){
        //     for(int col=0;col<arr[row].length;col++){
        //         System.out.print(arr[row][col]+" ");
        //         // if(col+1==arr[row].length){
        //         //     System.out.println();
        //         // } can do this also to represent in the form of matrix.
        //     }
        //     // or you can simply print new line at the end of every row.
        //     System.out.println();
        //  }

        //  another way to display the 2d array.
        for(int row=0;row<arr.length;row++){
            // here the method is going to convery each row of an array in string individualy each time.
           System.out.println(Arrays.toString(arr[row]));
        }

        // another way to display the 2d array will we enhanced array will be.
        for(int[] a:arr){
            // here for each row of an arrar[a] in the array arr it will print each row of array a.
            System.out.println(Arrays.toString(a)); 
        }
    }
    
}
