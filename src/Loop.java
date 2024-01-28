import java.util.Scanner;

public class Loop {
    public static void main(String args[]){

        
        // for(int a=0;a<=10;a++){
        //     System.out.print(a+" ");

        // }

        // int a = 0;
        // while(a<11){
        //     System.out.println(a);
        //     a++;
        // }
        // int a =0;
        // do{
        //     System.out.println(a);
        //     a++;
        // }while(a<11);
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int a = sc.nextInt();
        // int sum=0;
        // for(int i=1;i<=a;i++){
        //     sum+=i;
        // }

        // System.out.println(sum);

        for(int i =1;i<=10;i++){
            System.out.println(a+" x "+i+" = "+a*i);
        }

        sc.close();
        
    }
}
