/*
Rotate Matrix


Problem Description
You are given a n x n 2D matrix A representing an image.
Rotate the image by 90 degrees (clockwise).
You need to do this in place.
Note: If you end up using an additional array, you will only receive partial score.


Problem Constraints
1 <= n <= 1000


Input Format
First argument is a 2D matrix A of integers


Output Format
Return the 2D rotated matrix.


Example Input
Input 1:
 [
    [1, 2],
    [3, 4]
 ]

 Input 2:
 [
    [1]
 ]


Example Output
Output 1:
 [
    [3, 1],
    [4, 2]
 ]

Output 2:
 [
    [1]
 ]


Example Explanation
Explanation 1:
After rotating the matrix by 90 degree:
 1 goes to 2, 2 goes to 4
 4 goes to 3, 3 goes to 1

Explanation 2:
2D array remains the same as there is only element.
*/

package Arrays;

class RotateMatrix {

    private static void transpose(int[][] A) {
        for (int i = 0; i < A.length; i++) {

            for (int j = 0; j <= i; j++) {
                int temp = A[i][j];
                A[i][j] = A[j][i];
                A[j][i] = temp;
            }

        }
    }

    private static int[][] solve(int[][] A) {
        int N = A.length;

        transpose(A);

        for (int i = 0; i < N; i++) {

            for (int j = 0; j < (N / 2); j++) {

                int temp = A[i][j];
                A[i][j] = A[i][N - j - 1];
                A[i][N - j - 1] = temp;

            }
        }

        return A;
    }

    public static void main(String[] args) {

        int[][] A = {
                { 1, 2 },
                { 3, 4 }
        };

        int[][] B = solve(A);

        for (int[] arr : B) {
            for (int num : arr) {
                System.out.print(num + " ");
            }

            System.out.print("\n");
        }

    }

}