/*Given 3 int values, a b c, return their sum. However, if one of the values is the same as another of the values, it does not count towards the s */


public class sum {
    public static void main(String[] args) {
        System.out.println(lonesum(3, 2, 2));
        
    }
    static int lonesum(int a , int b, int c){
        return(a==b&&b==c)?0:(a==b)?c:(a==c)?b:(b==c)?a:a+b+c;


    }
}
