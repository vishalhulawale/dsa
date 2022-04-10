/*
Rain Water Trapped

Problem Description
Given a vector A of non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it is able to trap after raining.


Problem Constraints
1 <= |A| <= 100000


Input Format
First and only argument is the vector A


Output Format
Return one integer, the answer to the question


Example Input
Input 1:
A = [0, 1, 0, 2]

Input 2:
A = [1, 2]


Example Output
Output 1:
1

Output 2:
0


Example Explanation
Explanation 1:
1 unit is trapped on top of the 3rd element.

Explanation 2:
No water is trapped.
*/

package Arrays;

public class RainWaterTrapped {

    public static int trap(final int[] A) {
        int ans = 0;
        int n = A.length;

        int[] leftMax = new int[n];
        for (int i = 1; i < n; i++)
            leftMax[i] = Math.max(leftMax[i - 1], A[i - 1]);

        int[] rightMax = new int[n];
        for (int i = n - 2; i >= 0; i--)
            rightMax[i] = Math.max(rightMax[i + 1], A[i + 1]);

        for (int i = 0; i < n; i++) {
            int water = Math.min(leftMax[i], rightMax[i]) - A[i];
            ans += Math.max(water, 0);
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] A1 = { 0, 1, 0, 2 };
        System.out.println(trap(A1));

        int[] A2 = { 1, 2 };
        System.out.println(trap(A2));
    }

}
