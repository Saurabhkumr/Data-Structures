import java.util.Arrays;

public class cyclicsort {
    public static void main(String[] args) {

        int[] arr = { 5 ,4, 2, 3, 1 };
        Cycle(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void Cycle(int[] arr) {
        // for(int i = 0 ; i < arr.length ; i++){
        // while(i!=arr[i]-1){
        // int j = arr[i]-1;
        // swap(arr, i , j);

        // }
        // }

        int i = 0;
        while (i < arr.length) {
            int j = arr[i] - 1;

            if (i != j) {

                swap(arr, i, j);
            } else
                i++;

        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
