/*
Sub-array with 0 sum

Problem Description
Given an array of integers A, find and return whether the given array contains a non-empty subarray with a sum equal to 0.
If the given array contains a sub-array with sum zero return 1, else return 0.


Problem Constraints
1 <= |A| <= 100000
-10^9 <= A[i] <= 10^9


Input Format
The only argument given is the integer array A.


Output Format
Return whether the given array contains a subarray with a sum equal to 0.


Example Input
Input 1:
A = [1, 2, 3, 4, 5]

Input 2:
A = [-1, 1]


Example Output
Output 1:
0

Output 2:
1


Example Explanation
Explanation 1:
No subarray has sum 0.

Explanation 2:
The array has sum 0.
*/

package Advanced.Hashing;

import java.util.HashSet;

public class SubArrWithSumZer {
    public static int solve(int[] A) {

        HashSet<Long> pfSumSet = new HashSet<>();

        long sum = 0;
        pfSumSet.add(sum);

        for (int num : A) {
            sum += num;

            if (pfSumSet.contains(sum))
                return 1;

            pfSumSet.add(sum);
        }

        return 0;

    }

    public static void main(String[] args) {
        int[] A1 = { 1, 2, 3, 4, 5 };
        int[] A2 = { -1, 1 };

        System.out.println(solve(A1));
        System.out.println(solve(A2));
    }
}
