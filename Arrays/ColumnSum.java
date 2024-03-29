/*
Column Sum
Problem Description

You are given a 2D integer matrix A, return a 1D integer vector containing column-wise sums of original matrix.



Problem Constraints
1 <= A.size() <= 10^3

1 <= A[i].size() <= 10^3

1 <= A[i][j] <= 10^3



Input Format
First argument is a vector of vector of integers.(2D matrix).



Output Format
Return a vector conatining column-wise sums of original matrix.



Example Input
Input 1:

[1,2,3,4]
[5,6,7,8]
[9,2,3,4]


Example Output
Output 1:

{15,10,13,16}


Example Explanation
Explanation 1

Column 1 = 1+5+9 = 15
Column 2 = 2+6+2 = 10
Column 3 = 3+7+3 = 13
Column 4 = 4+8+4 = 16
*/
package Arrays;

class ColumnSum {
    public static int[] solve(int[][] A) {

        int M = A.length;
        int N = A[0].length;

        int[] result = new int[N];

        for (int i = 0; i < N; i++) {

            int sum = 0;

            for (int j = 0; j < M; j++) {
                sum = sum + A[j][i];
            }

            result[i] = sum;

        }

        return result;

    }

    public static void main(String[] args) {

        int[][] input = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 2, 3, 4 } };

        int[] output = solve(input);

        for (int num : output) {
            System.out.println(num);
        }

    }

}
