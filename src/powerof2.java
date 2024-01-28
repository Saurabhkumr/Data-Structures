public class powerof2 {
    public static void main(String[] args) {
        System.out.println(power(514));
        
    }
    static boolean power(int n){
       
        if(n==0)
        return false;
        if(n==1){
            return true;
        }
        if(n%2!=0){
            return false;
        }
        else
        return power(n/2);
    
    }
}
