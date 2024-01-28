public class MaximunWealth {
    public static void main(String[] args) {
        int[][] arr = { { 100 , 2, 3 }, { 30, 12, 5 }, { 2, 6, 4 } };
        System.out.println(compare(arr));

    }

    static int compare(int[][] arr) {
        int ans = Integer.MIN_VALUE;
        
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
             if(sum>ans)
            ans=sum;
           }

        return ans;

    }
}
