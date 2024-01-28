import java.util.Arrays;
class solution2 {


    public static void main(String[] args) {
        int[] nums1={1,3};
        int[] nums2={2,4};
        
        // System.out.println(findMedianSortedArrays(nums1,nums2));
        findMedianSortedArrays(nums1, nums2);
    }
    public static void findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len = nums1.length + nums2.length;

        int[] merge= new int[len];
        for(int i = 0 ; i<nums1.length ; i++){
            merge[i]=nums1[i];

        }
        for(int i = 0 ;  i<nums2.length; i++){
            merge[nums1.length+i]=nums2[i];
        }
        Arrays.sort(merge);
        double ans = (float)(merge[(len/2)-1]+merge[len/2])/2;
        if(len%2==0){
            System.out.println(ans);

        }
        else
        System.out.println(merge[len/2]);
}}