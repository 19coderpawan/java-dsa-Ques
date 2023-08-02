

public class first_linear_search{
    public static void main(String[] args) {
        int[]arr={23,44,332,55,66,77,12,32};
        int target=87;
        int ans=linear_search(arr,target);
        System.out.println("the target value is present at index"+ans);
    }
    public static int linear_search(int[]arr,int target){
        if(arr.length==0){
            return -1;
        }
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]==target){
        //         return i;
        //     }
        // }
        for(int element:arr){
            if(element==target){
                return element;
            }
        }
        return Integer.MAX_VALUE;
    }
}