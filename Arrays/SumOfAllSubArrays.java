/*
Sum of All Subarrays
Problem Description
You are given an integer array A of length N.
You have to find the sum of all subarray sums of A.
More formally, a subarray is a defined as a contiguous part of an array,
which we can obtain by deleting zero or more elements from either end of the array.
A subarray sum denotes the sum of all the elements of that subarray.



Problem Constraints
1 <= N <= 105
1 <= Ai <= 10 4


Input Format
The first argument is the integer array A.


Output Format
Return a single integer denoting the sum of all subarray sums of the given array.


Example Input
Input 1:
A = [1, 2, 3]
Input 2:

A = [2, 1, 3]


Example Output
Output 1:
20
Output 2:

19


Example Explanation
Explanation 1:
The different subarrays for the given array are: [1], [2], [3], [1, 2], [2, 3], [1, 2, 3].
Their sums are: 1 + 2 + 3 + 3 + 5 + 6 = 20
Explanation 2:

Similiar to the first example, the sum of all subarray sums for this array is 19.
*/

package Arrays;

class SumOfAllSubArrays {

    public static long solve(int[] A) {
        long sum = 0;
        int N = A.length;

        for (int i = 0; i < N; i++) {
            long left = (i + 1);
            long right = (N - i);

            sum += (A[i] * left * right);
        }

        return sum;
    }

    public static void main(String[] args) {
        int[] A = { 1, 2, 3 };

        System.out.println(solve(A));
    }

}