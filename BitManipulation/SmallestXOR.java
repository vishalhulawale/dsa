/*
Smallest XOR

Problem Description
Given two integers A and B, find a number X such that A xor X is minimum possible, and the number of set bits in X equals B.

Problem Constraints
0 <= A <= 10^9
0 <= B <= 30

Input Format
First argument contains a single integer A. Second argument contains a single integer B.

Output Format
Return a single integer X.

Example Input
Input 1:
A = 3
B = 3

Output 1:
7

Input 2:
A = 15
B = 2

Output 2:
12


Example Explanation
Explanation 1:

3 xor 7 = 4 which is minimum
Explanation 2:

15 xor 12 = 3 which is minimum

*/

package BitManipulation;

public class SmallestXOR {

    public static int countSetBits(int A) {

        int cnt = 0;

        while (A > 0) {

            if ((A & 1) == 1)
                cnt++;

            A = A >> 1;
        }

        return cnt;
    }

    public static boolean checkSetBit(int A, int pos) {

        return ((A >> pos) & 1) == 1;

    }

    public static int solve(int A, int B) {

        int setBitCnt = countSetBits(A);

        if (setBitCnt == B)
            return A;

        int X = A;

        if (setBitCnt > B) {

            int diff = setBitCnt - B;

            for (int i = 0; i < diff; i++) {

                if (checkSetBit(A, i))
                    X = X ^ (1 << i);

            }
        } else {

            for (int i = 0; i < B; i++) {

                if (!checkSetBit(A, i))
                    X = X ^ (1 << i);

            }

        }

        return X;

    }

    public static void main(String[] args) {
        System.out.println("3, 3 > " + solve(3, 3) + " < should be 7");
        System.out.println("15, 2 > " + solve(15, 2) + " < should be 12");
        System.out.println("9, 3 > " + solve(9, 3) + " < should be 15");
    }

}
