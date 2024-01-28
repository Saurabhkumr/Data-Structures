import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch
{
    public static void main(String[] args) {
        // String name = "Saurabh";
        // char target = 'a';
        // System.out.println("index : "+Charsearch(name, target));
        // System.out.println(Arrays.toString(name.toCharArray()));
        // int[] arr = {3,2,4,1,12,11};
        // int tar = 78;
        // System.out.println(ArraySearch(arr, tar));
        Scanner sc = new Scanner(System.in);
        System.out.println("size : ");
        int size = sc.nextInt();
        System.out.println("enter array : ");
        int[] arr = new int[size];
        for(int i = 0 ; i<size ; i++){
             arr[i]=sc.nextInt();
            
        }
        for(int i = 0 ; i<size ; i++){
             System.out.println(arr[i]);
            
        }
        System.out.println("enter he number to search : ");
        int num = sc. nextInt();
        boolean found = false;
        int count = 0;
       for(int i = 0 ; i< size;i++){
            if(arr[i]==num){
               found = true;
               count = i;
               break;
            }
        }
        if(found==true){
            System.out.println("present at : "+count);
        }

        else
        {
            System.out.println("not found!");
        }
        

    }
    
    // public static boolean Charsearch(String name , char target){
    //     for(int i = 0 ; i<name.length();i++){
    //        if(name.charAt(i)==target){
    //             return true;
    //         }
    //     }
    //     return false;

    // }
    // public static int ArraySearch(int[] arr , int tar){
    //     for(int i = 0 ; i<arr.length;i++){
    //         if(arr[i]==tar){
    //             return i;
    //         }
    //     }
    //     return -1;
    // }
    


}