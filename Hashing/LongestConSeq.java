/*
Longest Consecutive Sequence

Problem Description
Given an unsorted integer array A of size N.
Find the length of the longest set of consecutive elements from the array A.


Problem Constraints
1 <= N <= 10^6
-106 <= A[i] <= 10^6


Input Format
First argument is an integer array A of size N.


Output Format
Return an integer denoting the length of the longest set of consecutive elements from the array A.


Example Input
Input 1:
A = [100, 4, 200, 1, 3, 2]

Input 2:
A = [2, 1]


Example Output
Output 1:
4

Output 2:
2


Example Explanation
Explanation 1:
The set of consecutive elements will be [1, 2, 3, 4].

Explanation 2:
The set of consecutive elements will be [1, 2].
*/
package Hashing;

import java.util.HashSet;

class LongestConSeq {

    public static int longestConsecutive(final int[] A) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : A)
            set.add(num);

        int maxLength = 1;

        for (int num : set) {

            int length = 1, k = 1;

            if (!set.contains(num - 1)) {

                while (set.contains(num + k)) {
                    length++;
                    k++;
                }

                maxLength = Math.max(length, maxLength);

            }

        }

        return maxLength;
    }

    public static void main(String[] args) {
        int[] A = { 100, 4, 200, 1, 3, 2 };

        System.out.println(longestConsecutive(A));
    }
}
