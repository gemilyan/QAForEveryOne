package HW_7;

public class HW_7_06 {

    /* Write a function to convert a name into initials.
    This kata strictly takes two words with one space in between them.
    The output should be two capital letters with a dot separating them.  */

    public static String abbrevName(String name) {
        String [] array = name.split("\\s");
        String initials = "";
        for (int i = 0; i < array.length; i++){
            if (i!=array.length-1){
                initials = initials.concat(String.valueOf(array[i].charAt(0)).toUpperCase()).concat(".");
            }
            else {
                initials = initials.concat(String.valueOf(array[i].charAt(0)).toUpperCase());
            }
        }
        return initials;
    }

    public static void main(String[] args) {
        System.out.println(abbrevName("Erich Maria Luisa Remark"));
    }
}
