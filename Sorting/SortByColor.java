/*
Sort by Color
Problem Description

Given an array with n objects colored red, white or blue, sort them so that objects of the same color are adjacent, with the colors in the order red, white and blue.
Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.

Note: Using library sort function is not allowed.



Problem Constraints
1 <= N <= 1000000
0 <= A[i] <= 2


Input Format
First and only argument of input contains an integer array A.


Output Format
Return an integer array in asked order


Example Input
Input 1 :
    A = [0 1 2 0 1 2]
Input 2:

    A = [0]


Example Output
Output 1:
    [0 0 1 1 2 2]
Output 2:

    [0]


Example Explanation
Explanation 1:
    [0 0 1 1 2 2] is the required order.
*/

package Sorting;

public class SortByColor {

    public static int[] solve(int[] A) {
        int red = 0;
        int white = 0;
        int blue = 0;

        for (int i = 0; i < A.length; i++) {
            if (A[i] == 0)
                red++;

            if (A[i] == 1)
                white++;

            if (A[i] == 2)
                blue++;
        }

        int cnt = 0;

        for (int i = 0; i < red; i++, cnt++)
            A[cnt] = 0;

        for (int i = 0; i < white; i++, cnt++)
            A[cnt] = 1;

        for (int i = 0; i < blue; i++, cnt++)
            A[cnt] = 2;

        return A;
    }

    public static void main(String[] args) {
        int[] A = { 0, 1, 2, 0, 1, 2 };

        int[] res = solve(A);

        for (int i : res) {
            System.out.print(i + "\t");
        }
    }

}
