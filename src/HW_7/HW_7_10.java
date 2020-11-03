package HW_7;

import java.util.Arrays;

public class HW_7_10 {

    /* Get the sum of all elements of two arrays.
    Each array includes only integer numbers.
    Output is a number too. */

    public static int arrayPlusArray(int[] arr1, int[] arr2) {
        return Arrays.stream(arr1).sum() + Arrays.stream(arr2).sum();
    }

    public static void main(String[] args) {
        System.out.println(arrayPlusArray(new int[]{1,2,3,5,6,7}, new int[]{8,9,10,17}));
    }
}
