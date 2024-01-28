import java.util.Arrays;
import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        int[] arr = { 12, 12, 234, 123421 };

        System.out.println(digit(arr));
    }

    static int digit(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (isEven(num)) {
                count++;

            }
        }
        return count;
    }

    static boolean isEven(int num) {
        int count = 0;

        while (num != 0) {

            num /= 10;

            count++;
        }
        return (count % 2 == 0);

    }
}
