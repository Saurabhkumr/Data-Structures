import java.util.Scanner;

public class Occurrence {

    public static void main(String[] args) {

        System.out.print("Enter total no. of values : ");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter the numbers:");
        int num[] = new int[n];
        int count = 0;

        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }
        System.out.println("Enter the number to check the occurence : ");
        int x = sc.nextInt();

        for (int i = 0; i < n; i++) {
            if (x == num[i]) {
                count++;
            }

        }
        System.out.println("occured : " + count);
    }
}