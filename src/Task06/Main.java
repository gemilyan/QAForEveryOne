package Task06;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("Practice:");

        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] b = {11, 12, 13, 14, 15, 16, 17};

        int[] result = new int[a.length + b.length];

        System.out.println(Arrays.toString(result));
        for (int i = 0; i < result.length; i++) {
            if (i < a.length) {
                result[i] = a[i];
            } else {
                result[i] = b[i - a.length];
            }
        }
        System.out.println(Arrays.toString(result));



        /*Задача №1

        Дан массив:
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        необходимо вывести сумму всех значений массива.*/

        System.out.println("\nЗадача №1");

        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int sum = 0;
        for (int i=0; i<array.length; i++){
            sum += array[i];
        }

        System.out.println("The sum of " + Arrays.toString(array) + " is " + sum);


        /*Задача №2

        Дан массив:
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        необходимо вывести максимальное значение массива.*/

        System.out.println("\nЗадача №2");

        int[] array1 = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int max = 0;
        for (int i=0; i<array1.length; i++){
            if (max < array1[i]){
                max = array1[i];
            }
        }

        System.out.println("The max number of " + Arrays.toString(array1) + " is " + max);


        /*Задача №3

        Дан массив:
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        необходимо вывести минимальное значение массива. */

        System.out.println("\nЗадача №3");

        int[] array2 = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int min = array2[0];
        for (int i=0; i<array2.length; i++){
            if (min > array2[i]){
                min = array2[i];
            }
        }

        System.out.println("The min number of " + Arrays.toString(array2) + " is " + min);

        /*Задача №4

        Дан массив:
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        необходимо вывести среднее арифметическое всех значений массива.*/

        System.out.println("\nЗадача №4");
        int[] array3 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int sum3 = 0;
        for (int i=0; i<array3.length; i++){
            sum3 += array3[i];
        }

        System.out.println("The average of " + Arrays.toString(array3) + " is " + sum3/array3.length);


        /*Задача №5

        Дан массив:
        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        необходимо вывести сумму элементов массива.*/

        System.out.println("\nЗадача №5");
        int[][] array4 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        int sum2 = 0;
        for (int i = 0; i < array4.length; i++){
            for (int j = 0; j < array4[i].length; j++){
                sum2 += array4[i][j];
            }
        }
        System.out.println("The sum of array is " + sum2);

        /*Задача №6

        Дан массив:
        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        необходимо вывести максимальное значение массива.*/

        System.out.println("\nЗадача №6");
        int[][] array5 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        int max5 = 0;
        for (int i=0; i<array5.length; i++) {
            for (int j = 0; j < array5[i].length; j++) {
                if (max5 < array5[i][j]) {
                    max5 = array5[i][j];
                }
            }
        }
            System.out.println("The max number of array is " + max5);

        /*Задача №7

        Дан массив:
        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        необходимо вывести количество элементов в массиве.*/

        System.out.println("\nЗадача №7");
        int[][] array6 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        int count = 0;
        for (int i=0; i<array6.length; i++) {
            for (int j = 0; j < array6[i].length; j++) {
                count ++;
            }

        }

        System.out.println("The count of array elements is " + count);

        /*Экстра задача

        Дан массив:
        String[][] array = {{“Привет”, “всем”, “кто”},{“изучает”, “язык”,
        “программирования”},{“java”}};
        необходимо подсчитать количество строк в массиве, которые не содержат буквы “е”.*/

        System.out.println("\nЭкстра задача");
        String[][] array7 = {{"Привет", "всем", "кто"},{"изучает", "язык", "программирования"},{"java"}};
        int count1 = 0;
        for (int i=0; i<array7.length; i++) {
            for (int j = 0; j < array7[i].length; j++) {
                if (!array7[i][j].contains("е")){
                    count1 ++;
                }
            }
        }
        System.out.println("Количество слов в массиве, которые не содержат буквы “е”: " + count1);

    }
}