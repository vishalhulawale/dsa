/*
Range Sum Query

Problem Description
You are given an integer array A of length N.
You are also given a 2D integer array B with dimensions M x 2, where each row denotes a [L, R] query.
For each query, you have to find the sum of all elements from L to R indices in A (1 - indexed).
More formally, find A[L] + A[L + 1] + A[L + 2] +... + A[R - 1] + A[R] for each query.


Problem Constraints
1 <= N, M <= 10^5
1 <= A[i] <= 10^9
1 <= L <= R <= N


Input Format
The first argument is the integer array A.
The second argument is the 2D integer array B.


Output Format
Return an integer array of length M where ith element is the answer for ith query in B.


Example Input
Input 1:
A = [1, 2, 3, 4, 5]
B = [[1, 4], [2, 3]]

Input 2:
A = [2, 2, 2]
B = [[1, 1], [2, 3]]


Example Output
Output 1:
[10, 5]

Output 2:
[2, 4]


Example Explanation
Explanation 1:
The sum of all elements of A[1 ... 4] = 1 + 2 + 3 + 4 = 10.
The sum of all elements of A[2 ... 3] = 2 + 3 = 5.

Explanation 2:
The sum of all elements of A[1 ... 1] = 2 = 2.
The sum of all elements of A[2 ... 3] = 2 + 2 = 4.
*/

package Arrays.PrefixSum;

public class RangeSum {

    public static void main(String[] args) {
        int[] A = { 1, 2, 3, 4, 5 };
        int[][] B = { { 1, 4 }, { 2, 3 } };

        int[] res = solve(A, B);

        for (int i : res) {
            System.out.println(i);
        }
    }

    private static int[] solve(int[] A, int[][] B) {
        int[] res = new int[B.length];

        int n = A.length;
        int[] pfSum = new int[n];
        pfSum[0] = A[0];

        for (int i = 1; i < n; i++) {
            pfSum[i] = pfSum[i - 1] + A[i];
        }

        for (int i = 0; i < B.length; i++) {
            int s = B[i][0] - 1;
            int e = B[i][1] - 1;

            if (s == 0)
                res[i] = pfSum[e];
            else
                res[i] = pfSum[e] - pfSum[s - 1];
        }

        return res;
    }

}
