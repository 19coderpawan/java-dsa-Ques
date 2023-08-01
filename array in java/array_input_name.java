import java.util.*; 
public class array_input_name {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String  []arr=new String [5];
        System.out.println("enter your name");
        for(int i=0;i<arr.length;i++){
           arr[i]=sc.nextLine();
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        sc.close();
    }
}
