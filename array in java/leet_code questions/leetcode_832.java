import java.util.*;
public class leetcode_832{
    public static void main(String[] args) {
        int[][] image = {
                {1, 1, 0},
                {1, 0, 1},
                {0, 0, 0}
        };
        flipAndInvertImage(image);
        for(int i=0;i<image.length;i++){
            System.out.println(Arrays.toString(image[i]));
        }
        // System.out.println(Arrays.deepToString(image));
    }

    public static void flipAndInvertImage(int[][] image) {
        for (int i = 0; i < image.length; i++) {
            int left = 0;
            int right = image[i].length - 1;

            while (left <= right) {
                int temp = image[i][left];
                image[i][left] = 1- image[i][right];
                image[i][right] = 1- temp;
                left++;
                right--;
            }
        }
    }
}