public class simple_maximum_num_array {
    public static void main(String[] args) {
        int[] arr={1,3,4,5,677,8,33,4000};
        System.out.println(max(arr));
    }
    static int max(int[] arr){
        int max=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]<arr[i+1]){
                max=arr[i+1];
            }
        }
        return max;

    }
}
