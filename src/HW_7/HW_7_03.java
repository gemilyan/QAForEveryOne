package HW_7;

public class HW_7_03 {

    /* Remove the spaces from the string, then return the resultant string. */

    static String noSpace(final String x) {
        return x.replaceAll("\\s+", "");
    }

    public static void main(String[] args) {
        System.out.println(noSpace("Statue of    limitation"));
    }
}
