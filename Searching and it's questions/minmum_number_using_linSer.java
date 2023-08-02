public class minmum_number_using_linSer {
    public static void main(String[] args) {
        int[]arr={23,43,54,6,76,87};
        System.out.println(min(arr));
    }
    public static int min(int[]arr){
        if(arr.length==0){
            return -1;
        }
        int min=arr[0];
        for(int element:arr){
            if(element<min){
               min=element;
            }
        }
        return min;
    }
}
