/*
Check Palindrome

Problem Description
Write a recursive function that checks whether a string A is a palindrome or Not.
Return 1 if the string A is palindrome, else return 0.

Note: A palindrome is a string that's the same when reads forwards and backwards.


Problem Constraints
1 <= A <= 50000

String A consist only of lowercase letters.


Input Format
First and only argument is a string A.


Output Format
Return 1 if the string A is palindrome, else return 0.


Example Input
Input 1:
A = "naman"

Input 2:
A = "strings"


Example Output
Output 1:
1

Output 2:
0


Example Explanation
Explanation 1:
"naman" is a palindomic string, so return 1.

Explanation 2:
"strings" is not a palindrome, so return 0.
*/

package Recursion;

class Palindrome {

    public static int isPalindrome(String A, int s, int e) {

        if (s >= e)
            return 1;

        if (A.charAt(s) == A.charAt(e))
            return isPalindrome(A, s + 1, e - 1);

        return 0;

    }

    public static int solve(String A) {
        return isPalindrome(A, 0, A.length() - 1);
    }

    public static void main(String[] args) {
        System.out.println(solve("naman"));
        System.out.println(solve("strings"));
    }

}
