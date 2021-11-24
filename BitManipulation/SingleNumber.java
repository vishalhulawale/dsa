/*
Single Number
Problem Description

Given an array of integers A, every element appears twice except for one. Find that single one.

NOTE: Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?



Problem Constraints
2 <= |A| <= 2000000

0 <= A[i] <= INTMAX



Input Format
First and only argument of input contains an integer array A.



Output Format
Return a single integer denoting the single element.



Example Input
Input 1:

 A = [1, 2, 2, 3, 1]
Input 2:

 A = [1, 2, 2]


Example Output
Output 1:

 3
Output 2:

 1


Example Explanation
Explanation 1:

3 occurs once.
Explanation 2:

1 occurs once.
*/
package BitManipulation;

class SingleNumber {

    public static int solve(int[] A) {

        int result = 0;

        for (int i = 0; i < A.length; i++) {

            result = result ^ A[i];

        }

        return result;

    }

    public static void main(String[] args) {

        int[] input = { 1, 2, 2, 3, 1 };

        int output = solve(input);

        System.out.println(output);

    }

}
