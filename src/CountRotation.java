public class CountRotation {
    public static void main(String[] args) {
        int[]  arr = {7,1,2,3,4,5,6};
        System.out.println(Rotation(arr));
        
    }

    static int Rotation(int[] arr){
        int pivot =MaxNum(arr);
        return pivot+1 ;
    }

    static int MaxNum(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid<end && arr[mid] > arr[mid + 1]) {
                return mid;
            } 
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            if(arr[mid]<=arr[start]){
                end = mid-1;
            }
            else{
                start=mid+1;
            }
        }

        return -1;
    }

   
}
