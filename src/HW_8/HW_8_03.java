package HW_8;

    /* Get the number n (n>0) to return the reversed sequence from n to 1. */

import java.util.Arrays;

public class HW_8_03 {
    public static int[] reverse(int n) {
        int[] res = new int[n];
        for (int i=0; i<n; i++) {
            res[i] = n - i;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(reverse(10)));
    }
}
