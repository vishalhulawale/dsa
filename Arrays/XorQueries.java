/*
Xor queries
Problem Description

You are given an array A (containing only 0 and 1) as element of N length.
Given L and R, you need to determine value of XOR of all elements from L to R (both inclusive) and number of unset bits (0's) in the given range of the array.



Problem Constraints
1<=N,Q<=100000
1<=L<=R<=N


Input Format
First argument contains the array of size N containing 0 and 1 only. 
Second argument contains a 2D array with Q rows and 2 columns, each row represent a query with 2 columns representing L and R.


Output Format
Return an 2D array of Q rows and 2 columns i.e the xor value and number of unset bits in that range respectively for each query.


Example Input
A=[1,0,0,0,1]
B=[ [2,4],
    [1,5],
    [3,5] ]


Example Output
[[0 3]
[0 3]
[1 2]]


Example Explanation
In the given case the bit sequence is of length 5 and the sequence is 1 0 0 0 1. 
For query 1 the range is (2,4), and the answer is (array[2] xor array[3] xor array[4]) = 0, and number of zeroes are 3, so output is 0 3. 
Similarly for other queries.
*/

package Arrays;

public class XorQueries {

    private static int[][] solve(int[] A, int[][] B) {
        int[] pfZero = new int[A.length];

        // Calculate pfZero for 0th index
        pfZero[0] = A[0] == 0 ? 1 : 0;

        // Calculate pfZero
        for (int i = 1; i < pfZero.length; i++)
            pfZero[i] = A[i] == 0 ? pfZero[i - 1] + 1 : pfZero[i - 1];

        int[][] res = new int[B.length][2];
        for (int i = 0; i < B.length; i++) {
            int l = B[i][0] - 1;
            int r = B[i][1] - 1;
            int length = r - l + 1;

            int zeroCnt = l == 0 ? pfZero[r] : pfZero[r] - pfZero[l - 1];
            int oneCnt = length - zeroCnt;

            int xor = 0;

            if (oneCnt % 2 == 1)
                xor = 1;

            res[i][0] = xor;
            res[i][1] = zeroCnt;
        }

        return res;
    }

    public static void main(String[] args) {

        int[] A = { 1, 0, 0, 0, 1 };
        int[][] B = {
                { 2, 4 },
                { 1, 5 },
                { 3, 5 }
        };

        int[][] res = solve(A, B);

        for (int[] pair : res)
            System.out.println(pair[0] + "\t" + pair[1]);
    }

}
