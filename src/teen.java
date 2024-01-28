public class teen {
    public static void main(String[] args) {
        // System.out.println(loneTeen(23 ,14));
        loneTeen(10, 19);
        
    }
    static void loneTeen(int a , int b){
        boolean result = (a>=13 && a<=19 && b>=13 && b<=19)? false : (a>=13 && a<=19 || b>=13 && b<=19) ;
        System.out.println(result);

        
        // if(a>=13 && a<=19 && b>=13 && b<=19){
        //     return false;
        // }
        // else if(a>=13 && a<=19 || b>=13 && b<=19){
        //     return true;
        // }
        // else 
        // return false;


        

    }
}
