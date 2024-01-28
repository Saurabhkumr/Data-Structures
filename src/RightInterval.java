import java.util.Arrays;

public class RightInterval {
    public static void main(String[] args) {
        int[][] arr={
            {3,4},{2,3},{1,2}
        };
        int count=-1;
         for(int i = 0 ; i< arr.length-1;i++){
           for(int j =0 ; j< arr[i].length-1;j++){
               if(arr[i][j+1] <= arr[i+1][j]){
                count++;
               }
           }
        }
        System.out.println(count);
    }

    // static int[] Search(int[][] arr){
       
    // }
}
