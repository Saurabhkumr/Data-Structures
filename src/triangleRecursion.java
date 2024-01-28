public class triangleRecursion {

    public static void main(String[] args) {
        func(4, 0);
        
    }

    public static void func(int r , int c){
        if(r==0){
            return;
        }
        if(r>c){
            System.out.print("*");
            func(r, c+1);
        }
        else{
            System.out.println();
            func(r-1, 0);
            
        }
        
    }
    
}
