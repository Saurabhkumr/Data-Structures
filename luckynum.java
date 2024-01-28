import java.util.*;

public class luckynum {
    public static void main(String[] args) {
        int matrix[][] = {{3,7,8},{9,11,13},{15,16,17}};
        System.out.println(luckyNumbers(matrix));

    }

    static List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> ans = new ArrayList<Integer>();
        int pos = 0;
        for (int i = 0; i < matrix.length; i++) {
            int max = 0;
            int min = Integer.MAX_VALUE;

            for (int j = 0; j < matrix[i].length; j++) {
               

                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                    pos = j;
                }

            }

            for (int c = 0; c < matrix.length; c++) {

                if (matrix[c][pos] > max) {
                    max = matrix[c][pos];
                }
            }
            System.out.println(max);
            System.out.println(min);

            if (min == max) {
                ans.add(max);

            }

        }
        return ans;

    }

}
