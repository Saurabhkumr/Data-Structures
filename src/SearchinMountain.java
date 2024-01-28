public class SearchinMountain {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6,7,9,6,5,4,3,1};
        int target = 6;
        System.out.println(Searchtarget(arr, target));

    }

    static int Searchtarget(int[] arr, int target){
        int max = MaxNum(arr);
        int firsttry=binarySearch(arr, target, 0, max);
        if(firsttry!=0){
            return firsttry;
        }
        else
        return binarySearch(arr, target, max+1, arr.length-1);
         
    }

    static int MaxNum(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
    
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            }
        }
        
        return start;
    }

    static int binarySearch(int[] arr, int target,int start , int end) {
     
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (isAsc) {

                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }

            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }

            }
        }
        return -1;

    }
}
