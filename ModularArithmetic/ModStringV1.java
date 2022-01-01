/*
Mod String
Problem Description
You are given a huge number in the form of a string A where each character denotes a digit of the number.
You are also given a number B. You have to find out the value of A % B and return it.



Problem Constraints
1 <= A.size() <= 105
0 <= Ai <= 9
1 <= B <= 109


Input Format
The first argument is the string A.
The second argument is the integer B.


Output Format
Return a single integer denoting the value of A % B.


Example Input
Input 1:
A = "143"
B = 2
Input 2:

A = "43535321"
B = 47


Example Output
Output 1:
1
Output 2:

20


Example Explanation
Explanation 1:
143 is an odd number so 143 % 2 = 1.
Explanation 2:

43535321 % 47 = 20
*/

package ModularArithmetic;

public class ModStringV1 {

    public static int power(int n, int p, int m) {

        long ans = 1;

        // (n ^ p) % m => (n * n * n .... p-times) % m
        // (n % m * n % m ..... p times) % m

        for (int i = 0; i < p; i++) {
            ans = (ans * (n % m)) % m;
        }

        return (int) ans;

    }

    public static int solve(String A, int B) {
        long ans = 0;

        int n = A.length();

        for (int i = 0; i < n; i++) {

            ans = (ans + (Character.getNumericValue(A.charAt(i)) % B * power(10, n - 1 - i, B)) % B) % B;

        }

        return (int) ans;
    }

    public static void main(String[] args) {
        System.out.println(solve("43535321", 47));

    }

}
