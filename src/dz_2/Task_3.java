/*
Написать функцию, возвращающую истину, если в переданном массиве
есть два соседних элемента, с нулевым значением.
 */

package dz_2;

import java.util.Arrays;

public class Task_3 {
    public static void main(String[] args) {
        int[] array = {10, 15, 0, 0, 16, 11, 15, 0};
        System.out.println("Array = " + Arrays.toString(array));
        System.out.println(checkZero(array));

    }

    public static boolean checkZero(int[] arr) {
        boolean flag = false;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == 0 && arr[i + 1] == 0) {
                flag = true;
                break;
            }
        }
        return flag;
    }
}
