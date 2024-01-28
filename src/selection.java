import java.util.Arrays;

public class selection {
    public static void main(String[] args) {

        int[] arr= {4,5,1,2,3,6,8};
        Selection_Sort(arr);
        System.out.println(Arrays.toString(arr));
        
    }

    static void Selection_Sort(int[] arr){
        for(int i =0 ; i<arr.length ; i++){

        int end = arr.length-i-1;
        int max = maxNum(arr , 0 , end );
        Swap(arr, max , end);
        }

        

    }

    static int maxNum(int[] arr , int start , int end){
        int max = start;
        for(int i = start ; i <= end ; i++){
            if(arr[i]>arr[max]){
                max=i;
                
            }
        }
        return max;
        

    }

    static void Swap(int[] arr , int first , int second){
        int temp = arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
