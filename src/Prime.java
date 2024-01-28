import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        System.out.println("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isPrime(n));
    }
    public static boolean isPrime(int n)
    {
        if(n<=1){
        return false;
        }
     
        for(int a = 2 ; a*a<=n;a++){
            if(n%a==0){
                return true;
            }
        }
        return false;

        

        
    }
}
