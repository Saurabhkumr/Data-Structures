import java.util.Arrays;

public class MaxMinRecursion {
    public static void main(String[] args) {
        int[] arr = {230,11,41,2,-12,0,-53,90,20};
        int n = arr.length-1;
        System.out.println(min(arr, n));
        System.out.println(max(arr, n));
        
    }

    static int min(int[] arr , int n)
    {
        if(n==1){
            return arr[0];
        }
        return Math.min(arr[n], min(arr,n-1));
    }

     static int max(int[] arr , int n)
    {
        if(n==1){
            return arr[0];
        }
        return Math.max(arr[n], max(arr,n-1));
    }

}
