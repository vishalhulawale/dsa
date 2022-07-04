package Arrays;

public class SquareMatrixBoundary {

    public static int[] solve(int[][] A) {
        int n = A.length;

        int[] result = new int[(n - 1) * 4];

        int i = 0, j = 0;
        int cnt = 0;

        // 0th row
        for (int k = 1; k <= n - 1; k++) {
            result[cnt] = A[i][j];
            j++;
            cnt++;
        }

        // last column
        for (int k = 1; k <= n - 1; k++) {
            result[cnt] = A[i][j];
            i++;
            cnt++;
        }

        // last row
        for (int k = 1; k <= n - 1; k++) {
            result[cnt] = A[i][j];
            j--;
            cnt++;
        }

        // first row
        for (int k = 1; k <= n - 1; k++) {
            result[cnt] = A[i][j];
            i--;
            cnt++;
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] A = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        int[] res = solve(A);

        for (int i : res) {
            System.out.println(i);
        }
    }

}
