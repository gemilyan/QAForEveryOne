package Task04;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /* Задача №1

        Необходимо вывести числа от 0 до 15. */

        System.out.println("Task 1");

        for (int i = 0; i <= 15; i++) {
            System.out.print(i + " ");
        }


        /* Задача №2

        Необходимо вывести все положительные степени числа 5,
         которые меньше 10000 (результат возведения в степень меньше 10000). */

        System.out.println("\nTask 2");

        for (int j = 5; j < 10000; j = j * 5) {
            System.out.print(j + " ");
        }


        /* Задача №3

        Необходимо вывести все числа кратные 4 между числами 40 и 60 включительно.
        Реализовать 2 варианта:
        использовать конструкцию if для определения кратности (цикл с шагом 1, i = i + 1);
        без использования конструкции if (шаг цикла на ваше усмотрение).*/

        System.out.println("\nTask 3 take 1");

        for (int a = 40; a <= 60; a++) {
            if (a % 4 == 0) {
                System.out.print(a + " ");
            }
        }


        System.out.println("\nTask 3 take 2");

        for (int b = 40; b <= 60; b = b + 4) {
            System.out.print(b + " ");
        }

        /*Task 1*
        Find if the number is 2 digits 3 digits or 4 digits and
        check the result for the next condition use if and else:
        Its a two digit number
        Its a tree digit number
        Its a four digit number
        Its a five digit number
        The number is not between 1 & 99999*/

        System.out.println("\nTask 1*");

        int a = 12345;
        int num = a;
        int count = 0;

        for(; num != 0; num/=10, ++count) {
        }

        System.out.println("The number of digits is " + count);

        if (count == 2){
            System.out.println(a + " is a two digit number");
        }else if (count == 3) {
            System.out.println(a + " is a three digit number");
        }else if (count == 4) {
            System.out.println(a + " is a four digit number");
        }else if (count == 5) {
            System.out.println(a + " is a five digit number");
        }else {
            System.out.println("The number " + a + " is not between 1 & 99999");
        }

       /* Task 2*
        Write a program to find if the use largest Number
        of three number print out System.out.println("Largest number is "+largestNumber);
        Must be used if then an else if find lastly else*/

        System.out.println("\nTask 2*");

        int x = 100;
        int y = 200;
        int z = 300;

        if( x >= y && x >= z) {
            System.out.println("The largest number is " + x);
        }else if (y >= x && y >= z) {
            System.out.println("The largest number is " + y);
        }else{
            System.out.println("The largest number is " + z);
    }


        /*Task 3*
        Create a program print only even numbers from 1 to 20 must be used while loops*/

        System.out.println("\nTask 3*");

        int c = 1;
        while (c <= 10) {
            System.out.print(c * 2 + " ");
            c++;
        }

        /*Task 4*
        Create a program for print numbers from 10 to 1*/

        System.out.println("\nTask 4*");

        for (int k = 10; k > 0; k--){
            System.out.print(k + " ");
        }

        /*Task 5*
        Create a program to find a solution, initially find a solution on paper.
            a=100; x=12; d=12; c=122;
                zz1 = a == d;
                zz2 = x == d;
                zz3 = c >= a;
                zz4 = x >= d;
                zz5 = (d == c) || (x == d);
                zz6 = (c > x) && (d >= x);
                zz7 = (a > x) || (a > c);
                zz8 = (a == c) && (d == c);
                zz9 = (c == c) && (a >= a);
                zz10 = (c > c) || (a <= a);
                zz11 = (x > a) && (c == d);
                zz12 = (c > a) && (x > d);  */

        System.out.println("\nTask 5*");

        int a1 = 100, x1 = 12, d1 = 12, c1 = 122;
        boolean zz1, zz2, zz3, zz4, zz5, zz6, zz7, zz8, zz9, zz10, zz11, zz12;

        zz1 = a1 == d1;
        System.out.println("zz1 = a1 == d1 is " + zz1);

        zz2 = x1 == d1;
        System.out.println("zz2 = x1 == d1 is " + zz2);

        zz3 = c1 >= a1;
        System.out.println("zz3 = c1 >= a1 is " + zz3);

        zz4 = x1 >= d1;
        System.out.println("zz4 = x1 >= d1 is " + zz4);

        zz5 = (d1 == c1) || (x1 == d1);
        System.out.println("zz5 = (d1 == c1) || (x1 == d1) is " + zz5);

        zz6 = (c1 > x1) && (d1 >= x1);
        System.out.println("zz6 = (c1 > x1) && (d1 >= x1) is " + zz6);

        zz7 = (a1 > x1) || (a1 > c1);
        System.out.println("zz7 = (a1 > x1) || (a1 > c1) is " + zz7);

        zz8 = (a1 == c1) && (d1 == c1);
        System.out.println("zz8 = (a1 == c1) && (d1 == c1) is " + zz8);

        zz9 = (c1 == c1) && (a1 >= a1);
        System.out.println("zz9 = (c1 == c1) && (a1 >= a1) is " + zz9);

        zz10 = (c1 > c1) || (a1 <= a1);
        System.out.println("zz10 = (c1 > c1) || (a1 <= a1) is " + zz10);

        zz11 = (x1 > a1) && (c1 == d1);
        System.out.println("zz11 = (x1 > a1) && (c1 == d1) is " + zz11);

        zz12 = (c1 > a1) && (x1 > d1);
        System.out.println("zz12 = (c1 > a1) && (x1 > d1) is " + zz12);

        }

}




