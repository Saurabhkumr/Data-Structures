import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number : ");
        int num2 = sc.nextInt();
        System.out.println("Enter operation you want to prform : ");
        int op = sc.next().trim().charAt(0);
        int result;
        switch(op) {
            case '+':
            result = num1+num2;
            System.out.print("Result is : "+result);
                
                break;
            case '-':
            result=num1-num2;
            System.out.print("Result is : "+result);
            break;

            case '*':
            result=num1*num2;
            System.out.print("Result is : "+result);
            break;

            case '/':
            result=num1/num2;
            System.out.print("Result is : "+result);
            break;
        
            default:
            System.out.println("invalid operator!");
                break;
        }
       
        

    }
}
