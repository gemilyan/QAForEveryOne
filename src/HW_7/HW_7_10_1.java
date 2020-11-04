package HW_7;

public class HW_7_10_1 {

    public static int arrayPlusArray(int[] arr1, int[] arr2) {
        int sum = 0;

        for (int i = 0; i < arr1.length; i++){
            sum += arr1[i];
        }

        for (int i = 0; i < arr2.length; i++){
            sum += arr2[i];
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(arrayPlusArray(new int[]{1,2,3,5,6,7}, new int[]{8,9,10,17}));
    }

}
