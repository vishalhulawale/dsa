/*
Divisibility by 8
Given a number A in the form of string. Check if the number is divisible by 8 or not.

Return 1 if it is divisible by 8 else return 0.


Input Format

The only argument given is string A.
Output Format

Return 1 if it is divisible by 8 else return 0.

Constraints

1 <= length of the String <= 100000
'0' <= A[i] <= '9'
For Example

Input 1:
    A = "16"
Output 1:
    1

Input 2:
    A = "123"
Output 2:
    0
*/
package Maths;

class EightDivisibility {
    public static int solve(String A) {
        int N = A.length();

        if (N > 3) {
            A = A.substring(N - 3, N);
        }

        if (Integer.parseInt(A) % 8 == 0)
            return 1;

        return 0;
    }

    public static void main(String[] args) {
        String A = "123";

        System.out.println(solve(A));
    }
}
