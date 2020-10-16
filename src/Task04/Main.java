package Task04;

public class Main {

    public static void main(String[] args) {
        /* Задача №1

        Необходимо вывести числа от 0 до 15. */

        System.out.println("Task 1");

        for (int i = 0; i <= 15; i++){
            System.out.print(i + " ");
        }


        /* Задача №2

        Необходимо вывести все положительные степени числа 5,
         которые меньше 10000 (результат возведения в степень меньше 10000). */

        System.out.println("\nTask 2");

        for (int y = 5; y < 10000; y = y * 5){
            System.out.print(y + " ");
        }


        /* Задача №3

        Необходимо вывести все числа кратные 4 между числами 40 и 60 включительно.
        Реализовать 2 варианта:
        использовать конструкцию if для определения кратности (цикл с шагом 1, i = i + 1);
        без использования конструкции if (шаг цикла на ваше усмотрение).*/

        System.out.println("\nTask 3 take 1");

        for (int a = 40; a<=60; a++){
            if (a%4==0) {
                System.out.print(a + " ");
            }
        }


        System.out.println("\nTask 3 take 2");

        for (int b=40; b<=60; b=b+4){
            System.out.print(b + " ");
        }



    }
}
