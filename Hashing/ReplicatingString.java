/*
Replicating Substring

Problem Description
Given a string B, find if it is possible to re-order the characters of the string B so that it can be represented as a concatenation of A similar strings.
Eg: B = aabb and A = 2, then it is possible to re-arrange the string as "abab" which is a concatenation of 2 similar strings "ab".
If it is possible, return 1, else return -1.

Problem Constraints
1 <= Length of string B <= 1000
1 <= A <= 1000
All the alphabets of S are lower case (a - z)

Input Format
First argument is an integer A.
Second argument is a string B.

Output Format
Your function should return 1 if it is possible to re-arrange the characters of the string B so that it can be represented as a concatenation of A similar strings. If it is not, return -1.

Example Input
Input 1:
 A = 2
 B = "bbaabb"

Input 2:
 A = 1
 B = "bc"

Example Output
Output 1:
 1

Output 2:
 1

Example Explanation
Explanation 1:
We can re-order the given string into "abbabb".

Explanation 2:
String "bc" is already arranged.
*/

package Hashing;

import java.util.HashMap;
import java.util.Map;

public class ReplicatingString {
    public static int solve(int A, String B) {
        int n = B.length();
        Map<Character, Integer> countMap = new HashMap<Character, Integer>();

        for (int i = 0; i < n; i++) {
            Character ch = B.charAt(i);
            Integer count = countMap.getOrDefault(ch, 0);
            countMap.put(ch, count + 1);
        }

        for (Character ch : countMap.keySet()) {
            Integer count = countMap.get(ch);
            if (count % A != 0)
                return -1;
        }

        return 1;
    }

    public static void main(String[] args) {
        System.out.println(solve(2, "bbaabb"));
        System.out.println(solve(1, "bc"));
    }
}
