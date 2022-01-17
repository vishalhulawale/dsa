/*
Is magic?

Problem Description
Given a number A, check if it is a magic number or not.
A number is said to be a magic number, if the sum of its digits are calculated till a single digit recursively by adding the sum of the digits after every addition. If the single digit comes out to be 1, then the number is a magic number.


Problem Constraints
1 <= A <= 109


Input Format
First and only argument is an integer A.


Output Format
Return an integer 1 if the given number is magic else return 0.


Example Input
Input 1:
A = 83557

Input 2:
A = 1291


Example Output
Output 1:
1

Output 2:
0


Example Explanation
Explanation 1:
Sum of digits of (83557) = 28
Sum of digits of (28) = 10
Sum of digits of (10) = 1. 
Single digit is 1, so it's a magic number. Return 1.

Explanation 2:
Sum of digits of (1291) = 13
Sum of digits of (13) = 4
Single digit is not 1, so it's not a magic number. Return 0.
*/

package Recursion;

public class MagicNumber {

    public static int getSingleDigitSum(int A) {
        // Base condition
        if (A < 10)
            return A;

        // Main logic
        int digit = A % 10;

        int res = digit + getSingleDigitSum(A / 10);

        return getSingleDigitSum(res);
    }

    public static int solve(int A) {
        int ans = getSingleDigitSum(A);

        if (ans == 1)
            return 1;
        else
            return 0;
    }

    public static void main(String[] args) {
        System.out.println(solve(83557));
    }

}
