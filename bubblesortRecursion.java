import java.util.Arrays;

public class bubblesortRecursion {
    
    public static void main(String[] args) {
        int[] arr = {8,9,-9,0,7,6,5,2,4,3,1,6};
        // func(arr,0,arr.length-1);
        selection(arr,0,arr.length-1,0);
        System.out.println(Arrays.toString(arr));
        
    }

    public static void func(int[] arr , int i,int j){
       if(j==0){
        return ;
       }
       if(i<j){
        if(arr[i]>arr[i+1]){
            int temp = arr[i];
             arr[i]=arr[i+1];
             arr[i+1]=temp;
            }
            func(arr, i+1, j);
        }
        else{
            func(arr,0,j-1);
            
          }
    
    }

    static void selection(int[] arr , int s , int e , int max){
        if(e==0){
            return;
        }

        if(s<=e){
            if(arr[s]>arr[max]){
                selection(arr, s+1, e, s);
            }
            else
            selection(arr, s+1, e, max);
        }
        else{
            int temp = arr[max];
            arr[max]=arr[e];
            arr[e]=temp;
            selection(arr, 0, e-1, 0);
        }
    }

}   
