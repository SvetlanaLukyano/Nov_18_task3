import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
// ARRAYS. TASK 2. Array from -70 to + 50,  MIN - MAX

        Random random = new Random();
        int[] arr = new int[30];

        for (int i = 0; i < 30; i++) {
            arr[i] = random.nextInt(-70, 50);
        }
        System.out.println(Arrays.toString(arr));

        int min = -70;
        int max = 50;

        for (int i = 0; i < 30; i++) {
            if (arr[i] > min) {
                max = arr[i];
                min = arr[i];
            }
        }

        System.out.println("MAX ");
        System.out.println(max);

        for (int i = 0; i < 30; i++) {
            if (arr[i] < max) {
                min = arr[i];
                max = arr[i];
            }
        }
        System.out.println("MIN ");
        System.out.println(min);
    }

}