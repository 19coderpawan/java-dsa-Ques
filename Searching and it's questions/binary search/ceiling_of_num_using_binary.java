// here we are going to find the ceiling of number i.e(smallest num greater than target number.)
public class ceiling_of_num_using_binary {
    public static void main(String[] args) {
        int arr[] = { -1,-2, 3, 4, 5, 6, 8, 9, 100 };
        int target = 7;
        int start = 0, end = arr.length - 1;
        System.out.println("the target value is present i.e =" + binary_search(arr, target, start, end));
    }

    public static int binary_search(int[] arr, int target, int start, int end) {

 // but what if your target element is the largest in the arr then what simple we wont find ceiling of num.
        
       if(target>arr[arr.length-1]){
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
        return arr[start];
    }
}