/*
Find pairs in array whose sum is already present
Given an array A of N distinct and positive elements, the task is to find number of unordered pairs whose sum already exists in given array.

Expected Complexity : n^2

CONSTRAINTS

1 <= N <= 1000
1 <= A[i] <= 10^6 + 5
SAMPLE INPUT

A : [ 3, 4, 2, 6 ,7]
SAMPLE OUTPUT

2
EXPLANATION

The pairs following the conditions are : 
(2,4) = 6,
(3,4) = 7
*/
package Hashing;

import java.util.HashSet;
import java.util.Set;

class PairSum {

    public static int solve(int[] A) {
        int ans = 0;

        Set<Integer> numSet = new HashSet<Integer>();

        for (int i = 0; i < A.length; i++)
            numSet.add(A[i]);

        for (int num1 : numSet)

            for (int num2 : numSet)

                if (num1 != num2) {

                    int sum = num1 + num2;

                    if (numSet.contains(sum))
                        ans++;

                }

        // Divide by 2 as each pair will be visited twice
        ans /= 2;

        return ans;
    }

    public static void main(String[] args) {
        int[] A = { 3, 4, 2, 6, 7 };
        System.out.println(solve(A));
    }
}
