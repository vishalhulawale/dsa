/*
Least Common Multiple
Problem Description

You are given two non-negative integers A and B, find the value of Least Common Multiple (LCM) of A and B.

LCM of two integers is the smallest positive integer that is divisible by both.



Problem Constraints
1 <= A, B <= 1000



Input Format
First argument is an integer A.

Second argument is an integer B.



Output Format
Return an integer.



Example Input
Input 1:

 A = 2
 B = 3 
Input 2:

 A = 9
 B = 6
Input 3:

 A = 2
 B = 6


Example Output
Output 1:

 6 
Input 2:

 18 
Input 3:

 6 


Example Explanation
Explanation 1:

 6 is the smallest positive integer which is divisible by both 2 (2 * 3 = 6) and 3 (3 * 2 = 6).
Explanation 2:

 18 is the smallest positive integer which is divisible by both 9 (9 * 2 = 18) and 6 (6 * 3 = 18).
Explanation 3:

 6 is the smallest positive integer which is divisible by both 2 (2 * 3 = 6) and 6 (6 * 1 = 6).
*/

package ModularArithmetic;

public class LCM {

    public static int gcd(int a, int b) {

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;

    }

    private static int solve(int a, int b) {

        long product = a * b;
        int gcd = gcd(a, b);

        return (int) product / gcd;

    }

    public static void main(String[] args) {

        System.out.println(solve(3, 9));

    }

}
