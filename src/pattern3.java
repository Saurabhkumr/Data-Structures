public class pattern3 {
    
    public static void main(String[] args) {
        // for(int i =1 ; i<10 ; i++){

        //     int col = i>5? 10-i : i ;

        //     for(int j =1; j<col;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j = 0 ; j <= 5-col ;j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        // int n = 3;
        // for(int i = 0 ; i <= 2*n ; i++){
        //     for(int j = 0 ;j <= 2*n;j++){

        //         int top = i;
        //         int buttom = 2*n-i;
        //         int left = j;
        //         int right = 2*n-j;

        //         int max = 4-Math.min(Math.min(top, left), Math.min(buttom, right));
        //         System.out.print(max +" ");

        //     }
        //     System.out.println();
        // }


         int n = 3;
        for(int i = 1 ; i <= 2*n+1 ; i++){
            for(int j = 1 ;j <= 2*n+1;j++){

                int top = i-1;
                int buttom = 2*n+1-i;
                int left = j-1;
                int right = 2*n+1-j;

                int max = 4-Math.min(Math.min(top, left), Math.min(buttom, right));
                System.out.print(max +" ");

            }
            System.out.println();
        }
    }
}
