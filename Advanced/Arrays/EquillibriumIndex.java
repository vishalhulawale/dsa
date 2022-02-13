/*
Equilibrium index of an array

Problem Description
You are given an array A of integers of size N.
Your task is to find the equilibrium index of the given array
Equilibrium index of an array is an index such that the sum of elements at lower indexes is equal to the sum of elements at higher indexes.

NOTE:
Array indexing starts from 0.
If there is no equilibrium index then return -1.
If there are more than one equilibrium indexes then return the minimum index.

Problem Constraints
1<=N<=1e5
-1e5<=A[i]<=1e5

Input Format
First arugment contains an array A .

Output Format
Return the equilibrium index of the given array. If no such index is found then return -1.

Example Input
Input 1:
A=[-7, 1, 5, 2, -4, 3, 0]

Input 2:
A=[1,2,3]

Example Output
Output 1:
3

Output 2:
-1

Example Explanation
Explanation 1:
3 is an equilibrium index, because: 
A[0] + A[1] + A[2] = A[4] + A[5] + A[6]

Explanation 1:
There is no such index.
*/

package Advanced.Arrays;

public class EquillibriumIndex {

    public static int solve(int[] A) {
        int n = A.length;
        int[] pf = new int[n];

        // Build prefix array
        pf[0] = A[0];
        for (int i = 1; i < n; i++)
            pf[i] = pf[i - 1] + A[i];

        // Check 0th index
        if (pf[n - 1] - pf[0] == 0)
            return 0;

        // check from 1 to n-1
        for (int i = 1; i < n - 1; i++) {
            if (pf[i - 1] == pf[n - 1] - pf[i])
                return i;
        }

        // Check (n-1)th index
        if (pf[n - 2] == 0)
            return n - 1;

        return -1;
    }

    public static void main(String[] args) {
        int[] A1 = { -7, 1, 5, 2, -4, 3, 0 };
        int[] A2 = { 1, 2, 3 };

        System.out.println(solve(A1));
        System.out.println(solve(A2));
    }

}
