package HW_7;

public class HW_7_04 {

    /* You're writing code to control your town's traffic lights.
    You need a function to handle each change from green, to yellow, to red,
    and then to green again.Complete the function that takes a string as an
    argument representing the current state of the light and returns a
    string representing the state the light should change to. */

    public static String updateLight(String current) {
        if (current == "green") {
            return "yellow";
        } else if (current == "yellow") {
            return "red";
        } else if (current == "red") {
            return "green";
        } else return "";
    }

    public static void main(String[] args) {

        System.out.println(HW_7_04.updateLight("red"));
        System.out.println(HW_7_04.updateLight("green"));
        System.out.println(HW_7_04.updateLight("yellow"));

    }
}
