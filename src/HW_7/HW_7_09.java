package HW_7;

public class HW_7_09 {

    /* When provided with a letter, return its position in the alphabet.
        Input - "a"
        Output - "Position of alphabet: 1" */

    public static String position(char alphabet){
        return "Position of alphabet: " + ((int)alphabet - 96);
    }

    public static void main(String[] args) {
        System.out.println(position('z'));
    }
}
