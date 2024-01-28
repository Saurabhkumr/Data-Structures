import java.util.Arrays;

public class Bubblesort {
    public static void main(String[] args) {

        int[] arr= {1,2,3,4,5,6,7};
        Sort(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void Sort(int[] arr) {
        for (int i = 0; i < arr.length ; i++) {
            boolean res=false;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    res= true;
                    
                }
            }
            if(!res){
                break;
            }
        }
    }
}
