/*
Reverse Bits

Problem Description
Reverse the bits of an 32 bit unsigned integer A.

Problem Constraints
0 <= A <= 2^32

Input Format
First and only argument of input contains an integer A.

Output Format
Return a single unsigned integer denoting the decimal value of reversed bits.

Example Input
Input 1:
0

Input 2:
3

Example Output
Output 1:
0

Output 2:
3221225472


Example Explanation
Explanation 1:
        00000000000000000000000000000000    
=>      00000000000000000000000000000000

Explanation 2:
        00000000000000000000000000000011    
=>      11000000000000000000000000000000
	1100000000000000000000000000000
*/
package BitManipulation;

public class ReverseBits {

    public static boolean checkSetBit(long A, int pos) {

        return ((A >> pos) & 1) == 1;

    }

    public static long reverse(long A) {
        int N = 31;
        long result = A;

        for (int i = 0; i <= N / 2; i++) {

            boolean lbit = checkSetBit(A, i);
            boolean rbit = checkSetBit(A, N - i);

            if (lbit != rbit) {
                result = result ^ ((1l << i) | (1l << (N - i)));
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println("0 >" + reverse(0) + " < should be 0");
        System.out.println("3 >" + reverse(3) + " < should be 3221225472");
    }

}
