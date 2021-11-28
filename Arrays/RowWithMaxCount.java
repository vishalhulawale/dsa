/*
Row with maximum number of ones
Problem Description

Given a binary sorted matrix A of size N x N. Find the row with the maximum number of 1.

NOTE:

If two rows have the maximum number of 1 then return the row which has a lower index.
Rows are numbered from top to bottom and columns are numbered from left to right.
Assume 0-based indexing.
Assume each row to be sorted by values.
Expected time complexity is O(rows).


Problem Constraints
1 <= N <= 1000

0 <= A[i] <= 1



Input Format
The only argument given is the integer matrix A.



Output Format
Return the row with the maximum number of 1.



Example Input
Input 1:

 A = [   [0, 1, 1]
         [0, 0, 1]
         [0, 1, 1]   ]
Input 2:

 A = [   [0, 0, 0, 0]
         [0, 1, 1, 1]    ]


Example Output
Output 1:

 0
Output 2:

 1


Example Explanation
Explanation 1:

 Row 0 has maximum number of 1s.
Explanation 2:

 Row 1 has maximum number of 1s.
*/

package Arrays;

public class RowWithMaxCount {

    public static int solve(int[][] A) {
        int index = 0;
        int max_count = 0;

        for (int i = 0; i < A.length; i++) {
            int cnt = 0;

            for (int j = 0; j < A[i].length; j++) {
                if (A[i][j] == 1)
                    cnt++;
            }

            if (cnt > max_count) {
                max_count = cnt;
                index = i;
            }

            if (cnt == max_count && i < index)
                index = i;
        }

        return index;
    }

    public static void main(String[] args) {
        int[][] A = { { 0, 1, 1 }, { 0, 0, 1 }, { 0, 1, 1 }, };

        System.out.println(solve(A));
    }

}
