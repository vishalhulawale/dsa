/*
Implement Power Function

Problem Description
Implement pow(x, n) % d.
In other words, given x, n and d,
find (xn % d)
Note that remainders on division cannot be negative. In other words, make sure the answer you return is non negative.


Input : x = 2, n = 3, d = 3

Output : 2

2^3 % 3 = 8 % 3 = 2.
*/

package Advanced.Recursion;

public class PowerFunction {

    public static int pow(int A, int B, int C) {
        if (A == 1 || B == 0)
            return 1;

        if (A == 0)
            return 0;

        int halfPow = pow(A, B / 2, C);

        int ans;
        if (B % 2 == 0)
            ans = (halfPow * halfPow) % C;
        else
            ans = ((halfPow * halfPow) % C * (A % C)) % C;

        if (ans < 0)
            ans += C;

        return ans;
    }

    public static void main(String[] args) {
        System.out.println(pow(71045970, 41535484, 64735492));
    }

}
