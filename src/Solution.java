class Solution {
    public static void main(String[] args) {
        int[]  arr = {1};
        int target=1;
        System.out.println(search(arr, target));

    }

    public static boolean search(int[] arr, int target){

        int pivot = MaxNum(arr);
        int end = arr.length - 1;
        if (arr[pivot] == target) {
            return true;
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


           if(arr[mid]== arr[start] && arr[mid]==arr[end]){
               if(arr[start]>arr[start+1]){
                   return start;
               }
               start++;

               if(arr[end]<arr[end-1]){
                   return end-1;
               }
               end--;

           }
           else if(arr[mid]>arr[start] || arr[start]==arr[mid] && arr[mid]>arr[end]){
               start = mid+1;
           }
       else {
               end =mid-1;
           }

        }

        return start;
    }

    static boolean binarySearch(int[] arr, int target, int start, int end) {

       

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return true;
            }
               if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }

    
        }
        return false;
        
    }
}