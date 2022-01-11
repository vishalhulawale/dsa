/*
Is is Palindrome?
Problem Description

You have a string (A) and you have to return 1 if it is palindrome otherwise return 0.



Problem Constraints
1 <= A.size() <= 1000



Input Format
First argument containing a lowercase string A.



Output Format
You have to return either 0 or 1 as per the question.



Example Input
Input 1:

abcba
Input 2:

axax
Input 3:

abba


Example Output
Output 1:

1
Output 2:

0
Output 3:

1


Example Explanation
Explanation 1:

Clearly, all characters of abcba from backward is similar with characters from forward.
Explanation 2:

Clearly, all characters of axax from backward is not similar with characters from forward.
Explanation 3:

Clearly, all characters of abba from backward is similar with characters from forward.
*/

package Strings;

public class Palindrome {

    public static int solve(String A) {
        int n = A.length();

        int i = 0, j = n - 1;

        while (i <= j) {
            if (A.charAt(i) != A.charAt(j))
                return 0;

            i++;
            j--;
        }

        return 1;
    }

    public static void main(String[] args) {
        System.out.println(solve("abcba"));
        System.out.println(solve("axax"));
        System.out.println(solve("abba"));
    }

}
