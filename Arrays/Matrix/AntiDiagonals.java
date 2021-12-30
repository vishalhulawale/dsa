/*
Anti Diagonals
Problem Description

Give a N * N square matrix A, return an array of its anti-diagonals. Look at the example for more details.


Problem Constraints
1<= N <= 1000
1<= A[i][j] <= 1e9


Input Format
First argument is an integer N, denoting the size of square 2D matrix.
Second argument is a 2D array A of size N * N.


Output Format
Return a 2D integer array of size (2 * N-1) * N, representing the anti-diagonals of input array A.
The vacant spaces in the grid should be assigned to 0.


Example Input
Input 1:
3
1 2 3
4 5 6
7 8 9
Input 2:

1 2
3 4


Example Output
Output 1:
1 0 0
2 4 0
3 5 7
6 8 0
9 0 0
Output 2:

1 0
2 3
4 0


Example Explanation
For input 1:
The first anti diagonal of the matrix is [1 ], the rest spaces should be filled with 0 making the row as [1, 0, 0].
The second anti diagonal of the matrix is [2, 4 ], the rest spaces should be filled with 0 making the row as [2, 4, 0].
The third anti diagonal of the matrix is [3, 5, 7 ], the rest spaces should be filled with 0 making the row as [3, 5, 7].
The fourth anti diagonal of the matrix is [6, 8 ], the rest spaces should be filled with 0 making the row as [6, 8, 0].
The fifth anti diagonal of the matrix is [9 ], the rest spaces should be filled with 0 making the row as [9, 0, 0].
For input 2:

The first anti diagonal of the matrix is [1 ], the rest spaces should be filled with 0 making the row as [1, 0, 0].
The second anti diagonal of the matrix is [2, 4 ], the rest spaces should be filled with 0 making the row as [2, 4, 0].
The third anti diagonal of the matrix is [3, 0, 0 ], the rest spaces should be filled with 0 making the row as [3, 0, 0].
*/

package Arrays.Matrix;

public class AntiDiagonals {

    public static int[][] solve(int[][] A) {
        int n = A.length, m = A[0].length;
        int[][] res = new int[n + m - 1][m];

        // Variable to keep track of result row
        int resRow = 0;

        // Diagonals starting from 0th row
        for (int k = 0; k < m; k++) {
            int i = 0, j = k, resCol = 0;

            while (i < n && j >= 0) {
                res[resRow][resCol] = A[i][j];
                i++;
                j--;
                resCol++;
            }
            resRow++;
        }

        // Diagonals starting from 0th row
        for (int k = 1; k < n; k++) {
            int i = k, j = m - 1, resCol = 0;

            while (i < n && j >= 0) {
                res[resRow][resCol] = A[i][j];
                i++;
                j--;
                resCol++;
            }

            resRow++;
        }

        return res;
    }

    public static void main(String[] args) {

        int[][] A = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        int[][] res = solve(A);

        for (int[] row : res) {
            for (int num : row)
                System.out.print(num + "\t");

            System.out.print("\n");
        }
    }

}
