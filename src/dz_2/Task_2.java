/*
Написать функцию, возвращающую разницу между самым большим
и самым маленьким элементами переданного не пустого массива.
 */

package dz_2;

import java.util.Arrays;
import java.util.Random;

public class Task_2 {
    public static void main(String[] args) {
        int length = 10;
        int[] array = new int [length];
        generateArray(array);
        System.out.println(Arrays.toString(array));
        int raz = raznostMinMax(array);
        System.out.println("Разность максимального и минимального элемента массива равна " + raz);
    }
    public static void generateArray(int[] arr){
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100);
        }
    }
    public static int raznostMinMax(int[] arr){
        Arrays.sort(arr);
        return arr[arr.length-1] - arr[0];
    }
}
