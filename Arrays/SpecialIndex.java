/*
 * Count ways to make sum of odd and even indexed elements equal by removing an
 * array element
 * Problem Description
 * 
 * Given an array, arr[] of size N, the task is to find the count of array
 * indices such that removing an element from these indices makes the sum of
 * even-indexed and odd-indexed array elements equal.
 * 
 * 
 * 
 * Problem Constraints
 * 1<=n<=1e5
 * -1e5<=A[i]<=1e5
 * 
 * 
 * Input Format
 * First argument contains an array A of integers of size N
 * 
 * 
 * Output Format
 * Return the count of array indices such that removing an element from these
 * indices makes the sum of even-indexed and odd-indexed array elements equal.
 * 
 * 
 * 
 * Example Input
 * Input 1:
 * A=[2, 1, 6, 4]
 * Input 2:
 * 
 * A=[1, 1, 1]
 * 
 * 
 * Example Output
 * Output 1:
 * 1
 * Output 2:
 * 
 * 3
 * 
 * 
 * Example Explanation
 * Explanation 1:
 * Removing arr[1] from the array modifies arr[] to { 2, 6, 4 } such that,
 * arr[0] + arr[2] = arr[1].
 * Therefore, the required output is 1.
 * Explanation 2:
 * 
 * Removing arr[0] from the given array modifies arr[] to { 1, 1 } such that
 * arr[0] = arr[1]
 * Removing arr[1] from the given array modifies arr[] to { 1, 1 } such that
 * arr[0] = arr[1]
 * Removing arr[2] from the given array modifies arr[] to { 1, 1 } such that
 * arr[0] = arr[1]
 * Therefore, the required output is 3.
 */

package Arrays;

class SpecialIndex {

    static int getPrefixSum(int[] P, int l, int r) {
        if (l == 0)
            return P[r];

        return P[r] - P[l - 1];
    }

    private static int solve(int[] A) {
        int cnt = 0;
        int N = A.length;

        int[] pfEven = new int[N];
        int[] pfOdd = new int[N];

        // calculate prefix sum array for even and odd
        pfEven[0] = A[0];
        pfOdd[0] = 0;

        for (int i = 1; i < pfOdd.length; i++) {
            if (i % 2 == 0) {
                pfEven[i] = pfEven[i - 1] + A[i];
                pfOdd[i] = pfOdd[i - 1];
            } else {
                pfOdd[i] = pfOdd[i - 1] + A[i];
                pfEven[i] = pfEven[i - 1];
            }
        }

        // check if 0 is special or not
        if (pfOdd[N - 1] == pfEven[N - 1] - A[0])
            cnt++;

        // check if n-1 is special or not
        if (pfOdd[N - 2] == pfEven[N - 2])
            cnt++;

        // check if given index is special or not
        for (int i = 1; i < N - 1; i++) {
            int sumEven = getPrefixSum(pfEven, 0, i - 1) + getPrefixSum(pfOdd, i + 1, N - 1);
            int oddSum = getPrefixSum(pfOdd, 0, i - 1) + getPrefixSum(pfEven, i + 1, N - 1);

            if (sumEven == oddSum)
                cnt++;
        }

        return cnt;
    }

    public static void main(String[] args) {
        int[] A = { 1, 1, 1 };
        System.out.println(solve(A));
    }

}
