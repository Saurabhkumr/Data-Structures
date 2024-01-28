import java.util.Arrays;

public class StartEndPosition {
    public static void main(String[] args) {
        int arr[] ={5,7,7,7,7,8,8,9};
        int target = 7;
        int ans [] = position(arr, target);
        System.out.println(Arrays.toString(ans));
        
        
    }
    static int[] position(int[] arr , int target){
        int[] pos = {-1,-1};
        int start=Searchnum(arr, target, true);
        int end = Searchnum(arr, target, false);

        pos[0]=start;
        pos[1]=end; 

        return pos;
    }
    static int Searchnum(int[] arr,int target,boolean posibleAns){
        int ans=-1;
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;

            if(target>arr[mid]){
                start=mid+1;
            }
            else if(target<arr[mid]){
                end = mid-1;

            }
            else{
                ans=mid;

                if(posibleAns==true){
                    end=mid-1;
                }
                else{
                    start = mid+1;
                }

            }
            
        }
        return ans;
        
    }
}
