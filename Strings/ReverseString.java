/*
Simple Reverse
Problem Description

Given a string A, you are asked to reverse the string and return the reversed string.



Problem Constraints
1 <= |A| <= 105

String A consist only of lowercase characters.



Input Format
First and only argument is a string A.



Output Format
Return a string denoting the reversed string.



Example Input
Input 1:

 A = "scaler"
Input 2:

 A = "academy"


Example Output
Output 1:

 "relacs"
Output 2:

 "ymedaca"


Example Explanation
Explanation 1:

 Reverse the given string.
*/

package Strings;

class ReverseString {

    public static String solve(String A) {

        int n = A.length();

        StringBuilder sb = new StringBuilder(A);

        int i = 0, j = n - 1;

        while (i <= j) {
            char temp = sb.charAt(i);

            sb.setCharAt(i, sb.charAt(j));
            sb.setCharAt(j, temp);

            i++;
            j--;
        }

        return sb.toString();

    }

    public static void main(String[] args) {

        System.out.println(solve("Scaler"));

    }

}
