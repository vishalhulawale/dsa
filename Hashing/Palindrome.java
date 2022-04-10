/*
Check Palindrome - II

Problem Description
Given a string A consisting of lowercase characters.
Check if characters of the given string can be rearranged to form a palindrome.
Return 1 if it is possible to rearrange the characters of the string A such that it becomes a palindrome else return 0.


Problem Constraints
1 <= |A| <= 10^5
A consists only of lower-case characters.


Input Format
First argument is an string A.


Output Format
Return 1 if it is possible to rearrange the characters of the string A such that it becomes a palindrome else return 0.


Example Input
Input 1:
A = "abcde"

Input 2:
A = "abbaee"


Example Output
Output 1:
0

Output 2:
1

Example Explanation
Explanation 1:
No possible rearrangement to make the string palindrome.

Explanation 2:
Given string "abbaee" can be rearranged to "aebbea" to form a palindrome.
*/

package Hashing;

import java.util.Map;
import java.util.HashMap;

public class Palindrome {

    public static int solve(String A) {

        Map<Character, Integer> countMap = new HashMap<>();

        for (int i = 0; i < A.length(); i++) {
            char ch = A.charAt(i);
            int count = countMap.getOrDefault(ch, 0);
            countMap.put(ch, count + 1);
        }

        int oddRepeatCount = 0;

        for (Character ch : countMap.keySet()) {
            int count = countMap.get(ch);
            if (count % 2 == 1)
                oddRepeatCount++;
        }

        if (oddRepeatCount > 1)
            return 0;

        return 1;

    }

    public static void main(String[] args) {
        String A1 = "abcde";
        String A2 = "abbaee";

        System.out.println(solve(A1));
        System.out.println(solve(A2));
    }

}
