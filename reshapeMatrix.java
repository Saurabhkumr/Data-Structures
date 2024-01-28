public class reshapeMatrix {
    public static void main(String[] args) {
        int[][] mat = {{1,2},{4,5}};
        int[][] ans = matrixReshape(mat, 1, 4);
        for(int i = 0 ; i<1 ;i++){
            for(int j=0 ; j<4 ;j++){
                System.out.println(ans[i][j]);
            }
        }


    }

    static int[][] matrixReshape(int[][] mat, int r, int c) {
        int[][] ans = new int[r][c];
        int l = 0;
        int k = 0;
        if ((mat.length * mat[0].length) == r * c) {
            return mat;
        }

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                ans[i][j] = mat[l][k];
                k++;
                if (k == mat[0].length) {
                    l++;
                    k = 0;
                }

            }

        }
        return ans;

    }

}
