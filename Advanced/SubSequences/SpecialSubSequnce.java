/*
Special Subsequences "AG"

Problem Description
You have given a string A having Uppercase English letters.
You have to find how many times subsequence "AG" is there in the given string.
NOTE: Return the answer modulo 109 + 7 as the answer can be very large.


Problem Constraints
1 <= length(A) <= 10^5


Input Format
First and only argument is a string A.


Output Format
Return an integer denoting the answer.


Example Input
Input 1:
A = "ABCGAG"

Input 2:
A = "GAB"


Example Output
Output 1:
3

Output 2:
0


Example Explanation
Explanation 1:
Subsequence "AG" is 3 times in given string 

Explanation 2:
There is no subsequence "AG" in the given string.
*/

package Advanced.SubSequences;

public class SpecialSubSequnce {
    public static int solve(String A) {
        int res = 0;
        int N = A.length();
        int cnt = 0;

        for (int i = 0; i < N; i++) {
            char c = A.charAt(i);

            if (c == 'A') {
                cnt++;
            } else if (c == 'G') {
                res += cnt;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        String A = "ABCGAG";
        System.out.println(solve(A));
    }

}
