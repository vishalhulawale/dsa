/*
Search in a row wise and column wise sorted matrix
Problem Description

Given a matrix of integers A of size N x M and an integer B.
In the given matrix every row and column is sorted in increasing order. Find and return the position of B in the matrix in the given form:
If A[i][j] = B then return (i * 1009 + j)
If B is not present return -1.

Note 1: Rows are numbered from top to bottom and columns are numbered from left to right.
Note 2: If there are multiple B in A then return the smallest value of i*1009 +j such that A[i][j]=B.


Problem Constraints
1 <= N, M <= 1000
-100000 <= A[i] <= 100000
-100000 <= B <= 100000


Input Format
The first argument given is the integer matrix A.
The second argument given is the integer B.


Output Format
Return the position of B and if it is not present in A return -1 instead.


Example Input
A = [ [1, 2, 3]
          [4, 5, 6]
          [7, 8, 9] ]
B = 2


Example Output
1011


Example Explanation
A[1][2]= 2
1*1009 + 2 =1011
*/

package Arrays.Matrix;

public class SearchInSortedMatrix {

    private static int solve(int[][] A, int B) {
        int n = A.length, m = A[0].length;

        int i = -1;
        for (int k = 0; k < n; k++) {
            if (A[k][0] <= B)
                i = k;
            else
                break;
        }

        if (i == -1)
            return -1;

        int j = -1;
        for (int l = 0; l < m; l++) {
            if (A[i][l] == B) {
                j = l;
                break;
            }
        }

        if (j == -1)
            return -1;

        return i * 1009 + j;
    }

    public static void main(String[] args) {
        int[][] A = {
                { 75, 81, 83, 92, 97, 102, 105, 112, 113, 118, 121, 123, 127, 130, 133, 134, 136, 139, 141, 142, 146,
                        151, 154, 157, 159, 162, 167, 168, 171, 174, 179, 181, 183 },
        };

        System.out.println(solve(A, 2));
    }

}
