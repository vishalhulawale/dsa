/*
Print reverse string

Problem Description
Write a recursive function that, given a string S, prints the characters of S in reverse order.


Problem Constraints
1 <= |s| <= 1000


Input Format
First line of input contains a string S.


Output Format
Print the character of the string S in reverse order.


Example Input
Input 1:
scaleracademy

Input 2:
cool


Example Output
Output 1:
ymedacarelacs

Output 2:
looc


Example Explanation
Explanation 1:

Print the reverse of the string in a single line.
*/

package Recursion;

import java.util.Scanner;

class ReverseString {

    public String solve(String str) {
        StringBuilder sb = new StringBuilder(str);
        reverse(sb, 0, sb.length() - 1);
        return sb.toString();
    }

    public void reverse(StringBuilder sb, int s, int e) {
        if (s >= e)
            return;

        swap(sb, s, e);
        reverse(sb, s + 1, e - 1);
    }

    public void swap(StringBuilder sb, int s, int e) {
        char temp = sb.charAt(s);
        sb.setCharAt(s, sb.charAt(e));
        sb.setCharAt(e, temp);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

            String word = in.next();

            ReverseString r1 = new ReverseString();
            System.out.println(r1.solve(word));

            in.close();

    }

}
