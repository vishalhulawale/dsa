/*
Square root of a number

Problem Description
Given a number A. Return square root of the number if it is perfect square otherwise return -1.


Problem Constraints
1 <= A <= 10^8


Input Format
First argument is an integer A.


Output Format
Return an integer which is the square root of A if A is perfect square otherwise return -1.


Example Input
Input 1:
A = 4

Input 2:
A = 1001


Example Output
Output 1:
2

Output 2:
-1


Example Explanation
Explanation 1:
sqrt(4) = 2

Explanation 2:
1001 is not a perfect square.
*/

package ProblemSolving;

public class SquareRoot {
    public static int solve(int A) {
        for (int i = 0; i * i <= A; i++)
            if (i * i == A)
                return i;

        return -1;
    }

    public static void main(String[] args) {

        System.out.println(solve(4));
        System.out.println(solve(1001));

    }
}
