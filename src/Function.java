import java.net.Socket;
import java.util.Scanner;

public class Function {

    // public static int calculateMultiple(int a , int b){
    // int mul = a*b;
    // return mul;

    // public static void printFactorial(int num){
    // if(num<0){
    // System.out.println("Invalid number ");
    // return;
    // }
    // int factorial = 1;
    // for(int i = num ; i>=1 ;i--){
    // factorial=factorial*i;

    // }
    // System.out.println(factorial);
    // return;

    // }

    // public static void main(String args[]) {
    // Scanner sc = new Scanner(System.in);
    // System.out.println("Enter a number : ");
    // int num = sc.nextInt();
    // printFactorial(num);
    // sc.close();

    // }

    // Exercise :

    // 1.Enter 3 numbers from the user & make a function to print their average.

    // public static int printAverage(int a , int b, int c){
    // int avg = (a+b+c)/3;
    // return avg;

    // }
    // public static void main(String args[]){
    // System.out.println("Enter three number : ");
    // Scanner sc = new Scanner(System.in);
    // int a=sc.nextInt();
    // int b=sc.nextInt();
    // int c=sc.nextInt();

    // System.out.println("Average : "+printAverage(a, b, c) );

    // }

    // 2.Write a function to print the sum of all odd numbers from 1 to n.

    // public static int printOddSum(int n){
    // int sum=0;
    // for(int i = 1 ; i <=n ; i=i+2){
    // sum=sum+i;

    // }
    // return sum;
    // }

    // public static void main(String args[]){
    // System.out.println("Enter number : ");
    // Scanner sc = new Scanner(System.in);
    // int n = sc.nextInt();
    // System.out.println("Sum of odd number : "+printOddSum(n));

    // }

    // 3.Write a function which takes in 2 numbers and returns the greater of those
    // two.

    // public static void printGreater(int a, int b) {
    //     if (a > b) {
    //         System.out.println("first number is grrater " + a);
    //         return;
    //     } else if (a < b) {
    //         System.out.println("second number is greater " + b);
    //         return;

    //     } else {
    //         System.out.println("equal");
    //         return;
    //     }
    // }

    // public static void main(String args[]) {
    //     System.out.println("Enter  first number : ");
    //     Scanner sc = new Scanner(System.in);
    //     int a = sc.nextInt();
    //     System.out.println("Enter second number : ");
    //     int b = sc.nextInt();
    //     printGreater(a, b);

    // }

    // 4.Write a program to enter the numbers till the user wants and at the end 
    // it should display the count of positive, negative and zeros entered.

    // public static void main(String args[]){
    //     int positive=0;
    //     int negative=0;
    //     int zero=0;
    //     System.out.println("press 1 to continue and 0 to exit :");
    //     Scanner sc=new Scanner(System.in);
    //     int i = sc.nextInt();
    //     while(i==1){
    //         System.out.println("Enter the number : ");
    //         int num=sc.nextInt();
    //         if(num>0)
    //             positive++;
    //         else if(num<0)
    //         negative++;
    //         else
    //         zero++;

    //         System.out.println("press 1 to continue and 0 to exit :");
    //         i=sc.nextInt();
    //     }
    //      System.out.println("positive number : "+positive);
    //      System.out.println("negative number : "+negative);
    //      System.out.println("zeros : "+zero );

    //     }


    // 5.Two numbers are entered by the user, x and n.
    //  Write a function to find the value of one number raised to the power of another i.e. x^n.

    // public static int printPower(int x , int n){
    //     int result=1;
    //     for(int i = 1 ; i<=n;i++){
    //         result = result*x;
            
    //     }
      
    //     return result;
    // }
    // public static void main(String args[]){
    //     System.out.println("Enter number : ");
    //     Scanner sc = new Scanner(System.in);
    //     int x = sc.nextInt();
    //     System.out.println("power : ");
    //     int n = sc.nextInt();
    //     System.out.println("result : "+printPower(x, n));

    // }


    // 6. Write a function that calculates the Greatest Common Divisor of 2 numbers

    // public static void main(String args[]){
    //     Scanner sc = new Scanner(System.in);
    //     int n1 = sc.nextInt();
    //     int n2 = sc.nextInt();

    //     int i = n1%n2;
    //     while(i!=0){
    //         n1=n2;
    //         n2=i;
    //         i=n1%n2;
    //     }
    //     System.out.println(n2);
 
    
    // }   
 


    //  7. Febonacci Series

    // public static void main(String args[]){

    // int n1=0;
    // int n2=1;
    // int n3;
    // System.out.println(n1);
    // System.out.println(n2);
    //     for(int a = 2; a<6;a++ ){
    //         n3=n1+n2;
    //         System.out.println(n3);
    //         n1=n2;
    //         n2=n3;
    
    //     }
    // }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         String name = sc.nextLine();
         greet(name);
}
    public static void greet(String name){
        System.out.println("Hello "+name);

    }
}




