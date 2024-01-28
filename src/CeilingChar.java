public class CeilingChar {
    public static void main(String[] args) {
        char arr[] = {'a','c','d','f'};
        char target='c';
        System.out.println(ceilingSearch(arr, target));
        
    }
    static char ceilingSearch(char[] arr , char target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
         if (target>arr[mid]){
                start=mid+1;

            }
            else
            end=mid-1;
        }
        return arr[start%arr.length];
    }
}
