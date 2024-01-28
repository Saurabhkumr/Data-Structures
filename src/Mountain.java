public class Mountain {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6,7,9,6,5,4,3,1};
        System.out.println(MaxNum(arr));
        
    }

  static int MaxNum(int[] arr )
  {
    int start=0;
    int end = arr.length-1;
    int ans = -1;
    while(start<end){
        int mid = start+(end-start)/2;
        if(arr[mid]>arr[mid+1]){
            end=mid;
        }
        else if(arr[mid]<arr[mid+1]){
            start=mid+1;
        }  
    }
    ans = end;
return arr[ans];
  }
}
