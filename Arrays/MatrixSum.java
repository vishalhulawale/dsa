/*
Add the matrices
Problem Description

You are given two matrices A & B of same size, you have to return another matrix which is the sum of A and B.



Problem Constraints
1 <= A.size(), B.size() <= 1000

1 <= A[i].size(), B[i].size() <= 1000

1 <= A[i][j], B[i][j] <= 1000



Input Format
First argument is vector of vector of integers representing matrix A.

Second argument is vector of vector of integers representing matrix B.



Output Format
You have to return a vector of vector of integers after doing required operations.



Example Input
Input 1:

A = [[1, 2, 3],[4, 5, 6],[7, 8, 9]]
B = [[9, 8, 7],[6, 5, 4],[3, 2, 1]]


Example Output
Output 1:

[[10, 10, 10], [10, 10, 10], [10, 10, 10]]


Example Explanation
Explanation 1:

A + B = [[1+9, 2+8, 3+7],[4+6, 5+5, 6+4],[7+3, 8+2, 9+1]] = [[10, 10, 10], [10, 10, 10], [10, 10, 10]].
*/
package Arrays;

class MatrixSum {

    public static int[][] solve(int[][] A, int[][] B) {
        int M = A.length;
        int N = A[0].length;

        int[][] result = new int[M][N];

        for (int i = 0; i < M; i++) {

            for (int j = 0; j < N; j++) {

                result[i][j] = A[i][j] + B[i][j];

            }

        }

        return result;
    }

    public static void print(int[][] A) {

        int M = A.length;

        for (int i = 0; i < M; i++) {

            int N = A[i].length;

            for (int j = 0; j < N; j++) {

                System.out.print(A[i][j] + " ");

            }

            System.out.print("\n");

        }

    }

    public static void main(String[] args) {

        int[][] input1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        int[][] input2 = { { 9, 8, 7 }, { 6, 5, 4 }, { 3, 2, 1 } };

        int[][] result = solve(input1, input2);

        print(result);
    }

}
