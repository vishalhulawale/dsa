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

public class ModStringV2 {

    public static long solve(String A, int B) {
        long ans = 0, exp = 1;
        int N = A.length();

        for (int i = N - 1; i >= 0; i--) {
            int digit = Character.getNumericValue(A.charAt(i));

            ans += ((digit % B) * (exp % B)) % B;

            exp = (exp * 10) % B;
        }

        return ans % B;
    }

    public static void main(String[] args) {
        System.out.println(solve("143", 2));

    }

}
