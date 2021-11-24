/*
Row Sum
Problem Description

You are given a 2D integer matrix A, return a 1D integer vector containing row-wise sums of original matrix.



Problem Constraints
1 <= A.size() <= 10^3

1 <= A[i].size() <= 10^3

1 <= A[i][j] <= 10^3



Input Format
First argument is a vector of vector of integers.(2D matrix).



Output Format
Return a vector conatining row-wise sums of original matrix.



Example Input
Input 1:

[1,2,3,4]
[5,6,7,8]
[9,2,3,4]


Example Output
Output 1:

{10,26,18}


Example Explanation
Explanation 1

Row 1 = 1+2+3+4 = 10
Row 2 = 5+6+7+8 = 26
Row 3 = 9+2+3+4 = 18
*/
package Arrays;

class RowSum {
    public static int[] solve(int[][] A) {
        int rows = A.length;
        int cols = A[0].length;

        int[] result = new int[rows];

        for (int i = 0; i < rows; i++) {
            result[i] = 0;

            for (int j = 0; j < cols; j++) {
                result[i] += A[i][j];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] input = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 2, 3, 4 }, };

        int[] result = solve(input);

        for (int i : result) {
            System.out.println(i);
        }
    }
}