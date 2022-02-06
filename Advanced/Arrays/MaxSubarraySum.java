/*
Max Sum Contiguous Subarray

Problem Description
Find the contiguous non empty subarray within an array, A of length N which has the largest sum.


Problem Constraints
1 <= N <= 1e6
-1000 <= A[i] <= 1000


Input Format
The first and the only argument contains an integer array, A.


Output Format
Return an integer representing the maximum possible sum of the contiguous subarray.


Example Input
Input 1:
A = [1, 2, 3, 4, -10] 

Input 2:
A = [-2, 1, -3, 4, -1, 2, 1, -5, 4] 

Example Output
Output 1:
10 

Output 2:
6 


Example Explanation
Explanation 1:
The subarray [1, 2, 3, 4] has the maximum possible sum of 10. 

Explanation 2:
The subarray [4,-1,2,1] has the maximum possible sum of 6. 
*/

package Advanced.Arrays;

public class MaxSubarraySum {

    public static int maxSubArray(final int[] A) {
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < A.length; i++) {
            sum += A[i];

            maxSum = Math.max(sum, maxSum);

            if (sum < 0)
                sum = 0;
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] A1 = { 1, 2, 3, 4, -10 };
        System.out.println(maxSubArray(A1));
        int[] A2 = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        System.out.println(maxSubArray(A2));
    }

}
