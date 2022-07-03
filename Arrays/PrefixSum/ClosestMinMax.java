/*
Closest MinMax
Problem Description

Given an array A. Find the size of the smallest subarray such that it contains atleast one occurrence of the maximum value of the array

and atleast one occurrence of the minimum value of the array.



Problem Constraints
1 <= |A| <= 2000



Input Format
First and only argument is vector A



Output Format
Return the length of the smallest subarray which has atleast one occurrence of minimum and maximum element of the array



Example Input
Input 1:

A = [1, 3]
Input 2:

A = [2]


Example Output
Output 1:

 2
Output 2:

 1


Example Explanation
Explanation 1:

 Only choice is to take both elements.
Explanation 2:

 Take the whole array.
 */

package Arrays.PrefixSum;

class ClosestMinMax {

    private static int solve(int[] A) {
        int min = A[0], max = A[0];

        for (int i = 1; i < A.length; i++) {
            min = Math.min(min, A[i]);
            max = Math.max(max, A[i]);
        }

        int min_index = -1, max_index = -1, res = Integer.MAX_VALUE;

        for (int i = 0; i < A.length; i++) {
            if (A[i] == min) {
                min_index = i;
            }

            if (A[i] == max) {
                max_index = i;
            }

            if (min_index != -1 && max_index != -1) {
                int subArrSize = Math.abs(max_index - min_index) + 1;
                res = Math.min(res, subArrSize);
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[] A = { 3, 5, 2, 5, 4, 1, 3 };
        System.out.println(solve(A));
    }

}