public class Pattern {
    public static void main(String args[]) {
        int n = 4;
        // int m = 5;

        // 1 pattern :

        // for(int i =1;i<=n;i++){
        // for(int j =1;j<=m;j++){
        // System.out.print(" * ");
        // }
        // System.out.println();
        // }

        // 2 pattern

        // for (int i = 1; i <= n; i++) {

        // for (int j = 1; j <= m; j++) {
        // if (i == 1 || j == 1 || i == n || j == m) {
        // System.out.print(" * ");
        // }
        // else{
        // System.out.print(" ");
        // }
        // }

        // System.out.println();
        // }

        // 3 pattern

        // for(int i =1 ; i<=n ;i++){
        // for(int j =1;j<=i;j++){
        // System.out.print(" * ");
        // }
        // System.out.println();
        // }

        // 4 pattern

        // for (int i=4 ; i>=n ;i--){
        // for(int j=1;j<=i;j++){
        // System.out.print(" * ");
        // }
        // System.out.println();

        // }

        // 5 pattern

        // for(int i = 1 ; i<=n ;i++){
        // for(int j = 1 ; j<=n-i; j++){
        // System.out.print(" ");

        // }
        // for(int k = 1 ; k<=i;k++){
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // 6 pattern

        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(j);
        // }
        // System.out.println();

        // }

        // 7 pattern

        // for (int i = 5; i >=n ;i--) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(j);
        // }
        // System.out.println();
        // }

        // 8 pattern

        // int num = 1;
        // for (int i = 1; i <=n ;i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(num);
        // num++;
        // }
        // System.out.println();
        // }

        // 9 pattern

        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= i; j++) {
        // if ((i + j) % 2 == 0)
        // System.out.print("1");
        // else
        // System.out.print("0");
        // }
        // System.out.println();
        // }

        // Advanced pattern -1

        // solid butterfly

        // for(int i = 1 ; i<=n ; i++){
        // for(int j = 1 ; j<=i;j++){
        // System.out.print("*");
        // }
        // int space=2*(n-i);
        // for(int j = 1 ; j<=space; j++){
        // System.out.print(" ");
        // }
        // for(int j=1 ; j<=i;j++){
        // System.out.print("*");
        // }
        // System.out.println();
        // }
        // for(int i = 1 ; i<=n ; i++){
        // for(int j = n; j>=i;j--){
        // System.out.print("*");
        // }
        // int space=2*(i-1);
        // for(int j = 1 ; j<=space; j++){
        // System.out.print(" ");
        // }
        // for(int j=n ; j>=i;j--){
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // hollow butterfly

        for(int i = 1 ; i<=n ; i++){
        for(int j = 1 ; j<=i;j++){
        if(i==j || j==1)
        System.out.print("*");
        else
        System.out.print(" ");
        }
        int space=2*(n-i);
        for(int j = 1 ; j<=space; j++){
        System.out.print(" ");
        }
        for(int j=1 ; j<=i;j++){
        if(j==1||i==j)
        System.out.print("*");
        else
        System.out.print(" ");
        }
        System.out.println();
        }
        for(int i = 1 ; i<=n ; i++){
        for(int j = n; j>=i;j--){
        if(i==j||j==n)
        System.out.print("*");
        else
        System.out.print(" ");
        }
        int space=2*(i-1);
        for(int j = 1 ; j<=space; j++){
        System.out.print(" ");
        }
        for(int j=n ; j>=i;j--){
        if(i==j||j==n)
        System.out.print("*");
        else
        System.out.print(" ");
        }
        System.out.println();
        }

        // 2- pattern

        // solid pyramid

        // for(int i = 1; i<=n ;i++){
        // int space = (n-i);
        // for(int j=1;j<=space;j++){
        // System.out.print(" ");

        // }
        // for(int j = 1 ; j<=n ;j++){
        // System.out.print("*");
        // }
        // System.out.println();

        // }

        // hollow pyramid

        // for(int i = 1; i<=n ;i++){
        // int space = (n-i);
        // for(int j=1;j<=space;j++){
        // System.out.print(" ");

        // }
        // for(int j = 1 ; j<=n ;j++){
        // if(i==1||i==5||j==1||j==5)
        // System.out.print("*");
        // else
        // System.out.print(" ");
        // }
        // System.out.println();

        // }

        // 3 pattern

        // for (int i = 1; i <= n; i++) {
        // for (int j=1; j <= n-i; j++) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <= i; j++) {

        // System.out.print(i+" ");

        // }
        // System.out.println();
        // }

        // 4 pattern - parandrom pyramid

        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= n - i; j++) {
        //         System.out.print(" ");

        //     }
        //     for (int j = i; j >= 1; j--) {
        //         System.out.print(j);
        //     }
        //     for (int j = 2; j <= i; j++) {
        //         System.out.print(j);
        //     }
        //     System.out.println();

        // }


        // 5 patterm - diamond

// for(int i = 1 ; i<=n; i++){
//     for(int j =1;j<=n-i;j++){
//         System.out.print(" ");
//     }
//     for(int j = 1 ;j<=((2*i)-1);j++){
//         System.out.print("*");
//     }
//     System.out.println();

// }

// for(int i = n-1 ; i>=1; i--){
//     for(int j =1;j<=n-i;j++){
//         System.out.print(" ");
//     }
//     for(int j = 1 ;j<=((2*i)-1);j++){
//         System.out.print("*");
//     }
//     System.out.println();

// }


//  pattern : 55555
//            45555
//            34555
//            23455
//            12345

// for(int i = 1 ; i <=5; i++){
//     for(int j = 1 ; j <= 5 ; j++){

//         if(i<=j)
//         System.out.print(5);
//         else
//         System.out.print(5-i+j);
        
    
//     }
//     System.out.println();
   
// }




    } 

}