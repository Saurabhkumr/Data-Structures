public class rotation {
    public static void main(String[] args) {

        int arr[] = { 7,8,9,1,2,3,4,5 };
        System.out.println(Index_0f_num(arr, 4));
      
        
    }

    static int Index_0f_num(int arr[] , int target ){
        int start = 0;
        int end = arr.length-1;
        
        while(start <= end){

            int mid = start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }

            if(arr[mid] >= arr[start]){
                if(arr[mid]>=target && target>=arr[start]){
                    end=mid-1;
                }
                else
                start=mid+1;
            }
            else{
                if(arr[mid]<=target && target<=arr[end]){
                    start=mid+1;
                 }
                 else
                 end=mid-1;
            }
        }
        return -1;

    }
}
