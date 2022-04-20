/*
Subsequence-Sum Problem

Problem Description
You are given an array of integers of N size.
You have to find that there is any subsequence exists or not whose sum is equal to B.


Problem Constraints
1 <= N <= 20
1 <= A[i] <= 100000
0 <= B <= 1e9


Input Format
First Argument is array of integers A
Second Argument is B


Output Format
Return 1 if any subsequence sum is equal to B otherwise return 0.


Example Input
Input 1:  
A=[1,20,13,4,5]
B=18

Input 2:             
A=[2,2,2,2]
B=5


Output 1:
1

Output 2:
0


Example Explanation
Explanation 1:
There is as subsequence present at indexes 1,3,4 whose sum is 18

Explanation 2:
There is no possible subsequence whose sum is 5

NOTE: Array is considered 1 based indexing for the above explanation.
*/

package SubSequences;

public class ArraySumSubsequence {

    public static boolean checkBit(int num, int pos) {
        return ((num >> pos) & 1) == 1;
    }

    public static int solve(int[] A, int B) {
        int n = A.length;

        for (int i = 0; i < (1 << n); i++) {
            int sum = 0;
            for (int j = 0; j < A.length; j++) {
                if (checkBit(i, j))
                    sum += A[j];
            }

            if (sum == B)
                return 1;
        }

        return 0;
    }

    public static void main(String[] args) {
        int[] A1 = { 1, 20, 13, 4, 5 };
        int B1 = 18;

        int[] A2 = { 2, 2, 2, 2 };
        int B2 = 5;

        System.out.println(solve(A1, B1));
        System.out.println(solve(A2, B2));
    }
}
