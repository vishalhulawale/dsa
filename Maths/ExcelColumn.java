/*
Excel Column Number
Problem Description

Given a column title as appears in an Excel sheet, return its corresponding column number.



Problem Constraints
1 <= length of the column title <= 5



Input Format
Input a string which represents the column title in excel sheet.



Output Format
Return a single integer which represents the corresponding column number.



Example Input
Input 1:

 AB
Input 2:

 ABCD


Example Output
Output 1:

 28
Output 2:

 19010


Example Explanation
Explanation 1:

 A -> 1
 B -> 2
 C -> 3
 ...
 Z -> 26
 AA -> 27
 AB -> 28
 */
package Maths;

class ExcelColumn {
    public static int solve(String A) {
        int ans = 0;
        int N = A.length();
        int exp = 1;

        for (int i = N - 1; i >= 0; i--) {
            int charVal = ((int) A.charAt(i)) - 64;
            ans += charVal * exp;

            exp *= 26;
        }

        return ans;
    }

    public static void main(String[] args) {
        System.out.println(solve("AB"));
    }

}
