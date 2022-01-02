/*
Length of longest consecutive ones
Given a binary string A. It is allowed to do at most one swap between any 0 and 1. Find and return the length of the longest consecutive 1’s that can be achieved.


Input Format

The only argument given is string A.
Output Format

Return the length of the longest consecutive 1’s that can be achieved.
Constraints

1 <= length of string <= 1000000
A contains only characters 0 and 1.
For Example

Input 1:
    A = "111000"
Output 1:
    3

Input 2:
    A = "111011101"
Output 2:
    7
*/

package ModularArithmetic;

public class LongestConsecutiveOne {

    public static int solve(String A) {
        int n = A.length();

        int allOneCount = 0;
        for (int i = 0; i < n; i++)
            if (A.charAt(i) == '1')
                allOneCount++;

        if (allOneCount == n)
            return n;

        int[] left = new int[n];
        for (int i = 1; i < n; i++) {

            if (A.charAt(i - 1) == '1')
                left[i] = left[i - 1] + 1;
            else
                left[i] = 0;

        }

        int[] right = new int[n];
        for (int i = n - 2; i >= 0; i--) {

            if (A.charAt(i + 1) == '1')
                right[i] = right[i + 1] + 1;
            else
                right[i] = 0;

        }

        int maxCount = 0;
        for (int i = 0; i < right.length; i++) {
            if (A.charAt(i) == '0') {

                int cnt = left[i] + right[i];

                if (allOneCount > cnt)
                    cnt++;
                else if (allOneCount < cnt)
                    cnt--;

                maxCount = Math.max(maxCount, cnt);
            }
        }

        return maxCount;
    }

    public static void main(String[] args) {
        System.out.println(solve("1111111111111"));
    }

}
