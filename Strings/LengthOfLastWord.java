/*
Length of Last Word
Problem Description

Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.

If the last word does not exist, return 0.

Note: A word is defined as a character sequence consists of non-space characters only.

Example:

Given s = "Hello World",

return 5 as length("World") = 5.
Please make sure you try to solve this problem without using library functions. Make sure you only traverse the string once.
*/

package Strings;

class LengthOfLastWord {

    public static int solve(String A) {

        int n = A.length();

        int i = n - 1, cnt = 0;

        // Ignore all spaces at the end
        while (i >= 0 && A.charAt(i) == ' ')
            i--;

        // Count word length
        while (i >= 0 && A.charAt(i) != ' ') {
            cnt++;
            i--;
        }

        return cnt;

    }

    public static void main(String[] args) {
        System.out.println(solve("Hello World    "));
    }

}
