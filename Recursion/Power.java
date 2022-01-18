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

package Recursion;

public class Power {

    public static int pow(int A, int B, int C) {

        // Base cases
        if (A == 0)
            return 0;

        if (B == 0)
            return 1;

        // Main logic
        long half = pow(A, B / 2, C) % C;

        long ans = 0;

        if (B % 2 == 0)
            ans = (half * half) % C;
        else
            ans = ((A % C) * ((half * half) % C)) % C;

        if (ans < 0)
            ans += C;

        return (int) ans;

    }

    public static void main(String[] args) {
        System.out.println(pow(71045970, 41535484, 64735492));
    }

}
