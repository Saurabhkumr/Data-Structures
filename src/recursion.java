import java.lang.Math;
import java.util.ArrayList;

public class recursion {
    public static void main(String[] args) {
        // System.out.println(fac(5));ṇ
        // System.out.println(sumofdigits(1342));
        // System.out.println(reverse(445321));
        // System.out.println(zeros(12030))
        // System.out.println(steps(41));
        int[] arr ={1,2,3,4,9,4,7};
        // System.out.println(sorted(arr, 0));
        // System.out.println(search(arr, 9, 0));
        // System.out.println(searchindex(arr, 6, 0));
        // System.out.println(findAll(arr , 4, 0, new ArrayList<>()));
        System.out.println(findAll2(arr, 4, 0));

    }

    // static int fac(int n) {
    // if (n == 1) {
    // return 1;
    // }
    // return n * fac(n - 1);
    // }

    // static int sumofdigits(int n){
    // if(n==0){
    // return 0;
    // }
    // return sumofdigits(n/10)+(n%10);
    // }

    // reverse a number

    // static int reverse(int n){
    // int digi = (int)(Math.log10(n)) +1;
    // return helper(n,digi);
    // }
    // static int helper(int n , int N){
    // if(n%10==n){
    // return n;
    // }
    // int rem = n%10;
    // return rem * (int)Math.pow(10,N-1) + helper(n/10,N-1);

    // }

    // count number of zeros

    // static int zeros(int n) {
    //     int c = 0;
    //     return helper(n, c);

    // }

    // static int helper(int n, int c) {
    //     if (n == 0) {
    //         return c;
    //     }
    //     if (n % 10 == 0) {
    //         return helper(n / 10, c + 1);
    //     }
    //     return helper(n / 10, c);

    // }


    // count steps to reduce any number to 0

    // static int steps(int n){
    //     int s=0;
    //     return helper(n , s);
    // }
   
    // static int helper(int n , int s){ 
    //    if(n==0){
    //     return s;
    //    }

    //     if(n%2==0){
    //         return helper(n/2, s+1);
    //     }
    //     else
    //     return helper(n-1, s+1);
    // }


    // chech whether array is sorted or not

    // static boolean sorted(int[] arr , int index){
    //     if(index==arr.length-1){
    //         return true;
    //     }

    //     return (arr[index]<arr[index+1]) && sorted(arr , index+1);
    // }



    // search of element in a array 


    // static boolean search(int[] arr , int target , int index){
    //     if(index==arr.length){
    //         return false;
    //     }

    //     return arr[index]==target || search(arr, target, index+1);

    //     }


    // search index of target element

    // static int searchindex(int[] arr , int target , int index){

    //     if(index==arr.length){
    //         return -1;
    //     }
    //     else if (arr[index]==target){
    //         return index;
    //     }
    //     else
    //     return searchindex(arr, target, index+1);

    // }


    // static ArrayList<Integer> findAll(int[] arr , int target , int index , ArrayList<Integer> list){

    //     if(index==arr.length){
    //         return list;
    //     }
    //     if(arr[index]==target){
    //         list.add(index);
    //     }

    //    return findAll(arr, target, index+1 , list);


    // }


    static ArrayList<Integer> findAll2(int[] arr , int target , int index){

        ArrayList<Integer> list = new ArrayList<>();

        if(index==arr.length){
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }

         ArrayList<Integer> ans = findAll2(arr, target, index+1);

         list.addAll(ans);

         return list;


    }

   
}

