import java.util.Scanner;

public class doubt{

    public static void main (String args[]){

        Scanner sc = new Scanner (System.in);

        System.out.println(" 1 -> LUCAS SERIES ");
        System.out.println(" 2 -> TRAINGLE PATTERN");
        System.out.println(" 3 -> LOWER TO UPPER CASE");

        System.out.print("cout enter choice = ");


        int ch= sc.nextInt();


        switch(ch) {


        case 1:

        System.out.print(" LUCAS SEQUENCE CODE ");
        

        System.out.print("enter the range   = ");
        int n= sc.nextInt();

        int a=1;
        int b=4;
        int c;
if (n==1){
            System.out.println( a);
        }

        else if (n==2){
            System.out.println( a);
            System.out.println( b);
        }

        else if (n<=0){
            System.out.println(" chutiya hai kya lawde ");
            
        }

        else {

           System.out.println( a);
           System.out.println( b);


        for(int i =1 ; i<=n-2; i++){

            c=a+b+i;

            System.out.println(c);

            a=b;
            b=c;
        }

    }

    break;

        case 2 : 
                System.out.println("TRIANGLE PATTERN");
                
                System.out.println("enter number of rows");
                int r = sc.nextInt() ;
    
    
                for (int i =1 ; i<= r ; i++){
    
                    for (int j =1; j<=r-i; j++){
                        System.out.print(" ");
                    }
    
                    for (int j =i ; j>=1; j--){
    
                        System.out.print(j);
    
                    }
                        System.out.println();
    
                }
    
                break; 
    
    
    
        case 3:
         System.out.println(" LOWER CASE TO UPPER CASE ");
        System.out.print(" ENTER THE SENTENCE = ");
        String str = sc.nextLine();

        String result = "";

        for (int i =0; i<str.length(); i++){

            char count = str.charAt(i);


            if ( count>='a' && count<='z'){

                count = (char)(count-32);
            }

            result += count;
        }

        System.out.println(result);
        break;

        default:
        System.out.println("wrong input");
    }
}
}

    
    



