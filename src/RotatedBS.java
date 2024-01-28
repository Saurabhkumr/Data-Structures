public class RotatedBS {
    public static void main(String[] args) {
        int[]  arr = {4,5,6,7,0,1,2,3};
        int target=2;
        System.out.println(SearchInRBS(arr, target));

    }

    static int SearchInRBS(int[] arr, int target) {
        int pivot = MaxNum(arr);
        int end = arr.length - 1;
        if (arr[pivot] == target) {
            return pivot;
        }
        if (target >= arr[0]) {
            return binarySearch(arr, target, 0, pivot-1);

        } else
            return binarySearch(arr, target, pivot + 1, end);
    }

    static int MaxNum(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
           if(mid < end && arr[mid]>arr[mid+1]){
               return mid;
           }
           if(mid > start && arr[mid]<arr[mid-1]){
               return mid-1;
           }
           if(arr[mid] >= arr[start]){
               start = mid+1;
           }
           else{
               end =mid-1;
           }

        }

        return start;
    }

    static int binarySearch(int[] arr, int target, int start, int end) {

        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (isAsc) {

                if (target < arr[mid] ) {
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
