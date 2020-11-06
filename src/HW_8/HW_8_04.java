package HW_8;

    /* Write a function to split a string and convert it into an array of words */

import java.util.Arrays;

public class HW_8_04 {
    public static String[] stringToArray(String s) {
        String[] s1 = s.split("\\W+");
        return s1;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(stringToArray("I love arrays they are my favorite")));
    }
}
