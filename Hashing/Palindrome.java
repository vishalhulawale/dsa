/*
Check Palindrome!
Problem Description

Given a string A consisting of lowercase characters.

Check if characters of the given string can be rearranged to form a palindrome.

Return 1 if it is possible to rearrange the characters of the string A such that it becomes a palindrome else return 0.



Problem Constraints
1 <= |A| <= 105

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

import java.util.HashMap;
import java.util.Map;

class Palindrome {

    public Map<Character, Integer> generateCountMap(String A) {
        int n = A.length();
        Map<Character, Integer> countMap = new HashMap<Character, Integer>();

        for (int i = 0; i < n; i++) {
            Character key = A.charAt(i);
            Integer count = countMap.getOrDefault(key, 0);

            countMap.put(key, count + 1);
        }

        return countMap;
    }

    public int solve(String A) {
        Map<Character, Integer> countMap = generateCountMap(A);

        int oddFreqCount = 0;

        for (Map.Entry<Character, Integer> entry : countMap.entrySet()) {
            Integer count = entry.getValue();

            if (count % 2 == 1)
                oddFreqCount++;
        }

        if (oddFreqCount <= 1)
            return 1;

        return 0;
    }

    public static void main(String[] args) {
        Palindrome p = new Palindrome();

        System.out.println(p.solve("abcde"));
        System.out.println(p.solve("abbaee"));
    }
}
