public class arm {
    public static void main(String[] args) {
        
        int num = 1;
        System.out.println(ArmstrongNum(num));
               
    }
    static boolean ArmstrongNum(int n){
        int digit=(int)Math.floor(Math.log10(n)+1);
        int sum = 0;
        int original = n;
        while(n>0){
            int rem = n%10;
            sum+=Math.pow(rem, digit);
            n=n/10;
        }
        return original==sum;

    }

}
