// now here in this case we have to find out the greatest number which is smaller than target value.
public class floor_of_num_using_binary {
    public static void main(String[] args) {
         int arr[] = { 1,2, 3, 4, 5, 6, 8, 9, 100 };
        int target = 0;
        int start = 0, end = arr.length - 1;
        System.out.println("the target value is present i.e =" + binary_search(arr, target, start, end));
    }

    public static int binary_search(int[] arr, int target, int start, int end) {
//in this case what if the target is the smallest nnumber than any of the num in array.simple no floor.
     if(target<arr[0]){
        return -1;
     } 

        while (start <= end) {

            int midvalue = start + (end - start) / 2;

            if (arr[midvalue] == target) {
                return arr[midvalue];
            } else if (arr[midvalue] < target) {
                start = midvalue + 1;
                
            } else if (arr[midvalue] > target) {
                end = midvalue - 1;
            }
        }
        return arr[end];
    }
}
