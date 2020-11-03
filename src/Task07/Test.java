package Task07;

import java.util.Arrays;

public class Test {

    public static void print(String name, int age){
        System.out.println(name);
        System.out.println(age);
    }

    public static String getConcat(String str1, String str2, String str3){
        String str = str1 + str2 + str3;
        return str;
    }

    /* Given a set of numbers, return the additive inverse of each.
    Each positive becomes negatives, and the negatives become positives. */

    public static int[] invert(int[] array){
        int[] result = new int [array.length];
        for (int i=0; i< array.length; i++){
            result[i] = -array[i];
        }
        return result;
    }

    /* Create a function which answers the question "Are you playing banjo?".
    If your name starts with the letter "R" or lower case "r", you are playing banjo! */

    public static String areYouPlayingBanjo(String name) {
        if(Character.toLowerCase(name.charAt(0)) == 'r') {
            return name + " plays banjo";
        }else {
            return name + " does not play banjo";
        }
    }

    /* Clock shows 'h' hours, 'm' minutes and 's' seconds after midnight.
    Your task is to make 'Past' function which returns time converted to milliseconds. */

    public static int past(int h, int m, int s){
        return 1000*(h*3600 + m*60 +s);
    }

    /* Write a function named setAlarm which receives two parameters.
     The first parameter, employed, is true whenever you are employed
     and the second parameter, vacation is true whenever you are on vacation.
     The function should return true if you are employed and not on vacation
     (because these are the circumstances under which you need to set an alarm).
     It should return false otherwise. */

    public static boolean setAlarm(boolean employed, boolean vacation) {
        return employed && !vacation;
    }

    /* Wolves have been reintroduced to Great Britain.
     You are a sheep farmer, and are now plagued by wolves
     which pretend to be sheep. Fortunately, you are good at spotting them.
     Warn the sheep in front of the wolf that it is about to be eaten.
     Remember that you are standing at the front of the queue which is at the end of the array.
     If the wolf is the closest animal to you, return "Pls go away and stop eating my sheep".
     Otherwise, return "Oi! Sheep number N! You are about to be eaten by a wolf!"
     where N is the sheep's position in the queue.
     Note: there will always be exactly one wolf in the array.*/

    public static String warnTheSheep(String[] array) {

        for (int i = 0; i < array.length; i++) {
            if (array[i].equalsIgnoreCase("wolf")) {
                if (i == array.length - 1) {
                    return "Pls go away and stop eating my sheep";
                } else {
                    return "Oi! Sheep number " + (array.length - 1 - i) + "! You are about to be eaten by a wolf!";
                }
            }
        }
        return "";
    }


    public static void main(String[] args) {
        String name1 = "Vahe";
        String name2 = "The Great";
        print(name1, 33);
        print(name2, 45);

        String text = getConcat(name1, " + ", name2);
        System.out.println(text);

        int [] arr = new int []{1,2,3,4,5};
        int [] result = invert(arr);
        String strResult = Arrays.toString(result);
        System.out.println(strResult);

        System.out.println(areYouPlayingBanjo("Martin"));
        System.out.println(areYouPlayingBanjo("Rikke"));

        System.out.println(past(0,1,1));

        System.out.println(setAlarm(true, true));
        System.out.println(setAlarm(false, true));
        System.out.println(setAlarm(false, false));
        System.out.println(setAlarm(true, false));

        // 2,5,6,1, Pls go away and stop eating my sheep
        System.out.println(warnTheSheep(new String[]{"sheep", "sheep", "sheep", "sheep", "sheep", "wolf", "sheep", "sheep"}));
        System.out.println(warnTheSheep(new String[]{"sheep", "wolf", "sheep", "sheep", "sheep", "sheep", "sheep"}));
        System.out.println(warnTheSheep(new String[]{"wolf", "sheep", "sheep", "sheep", "sheep", "sheep", "sheep"}));
        System.out.println(warnTheSheep(new String[]{"sheep", "wolf", "sheep"}));
        System.out.println(warnTheSheep(new String[]{"sheep", "sheep", "wolf"}));
    }
}
