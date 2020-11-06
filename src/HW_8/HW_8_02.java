package HW_8;

    /* Create a function that does four basic mathematical operations.
       The function should take three arguments - operation(string/char), value1(number), value2(number).
       The function should return result of numbers after applying the chosen operation. */

public class HW_8_02 {

    public static Integer basicMath(String op, int v1, int v2)
    {
        switch (op) {
            case "+":
                return (v1 + v2);
            case "-":
                return (v1 - v2);
            case "/":
                return (v1 / v2);
            case "*":
                return (v1 * v2);
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(basicMath("+", 14, 7));
        System.out.println(basicMath("-", 14, 7));
        System.out.println(basicMath("/", 14, 7));
        System.out.println(basicMath("*", 14, 7));
    }
}
