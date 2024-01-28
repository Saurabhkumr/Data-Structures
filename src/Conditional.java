import java.util.*;

public class Conditional {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int a = sc.nextInt();
        switch (a) {
            case 1:
                System.out.println("hello");
                break;
            case 2:
                System.out.println("Namaste");
                break;
            case 3: 
                System.out.println("Bonjour");
                break;

            default:
                System.out.println("Invalid");
                break;
        }

        sc.close();

    }
}
