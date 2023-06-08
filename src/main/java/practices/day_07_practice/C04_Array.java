package practices.day_07_practice;

import java.util.Arrays;

public class C04_Array {
    public static void main(String[] args) {

        // Array içerisindeki elementlerin işaretlerini(+-) değiştiren bir kod yazınız.
        // input : 1,2,-3,4,-5,-6
        // output :-1,-2,3,-4,5,6
        int[] arr = {1, 2, -3, 4, -5, -6};
        int[] newArr = new int[arr.length];

        int i = 0;
        for (int each : arr) {
            newArr[i++] = -each;
        }

        System.out.println(Arrays.toString(newArr)); // [-1, -2, 3, -4, 5, 6]

    }
}
