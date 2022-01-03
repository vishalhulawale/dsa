/*
Spiral Order Matrix II


Problem Description
Given an integer A, generate a square matrix filled with elements from 1 to A2 in spiral order.


Problem Constraints
1 <= A <= 1000


Input Format
First and only argument is integer A


Output Format
Return a 2-D matrix which consists of the elements in spiral order.


Example Input
Input 1:
1

Input 2:
2


Example Output
Output 1:
[ [1] ]

Output 2:
[ [1, 2], [4, 3] ]


Example Explanation
Explanation 1:
Only 1 is to be arranged.

Explanation 2:
1 --> 2
      |
      |
4<--- 3
*/

package Arrays.Matrix;

public class SpriralOrderMatrix {
    private static int[][] solve(int A) {
        int[][] res = new int[A][A];

        int n = A, cnt = 1;

        int i = 0, j = 0;

        while (n > 1) {
            // 0th row
            for (int k = 1; k <= n - 1; k++) {
                res[i][j] = cnt;
                cnt++;
                j++;
            }

            // last column
            for (int k = 1; k <= n - 1; k++) {
                res[i][j] = cnt;
                cnt++;
                i++;
            }

            // last row
            for (int k = 1; k <= n - 1; k++) {
                res[i][j] = cnt;
                cnt++;
                j--;
            }

            // first column
            for (int k = 1; k <= n - 1; k++) {
                res[i][j] = cnt;
                cnt++;
                i--;
            }

            n -= 2;
            i++;
            j++;
        }

        if (n == 1)
            res[i][j] = cnt;

        return res;
    }

    public static void main(String[] args) {
        int[][] res = solve(5);

        for (int[] row : res) {
            for (int num : row)
                System.out.print(num + "\t");

            System.out.print("\n");
        }
    }
}
