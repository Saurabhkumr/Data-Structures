import java.util.Scanner;

public class array {
    public static void main(String args[]) {

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter size of array : ");
        // int size = sc.nextInt();
        // int number[] = new int[size];
        // System.out.println("enter the number");
        // for (int i = 0 ; i < number.length ; i++) {
        // number[i] = sc.nextInt();
        // }

        // boolean isAccending=true;

        // for(int i = 0 ; i<number.length-1 ;i++){
        // if(number[i]>number[i+1]){
        // isAccending=false;
        // }
        // }

        // if(isAccending){
        // System.out.println("yes it is in accending order.");
        // }
        // else{
        // System.out.println("No it is not in accending order.");
        // }

        // int max=Integer.MIN_VALUE;
        // int min=Integer.MAX_VALUE;

        // for(int i =0 ; i< number.length;i++ ){
        // if(number[i]<min){
        // min=number[i];
        // }
        // if(number[i]>max){
        // max=number[i];
        // }
        // }
        // System.out.println("max : "+max);
        // System.out.println("min : "+min);

        // for(int i = 0; i<size ;i++){
        // System.out.println(number[i]);
        // }
        // System.out.println("number to find : ");
        // int x = sc.nextInt();

        // for (int i = 0; i < size; i++) {
        // if (number[i] == x) {
        // System.out.println("index " + i);
        // }
        // }

        // 2D Arrays

        System.out.println("enter the row and column : ");
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int column = sc.nextInt();

        int[][] matrix = new int[row][column];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix[i][j] = sc.nextInt();
            }

            System.out.println();

        }

        // for (int i = 0; i < row; i++) {
        //     if (i % 2 == 0) {
        //         for (int j = 0; j < column; j++) {
        //             System.out.print(matrix[i][j] + " ");
        //         }
        //     } else {
        //         for (int j = column - 1; j >= 0; j--) {
        //             System.out.print(matrix[i][j] + " ");
        //         }

        //     }
        //     System.out.println();

        // }

        // for (int i = 0; i < row; i++) {
        // for (int j = 0; j < column; j++) {
        // System.out.print(matrix[i][j] + " ");
        // }
        // System.out.println();

        // }

        // System.out.println("number to find ");
        // int x = sc.nextInt();

        // for(int i = 0 ; i<row ; i++){
        // for(int j = 0 ; j<column ; j++){
        // if(matrix[i][j]==x){
        // System.out.println("position : "+i+ " "+j);
        // }

        // }
        // }

        // Transpose

        for(int j = 0 ;j < column ; j++){
            for(int i = 0 ; i<row;i++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }



    }
}
