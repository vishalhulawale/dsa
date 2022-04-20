/*
Find subsequence

Given two strings A and B, find if A is a subsequence of B.
Return "YES" if A is a subsequence of B, else return "NO".


Input Format
The first argument given is the string A.
The second argument given is the string B.


Output Format
Return "YES" if A is a subsequence of B, else return "NO".


Constraints
1 <= lenght(A), length(B) <= 100000
'a' <= A[i], B[i] <= 'z'

For Example
Input 1:
A = "bit"
B = "dfbkjijgbbiihbmmt"

Output 1:
YES

Input 2:
A = "apple"
B = "appel"

Output 2:
"NO"
*/
package SubSequences;

public class StringSubSequence {

    public static String solve(String A, String B) {
        int i = 0, j = 0;

        while (i < A.length() && j < B.length()) {
            if (A.charAt(i) == B.charAt(j))
                i++;

            j++;
        }

        if (i == A.length())
            return "YES";

        return "NO";
    }

    public static void main(String[] args) {
        String A1 = "bit";
        String B1 = "dfbkjijgbbiihbmmt";

        String A2 = "apple";
        String B2 = "appel";

        System.out.println(solve(A1, B1));
        System.out.println(solve(A2, B2));
    }

}
