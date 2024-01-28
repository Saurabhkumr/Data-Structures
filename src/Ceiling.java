public class Ceiling {
    public static void main(String[] args) {
        
        int arr[] = {2,5,9,11,14,17,20,24,26,32,40,44};
        int target = 41;
        System.out.println(ceilingSearch(arr, target));
    }
    static int ceilingSearch(int[] arr , int target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if (target>arr[mid]){
                start=mid+1;

            }
            else
            end=mid-1;
        }
        return arr[start];
    }
}
