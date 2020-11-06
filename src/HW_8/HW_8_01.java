package HW_8;

    /*Complete the method that takes a boolean value and return a
    "Yes" string for true, or a "No" string for false. */

public class HW_8_01 {
    public static String boolToWord(boolean b) {
        if (b){
            return "Yes";
        }
        return "No";
    }

    public static void main(String[] args) {

        System.out.println(boolToWord(true));
        System.out.println(boolToWord(false));
    }
}
