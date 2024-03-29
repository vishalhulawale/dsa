/*
Reverse the String
Problem Description

Given a string A of size N.

Return the string A after reversing the string word by word.

NOTE:

A sequence of non-space characters constitutes a word.
Your reversed string should not contain leading or trailing spaces, even if it is present in the input string.
If there are multiple spaces between words, reduce them to a single space in the reversed string.


Problem Constraints
1 <= N <= 3 * 105



Input Format
The only argument given is string A.



Output Format
Return the string A after reversing the string word by word.



Example Input
Input 1:
    A = "the sky is blue"
Input 2:
    A = "this is ib"  


Example Output
Output 1:
    "blue is sky the"
Output 2:
    "ib is this"    


Example Explanation
Explanation 1:
    We reverse the string word by word so the string becomes "the sky is blue".
Explanation 2:
    We reverse the string word by word so the string becomes "this is ib".
*/

package Strings;

public class ReverseWords {

    private static void reverse(StringBuilder A, int i, int j) {

        while (i <= j) {
            char temp = A.charAt(i);
            A.setCharAt(i, A.charAt(j));
            A.setCharAt(j, temp);

            i++;
            j--;
        }
    }

    private static String solve(String A) {
        int n = A.length();
        StringBuilder sb = new StringBuilder(A);

        // Reverse whole string
        reverse(sb, 0, n - 1);

        int si = 0, ei = 0;

        while (ei < n) {

            // Reverse each word
            if (ei == n - 1 || sb.charAt(ei + 1) == ' ')
                reverse(sb, si, ei);

            if (sb.charAt(ei) == ' ')
                si = ei + 1;

            ei++;
        }

        // Remove all spaces that are coming after one space
        int i = sb.length() - 1;
        while (i > 0) {
            if (sb.charAt(i - 1) == ' ' && sb.charAt(i) == ' ')
                sb.deleteCharAt(i);

            i--;
        }

        // Remove if one space is left at first position
        if (sb.charAt(0) == ' ')
            sb.deleteCharAt(0);

        // Remove if one space is left at last position
        int lastIndex = sb.length() - 1;
        if (sb.charAt(lastIndex) == ' ')
            sb.deleteCharAt(lastIndex);

        return sb.toString();
    }

    public static void main(String[] args) {

        System.out.println("\"" + solve("    the    sky    is    blue   ") + "\"");

    }

}
