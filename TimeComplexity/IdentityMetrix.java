/*
Is It Identity Matrix?
Problem Description

You are given a N X N square integer matrix A. You have to tell whether A is an identity matrix or not.

Identity matrix is a special square matrix whose main diagonal elements are equal to 1 and all other elements are 0.



Problem Constraints
2 <= N <= 103

A[i][j] equals 0 or 1.



Input Format
First and only argument is an integer matrix A.



Output Format
Return 1 if A is an identity matrix, else return 0.



Example Input
Input 1:

 [[1, 0]
  [0, 1]]
Input 2:

 [[0, 0, 1]
  [0, 1, 0]
  [1, 0, 0]]


Example Output
Output 1:

 1 
Output 2:

 0 


Example Explanation
Explanation 1:

 All the main diagonal elements in A are 1, all other elements are 0.
 So, A is an identity matrix.
Explanation 2:

 All the main diagonal elements in A are not 1, also all other elements are not equal to 0.
 So, A is not an identity matrix.
*/
package TimeComplexity;

class IdentityMetrix {

    public static int solve(final int[][] A) {

        int rows = A.length;

        int result = 1;

        for (int i = 0; i < rows; i++) {

            if (A[i][i] != 1) {
                result = 0;
                break;
            }

        }

        return result;

    }

    public static void main(String[] args) {

        int[][] arr = new int[2][2];
        arr[0][0] = 1;
        arr[0][1] = 0;
        arr[1][0] = 0;
        arr[1][1] = 1;

        int result = solve(arr);

        System.out.println(result);

    }

}
