package dz_5_itog;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) throws IOException {
        int[] array = new int[9];
        generateArray(array);
        System.out.println(Arrays.toString(array));
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("game.txt");
            for (int i = 0; i < 3; i++) {
                byte b = 0;
                for (int j = 0; j < 3; j++) {
                    b += (byte) (array[3 * i + j] << (j * 2));
                }
                fos.write(b);
            }
            System.out.println("Массив успешно записан в файл размером 3 байта!");
        } catch (IOException e) {
            e.printStackTrace();
        }
        fos.flush();
        fos.close();
    }
    public static void generateArray(int[] arr){
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(4);
        }
    }


}
