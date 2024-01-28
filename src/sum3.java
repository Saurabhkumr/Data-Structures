import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class sum3 {
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        System.out.println(Sumthree(nums));

    }
  static ArrayList<List<Integer>> Sumthree(int[] nums){
    Arrays.sort(nums);

    ArrayList<List<Integer>> ans = new ArrayList<>();
    for(int i = 0 ; i<nums.length ; i++){
        if(i>0 && nums[i]==nums[i-1])
        continue;
        
        int left = i+1;
        int right = nums.length-1;

        while(left<right){
            int sum = nums[i]+nums[left]+nums[right];

            if(sum==0){
                ans.add(Arrays.asList(nums[i],nums[left],nums[right]));
                left++;
                right--;
            }
            if(sum>0){
                right--;
            }
            if(sum<0){
                left++;
            }
        }
    }
    return ans;

  }

}

// 3sum closest :

// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.HashSet;
// import java.util.List;
// import java.util.Set;

// public class sum3 {
//     public static void main(String[] args) {
//         int[] nums = { 4,0,5,-5,3,3,0,-4,-5 };
//         System.out.println(Sumthree_closest(nums, -2));

//     }

//     static int Sumthree_closest(int[] nums, int target) {
//         Arrays.sort(nums);
//         int mindiff = Integer.MAX_VALUE;
//         int ans = 0;
//         for (int i = 0; i < nums.length ; i++) {

//             int left = i + 1;
//             int right = nums.length - 1;

//             while (left < right) {
//                 int sum = nums[i] + nums[left] + nums[right];

//                 if (Math.abs(target - sum) < mindiff) {
//                     ans = sum;
//                     mindiff = Math.abs(target - sum);

//                 }
//                 if (sum==target) {
//                     return target;
//                 }

//                 else if (sum>target)
//                     right--;

//                 else
//                     left++;

//             }
//         }
//         return ans;

//     }

// }
