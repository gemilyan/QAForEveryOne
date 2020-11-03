package HW_7;

public class HW_7_07 {

    /* Write a function feast that takes the animal's name and dish
     as arguments and returns true or false to indicate whether the
     beast is allowed to bring the dish to the feast. */

    public static boolean feast(String beast, String dish) {

              return (beast.charAt(0) == dish.charAt(0))
                      && (beast.charAt(beast.length()-1) == dish.charAt(dish.length()-1));
    }

    public static void main(String[] args) {

        System.out.println(feast("great blue heron", "garlic naan"));
        System.out.println(feast("brown bear", "bear claw"));

    }

}
