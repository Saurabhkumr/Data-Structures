import java.util.Scanner;

public class SearchD {   
public static void main(String[] args) {
    int[][] arr ={
        {1,2,3},
        {48,25,55},
        {100,12,75}
    };
    int max = Integer.MIN_VALUE;
    for(int i = 0 ; i<arr.length;i++){
        for(int j = 0 ;j<arr[i].length;j++){
            if(arr[i][j]>max){
                max=arr[i][j];
            }

        }
    }
    System.out.println(max);
}
}
