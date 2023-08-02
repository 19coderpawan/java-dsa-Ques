public class search_max_in_2Darray {
    public static void main(String[] args) {
        int[][]arr={
            {2,3,4},
            {56,76,100},
            {300,200,1000}
        };
        System.out.println(max(arr));
    }
    public static int max(int[][]arr){
        if(arr.length==0){
            return -1;
        }
        int max=arr[0][0];
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col]>max){
                    max=arr[row][col];
                }
            }
        }
        return max;
    }
}
