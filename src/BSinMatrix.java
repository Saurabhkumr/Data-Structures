import java.util.Arrays;

public class BSinMatrix {
    public static void main(String[] args) {
        int[][] arr= {
            {10,20,30,40},
            {15,25,35,45},
            {28,29,37,49},
            {33,34,38,55}
        };
        int target = 55;
        System.out.println(Arrays.toString(tgSearch(arr, target)));
        
    }

    static int[] tgSearch(int[][] arr , int target){
        int r = 0 ;
         int c = arr.length-1;
         while(r < arr.length && c>=0){
            if(arr[r][c]==target){
                return new int[]{r,c};
            }
            if(arr[r][c]<target)
            {
                r++;

            }
            else
            c--;
         }
         return new int[]{-1,-1};
    }
}
