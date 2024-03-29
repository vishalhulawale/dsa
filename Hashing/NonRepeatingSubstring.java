/*
Longest Substring Without Repeat

Problem Description
Given a string A, find the length of the longest substring without repeating characters.

Note: Users are expected to solve in O(N) time complexity.


Problem Constraints
1 <= size(A) <= 10^6

String consists of lowerCase,upperCase characters and digits are also present in the string A.


Input Format
Single Argument representing string A.


Output Format
Return an integer denoting the maximum possible length of substring without repeating characters.



Example Input
Input 1:
A = "abcabcbb"

Input 2:
A = "AaaA"


Example Output
Output 1:
3

Output 2:
2


Example Explanation
Explanation 1:
Substring "abc" is the longest substring without repeating characters in string A.

Explanation 2:
Substring "Aa" or "aA" is the longest substring without repeating characters in string A.
*/

package Hashing;

import java.util.HashSet;

class NonRepeatingSubstring {

  public static int lengthOfLongestSubstring(String A) {
    HashSet<Character> chars = new HashSet<>();

    int count = 0;

    int i = 0, j = 0;
    while (j < A.length()) {
      char ch = A.charAt(j);

      while (chars.contains(ch)) {
        chars.remove(A.charAt(i));
        i++;
      }

      chars.add(ch);

      count = Math.max(chars.size(), count);

      j++;
    }

    return count;
  }

  public static void main(String[] args) {
    System.out.println(lengthOfLongestSubstring("abcabcbb"));
    System.out.println(lengthOfLongestSubstring("AaaA"));
    System.out.println(lengthOfLongestSubstring("dadbc"));
  }
}
