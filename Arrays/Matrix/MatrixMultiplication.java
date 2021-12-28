/**
Matrix Multiplication
Problem Description

You are given two integer matrices A(having M X N size) and B(having N X P). You have to multiply matrix A with B and return the resultant matrix. (i.e. return the matrix AB).

image



Problem Constraints
1 <= M, N, P <= 100

-100 <= A[i][j], B[i][j] <= 100



Input Format
First argument is a 2D integer matrix A.

Second argument is a 2D integer matrix B.



Output Format
Return a 2D integer matrix denoting AB.



Example Input
Input 1:

 A = [[1, 2],            B = [[5, 6],
      [3, 4]]                 [7, 8]] 
Input 2:

 A = [[1, 1]]            B = [[2],
                              [3]] 


Example Output
Output 1:

 [[19, 22],
  [43, 50]]
Output 2:

 [[5]]


Example Explanation
Explanation 1:

 image
Explanation 2:

 [[1, 1]].[[2, 3]] = [[1 * 2 + 1 * 3]] = [[5]]
 */
package Arrays.Matrix;

public class MatrixMultiplication {
    public static int[][] solve(int[][] A, int[][] B) {
        int n = A[0].length;
        int m = B.length;

        int[][] result = new int[n][m];

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < m; j++) {

                int sum = 0;

                for (int k = 0; k < n; k++) {
                    sum += A[i][k] * B[k][j];
                }

                result[i][j] = sum;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        int[][] A = { { 1, 2 }, { 3, 4 } };
        int[][] B = { { 5, 6 }, { 7, 8 } };

        int[][] C = solve(A, B);

        for (int i = 0; i < C.length; i++) {

            for (int j = 0; j < C[i].length; j++) {
                System.out.print(C[i][j] + " ");
            }

            System.out.print("\n");
        }

    }
}
