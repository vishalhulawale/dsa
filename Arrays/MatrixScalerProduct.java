/*
Matrix Scaler Product
Problem Description

You are given a matrix A and and an integer B, you have to perform scalar multiplication of matrix A with an integer B.



Problem Constraints
1 <= A.size() <= 1000

1 <= A[i].size() <= 1000

1 <= A[i][j] <= 1000

1 <= B <= 1000



Input Format
First argument is vecotor of vector of integers A representing matrix.

Second argument is an integer B.



Output Format
You have to return a vector of vector of integers after doing required operations.



Example Input
Input 1:

A = [[1, 2, 3],[4, 5, 6],[7, 8, 9]]
B = 2 


Example Output
Output 1:

[[2, 4, 6], [8, 10, 12], [14, 16, 18]]


Example Explanation
Explanation 1:

==> ( [[1, 2, 3],[4, 5, 6],[7, 8, 9]] ) * 2
==> [[2*1, 2*2, 2*3],[2*4, 2*5, 2*6],[2*7, 2*8, 2*9]]
==> [[2, 4, 6], [8, 10, 12], [14, 16, 18]]
*/
package Arrays;

class MatrixScalerProduct {

    public static int[][] solve(int[][] A, int B) {
        for (int i = 0; i < A.length; i++) {

            for (int j = 0; j < A[i].length; j++) {
                A[i][j] *= B;
            }

        }

        return A;
    }

    public static void main(String[] args) {

        int[][] input = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        int[][] res = solve(input, 2);

        for (int[] is : res) {
            for (int i : is) {
                System.out.print(i + " ");
            }
            System.out.print("\n");
        }

    }

}