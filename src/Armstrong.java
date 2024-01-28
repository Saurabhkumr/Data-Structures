import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        // System.out.println("Enter : ");
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // System.out.println(isArmstrong(n));
        // sc.close();
        int n =100;

        while (n < 10000) {
           if(isArmstrong(n)){
            System.out.print(n+" ");
           }
           n++;
        
        }

    }

    public static boolean isArmstrong(int n) {
        int sum = 0;
        int original =n;
        while (n > 0) {
            int rem = n % 10;
            sum = sum + rem * rem * rem;

            n = n / 10;
        }
        return sum==original;
    }

}
