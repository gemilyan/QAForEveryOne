package HW_7;

public class HW_7_08 {

    /* Create a function that will return a string that combines all
     of the letters of the three input strings in groups.
     Taking the first letter of all of the inputs and grouping them
     next to each other. Do this for every letter, see example below!
    E.g. Input: "aa", "bb" , "cc" => Output: "abcabc"
        Note: You can expect all of the inputs to be the same length.*/

    public static String tripleTrouble(String one, String two, String three) {
        String result = "";
        for (int i = 0; i < one.length(); i++){
            result = result.concat(""+one.charAt(i)+(two.charAt(i))+(three.charAt(i)));
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(tripleTrouble("this", "test", "lock"));
    }

}
