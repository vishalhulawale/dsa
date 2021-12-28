package Arrays.Matrix;

public class SquareSpiralMatrix {
    public static int[] solve(int[][] A) {
        int n = A.length;

        int[] result = new int[n * n];
        int cnt = 0;

        int i = 0, j = 0;

        while (n > 1) {
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

            n -= 2;
            i++;
            j++;
        }

        if (n == 1)
            result[cnt] = A[i][j];

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
