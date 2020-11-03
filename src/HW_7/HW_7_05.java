package HW_7;

public class HW_7_05 {

    /* Write a function called repeat_str which repeats the given string src exactly count times. */

    public static String repeatStr(final int repeat, final String string) {
        String s = "";
        for (int i=0; i < repeat; i++) {
            s += string;
        }
        return s;
    }

    public static void main(String[] args) {

        System.out.println(repeatStr(15, "Hello"));

    }

}

