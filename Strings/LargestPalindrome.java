/*
Largest Palindrome

Problem Description
A palindrome is a string that is the same as its reverse. Example "malayalam", "dad", "appa" etc. In this problem, you are asked to find the length of the longest contiguous substring of a given string, which is a palindrome.

NOTE:If you are using Python then select Python 3(python-3.5)


Problem Constraints
1 <= |A| <= 2 x 105


Input Format
The only argument contains the string A.


Output Format
Return the length of the longest palindromic substring of A.


Example Input
Input 1:
"abcaa"

Input 2:
"abcba"


Example Output
Output 1:
2

Output 2:
5

Example Explanation
Explanation 1:
"aa" is a palindromic substring.

Explanation 2:
The complete string is a palindrome
*/

package Strings;

public class LargestPalindrome {

    public int palindromeAtPoint(String str, int s, int e) {
        int n = str.length();

        while (s >= 0 && e < n && str.charAt(s) == str.charAt(e)) {
            s--;
            e++;
        }

        return e - s - 1;
    }

    public int solve(String A) {
        int ans = 1;
        int n = A.length();

        for (int i = 0; i < n; i++) {

            // check for even length palindrome
            ans = Math.max(ans, palindromeAtPoint(A, i, i + 1));

            // check for odd length palindrome
            ans = Math.max(ans, palindromeAtPoint(A, i, i));

        }

        return ans;
    }

    public static void main(String[] args) {
        LargestPalindrome l = new LargestPalindrome();

        System.out.println(l.solve("abcaa"));
        System.out.println(l.solve("abcba"));
    }

}
