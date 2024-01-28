import java.util.*;

public class sum4 {
  
public static void main(String args[]){

int[] nums = {1,0,-1,0,-2,2};
System.out.println(fourSum(nums , 0));

    
}

   static public Set<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        Set<List<Integer>> mylist = new HashSet<>();
        int sum = 0;
        for(int i = 0 ; i<nums.length -3; i++){
    

            for(int j =i+1 ; j<nums.length-2;j++){
              
            int left = j+1;
            int right = nums.length-1;

            while(left<right){
                sum = nums[i]+nums[j]+nums[left]+nums[right];

                if(sum==target){
                mylist.add(Arrays.asList(nums[i] , nums[j] , nums[left] , nums[right]));
                left++;
                right--;

                }
                if(sum>target){
                    right--;
                }
                else
                left++;
            }
            }
        }
        System.out.println(mylist);
        return  mylist;

    }
    
}
