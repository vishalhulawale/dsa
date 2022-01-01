/*
Repeat and Missing Number Array
You are given a read only array of n integers from 1 to n.

Each integer appears exactly once except A which appears twice and B which is missing.

Return A and B.

Note: Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

Note that in your output A should precede B.

Example:

Input:[3 1 2 5 3] 

Output:[3, 4] 

A = 3, B = 4
*/

package Maths;

public class RepeatAndMissingNumber {

    private static int[] solve(int[] A) {
        int[] res = new int[2];

        long n = A.length;

        long sumActual = (n * (n + 1)) / 2;
        long squaresSumActual = (n * (n + 1) * (2 * n + 1)) / 6;

        long sumGiven = 0;
        long squaresSumGiven = 0;

        for (long num : A) {
            sumGiven += num;
            squaresSumGiven += num * num;
        }

        long A_Minus_B = sumActual - sumGiven;
        long A2_Minus_B2 = squaresSumActual - squaresSumGiven;
        long A_Plus_B = A2_Minus_B2 / A_Minus_B;

        res[0] = (int) ((A_Plus_B - A_Minus_B) / 2);
        res[1] = (int) ((A_Minus_B + A_Plus_B) / 2);

        return res;
    }

    public static void main(String[] args) {
        int[] A = { 3, 1, 2, 5, 3 };

        for (int i : solve(A)) {
            System.out.println(i);
        }
    }

}
