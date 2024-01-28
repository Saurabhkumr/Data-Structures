import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class que_missing {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        List<Integer> ans = findDisappearedNumbers(arr);
        System.out.println(ans);

        
    }

    public static List<Integer> findDisappearedNumbers(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int j = arr[i]-1;
            if (i != j) {
             swap(arr, i, j);
            } else
                i++;
 }

        List<Integer> ans = new ArrayList<>();
      for(int index =0; index<arr.length ; index++){
         if(arr[index]!=index+1)
         ans.add(index+1);
      }
    
      return ans;


    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }  
    
}
