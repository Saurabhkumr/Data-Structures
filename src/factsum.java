public class factsum {
    public static void main(String[] args) {
        System.out.println(sumoffactorial(435));
        
    }

    static int factorial(int n){
        if(n==1){
            return 1;
        }
        return n*factorial(n-1);

    }

    static int sumoffactorial(int n){
        int sum=0;
        while(n>0){
            int a = n%10;
            n=n/10;
            sum+=factorial(a);
        }
        return sum;
    }
}
