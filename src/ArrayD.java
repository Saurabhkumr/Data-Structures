import java.util.Scanner;

public class ArrayD {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int row = sc.nextInt();
        // int col = sc.nextInt();
        int[][] arr = {
            {1,2,3,4},
            {1,2},
            {1,3,4,5,6,7,8}
        };
        // for(int i = 0 ; i<row;i++){
        //     for(int j = 0 ; j<col ; j++){
        //         arr[i][j]=sc.nextInt();

        //     }
           
        // }
        for(int i = 0 ; i<arr.length;i++){
            for(int j = 0 ; j<arr[i].length; j++){
                System.out.print(arr[i][j]);

            }
            System.out.println();
        }

    }
}
