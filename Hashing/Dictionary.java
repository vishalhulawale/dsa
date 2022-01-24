/*
Is Dictionary?

Problem Description
In an alien language, surprisingly they also use english lowercase letters, but possibly in a different order. The order of the alphabet is some permutation of lowercase letters.
Given an array of words A of size N written in the alien language, and the order of the alphabet denoted by string B of size 26, return 1 if and only if the given words are sorted lexicographicaly in this alien language else return 0.


Problem Constraints
1 <= N, length of each word <= 10^5
Sum of length of all words <= 2 * 10^6


Input Format
First argument is a string array A of size N.
Second argument is a string B of size 26 denoting the order.


Output Format
Return 1 if and only if the given words are sorted lexicographicaly in this alien language else return 0.


Example Input
Input 1:
A = ["hello", "scaler", "interviewbit"]
B = "adhbcfegskjlponmirqtxwuvzy"

Input 2:
A = ["fine", "none", "no"]
B = "qwertyuiopasdfghjklzxcvbnm"


Example Output
Output 1:
1

Output 2:
0


Example Explanation
Explanation 1:
The order shown in string B is: h < s < i for the given words. So return 1.

Explanation 2:
"none" should be present after "no". Return 0.
*/

package Hashing;

import java.util.HashMap;

public class Dictionary {
    public static int solve(String[] A, String B) {

        HashMap<Character, Integer> dict = new HashMap<>();
        for (int i = 0; i < B.length(); i++)
            dict.put(B.charAt(i), i);

        for (int i = 1; i < A.length; i++) {
            String curWord = A[i];
            String prevWord = A[i - 1];

            int minLength = Math.min(curWord.length(), prevWord.length());
            boolean minLenthStringSame = true;

            for (int j = 0; j < minLength; j++) {

                int curWordCharIndex = dict.get(curWord.charAt(j));
                int prevWordCharIndex = dict.get(prevWord.charAt(j));

                if (prevWordCharIndex != curWordCharIndex)
                    minLenthStringSame = false;

                if (curWordCharIndex > prevWordCharIndex)
                    break;
                else if (prevWordCharIndex > curWordCharIndex)
                    return 0;
            }

            if (minLenthStringSame && curWord.length() < prevWord.length())
                return 0;
        }

        return 1;

    }

    public static void main(String[] args) {

        String[] A1 = { "hello", "scaler", "interviewbit" };
        String B1 = "adhbcfegskjlponmirqtxwuvzy";

        System.out.println(solve(A1, B1));

        String[] A2 = { "fine", "none", "no" };
        String B2 = "qwertyuiopasdfghjklzxcvbnm";

        System.out.println(solve(A2, B2));

        String[] A3 = { "roszv", "luopbz", "tsucqzzffskdo", "lzapbvospelnnqxargfxvuqjo", "xxruuqetpxo", "ztrqg",
                "svmmhzttldf", "rveuqnnameexbaebc", "bjnrzodfafpcsxa", "cwxgl" };
        String B3 = "wyaomjixrsqbzelgpnfktvhduc";

        System.out.println(solve(A3, B3));
    }

}
