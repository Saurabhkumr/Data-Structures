import java.util.Arrays;
import java.util.Scanner;

public class Maximum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Size of array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {

            arr[i]=sc.nextInt();
        }
        System.out.println("array is "+Arrays.toString(arr));
        System.out.println(Max(arr, size));
    }
    static int Max(int[] arr,int size){
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i<size; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}
