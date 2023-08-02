/*
   Order agnostic binary search says that you are given an array which is sorted you know,
     but you dont know in which manner i.e either in accending or descending order.
     because in both the case you have different approach . so you first job is to find out
     the order in which the array is being sorted.

     So, in order to find out the order what we are going to do is we are going to compare any 
     two element in the array and check for the order. suppose if we take frist and last element 
     as they are the best tow element you can pick . so, if last element is greater then the order is 
     ascending and if first element is greater then the order is in descending order.
 */

public class order_agnositc_binary_search {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 100 };
        int target = 100;
        int start = 0, end = arr.length - 1;

        if (binary_search_asc(arr, target, start, end) != -1) {
            System.out.println("the target value is present at index= " + binary_search_asc(arr, target, start, end));
        } else {
            System.out.println("no such element is present");
        }

    }

    public static int binary_search_asc(int[] arr, int target, int start, int end) {
        /* now we have to first find out the order of the array. */
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            // first step is to find the mid value of the array.
            /*
             * Remember here we cant use this method to find the midvalue for very large
             * number
             * because the midvalue mid exceed the limitation of the int range.
             * so , we have a better formula to find the midvalue even in case of the larger
             * number.
             */
            // int midvalue=(start+end)/2;
            int midvalue = start + (end - start) / 2;

            if (arr[midvalue] == target) {
                return midvalue;
            }

            if (isAsc) {
                if (arr[midvalue] < target) {
                    start = midvalue + 1;
                } else {
                    end = midvalue - 1;
                }
            }

            if (isAsc == false) {// is isAsc is false means the order is descending.
                if (arr[midvalue] < target) {
                    end = midvalue - 1;
                } else {
                    start = midvalue + 1;
                }
            }

        }
        return -1;
    }
}
