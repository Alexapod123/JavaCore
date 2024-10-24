/*
Написать метод, возвращающий количество чётных элементов массива.
countEvens([2, 1, 2, 3, 4]) → 3 countEvens([2, 2, 0]) → 3 countEvens([1, 3, 5]) → 0
 */

package dz_2;

import java.util.Arrays;
import java.util.Random;

public class Task_1 {
    public static void main(String[] args) {
        int length = 10;
        int[] array = new int [length];
        generateArray(array);
        System.out.println(Arrays.toString(array));
        System.out.println(countEvens(array));
    }

    public static void generateArray(int[] arr){
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100);
        }
    }
    public static int countEvens(int[] arr){
        int count =0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2==0){
                count++;
            }
        }
        return count;
    }
}
