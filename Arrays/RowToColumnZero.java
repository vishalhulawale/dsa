/*
package Arrays;

public Row to Column Zero
Problem Description

You are given a 2D integer matrix A, make all the elements in a row or column zero if the A[i][j] = 0. Specifically, make entire ith row and jth column zero.



Problem Constraints
1 <= A.size() <= 10^3

1 <= A[i].size() <= 10^3

0 <= A[i][j] <= 10^3



Input Format
First argument is a vector of vector of integers.(2D matrix).



Output Format
Return a vector of vector after doing required operations.



Example Input
Input 1:

[1,2,3,4]
[5,6,7,0]
[9,2,0,4]


Example Output
Output 1:

[1,2,0,0]
[0,0,0,0]
[0,0,0,0]


Example Explanation
Explanation 1:

A[2][4] = A[3][3] = 0, so make 2nd row, 3rd row, 3rd column and 4th column zero.
*/

package Arrays;

class RowToColumnZero {

    private static int[][] solve(int[][] A) {
        int n = A.length;
        int m = A[0].length;

        boolean updateFirstRow = false;
        boolean updateFirstCol = false;

        // Replace 0's by -1's so that information will not be lost while
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++) {

                if (i == 0 && A[i][j] == 0)
                    updateFirstRow = true;

                if (j == 0 && A[i][j] == 0)
                    updateFirstCol = true;

                if (A[i][j] == 0)
                    A[i][0] = A[0][j] = -1;

            }

        // Update where (row|col) != 0
        for (int i = 1; i < n; i++)
            for (int j = 1; j < m; j++)
                if (A[0][j] == -1 || A[i][0] == -1)
                    A[i][j] = 0;

        // Update 0th row
        for (int i = 0; i < m; i++)
            if (A[0][i] == -1 || updateFirstRow)
                A[0][i] = 0;

        // Update 0th col
        for (int i = 0; i < n; i++)
            if (A[i][0] == -1 || updateFirstCol)
                A[i][0] = 0;

        return A;
    }

    private static void print(int[][] A) {
        for (int[] row : A) {
            for (int num : row) {
                System.out.print(num + "\t");
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        int[][] A = {
                { 97, 18, 55, 1, 50, 17, 16, 0, 22, 14 },
                { 58, 14, 75, 54, 11, 23, 54, 95, 33, 23 },
                { 73, 11, 2, 80, 6, 43, 67, 82, 73, 4 },
                { 61, 22, 23, 68, 23, 73, 85, 91, 25, 7 },
                { 6, 83, 22, 81, 89, 85, 56, 43, 32, 89 },
                { 0, 6, 1, 69, 86, 7, 64, 5, 90, 37 },
                { 10, 3, 11, 33, 71, 86, 6, 56, 78, 31 },
                { 16, 36, 66, 90, 17, 55, 27, 26, 99, 59 },
                { 67, 18, 65, 68, 87, 3, 28, 52, 9, 70 },
                { 41, 19, 73, 5, 52, 96, 91, 10, 52, 21 }
        };

        System.out.println("\nBefore:\n");

        print(A);

        solve(A);

        System.out.println("\nAfter:\n");

        print(A);

    }

}
