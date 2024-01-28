import java.util.Arrays;

public class BSinSortedMatrix {
    public static void main(String[] args) {
        int[][] arr = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };

        System.out.println(Arrays.toString(Search(arr, 12)));

    }

    static int[] BinarySearch(int[][] arr, int row, int cStart, int cEnd, int target) {
        while (cStart <= cEnd) {
            int mid = cStart + (cEnd - cStart)/2;
            if (arr[row][mid] == target) {
                return new int[] { row, mid };
            }
            if (arr[row][mid] < target) {
                cStart = mid + 1;
            } else
                cEnd = mid - 1;
        }
        return new int[] { -1, -1 };
    }

    static int[] Search(int[][] arr , int target){
        int row = arr.length;
        int col = arr[0].length;
        if(row==1){
            return BinarySearch(arr,1,0,col-1,target);

        }
        int rStart=0;
        int rEnd = row-1;
        int colmid = col/2;

        while(rStart < (rEnd-1)){
            int rowmid = rStart + (rEnd-rStart)/2;
            if(arr[rowmid][colmid]==target){
                return new int[]{rowmid,colmid};
            }
            if(arr[rowmid][colmid]>target){
                rEnd=rowmid;
            }
            else 
            rStart = rowmid;

        }


        if(arr[rStart][colmid]==target){
            return new int[]{rStart,colmid};
        }
        if(arr[rStart+1][colmid]==target){
            return new int[]{rStart+1,colmid};
        }

        if(arr[rStart][colmid-1]>=target){
            return BinarySearch(arr , rStart ,  0 , colmid-1 , target );
        }
        if(arr[rStart][colmid]<=target && arr[rStart][col-1]>=target ){
            return BinarySearch(arr , rStart ,  colmid+1 , col-1 , target );
        }
        if(arr[rStart+1][colmid-1]<=target){
            return BinarySearch(arr , rStart+1 ,  colmid , col-1 , target );
        }
        else{
            return BinarySearch(arr , rStart+1 ,  0 , colmid-1 , target );
        }
        
    }
}
