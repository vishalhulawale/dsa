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

package ModularArithmetic;

public class DivisibilityByEight {
    public static int solve(String A) {
        int n = A.length();

        int i = 0, numberToCheck = 0, exp = 1;

        while (i < Math.min(3, A.length())) {
            numberToCheck += Character.getNumericValue(A.charAt(n - 1 - i)) * exp;

            exp *= 10;
            i++;
        }

        if (numberToCheck % 8 > 0)
            return 0;
        else
            return 1;
    }

    public static void main(String[] args) {
        System.out.println(solve("16"));
    }
}
