/*
Little Ponny and 2-Subsequence

Problem Description
Little Ponny has been given a string A, and he wants to find out the lexicographically minimum subsequence from it of size >= 2. Can you help him?
A string a is lexicographically smaller than string b, if the first different letter in a and b is smaller in a. For example, "abc" is lexicographically smaller than "acc" because the first different letter is 'b' and 'c' which is smaller in "abc".


Problem Constraints
1 <= |A| <= 10^5
A only contains lowercase alphabets.


Input Format
The first and the only argument of input contains the string, A.


Output Format
Return a string representing the answer.


Example Input
Input 1:
A = "abcdsfhjagj" 

Input 2:
A = "ksdjgha" 


Example Output
Output 1:
"aa" 

Output 2:
"da" 


Example Explanation
Explanation 1:
"aa" is the lexicographically minimum subsequence from A. 

Explanation 2:
"da" is the lexicographically minimum subsequence from A. 
*/

package SubSequences;

public class LittlePonyStringSubsequence {

    public static String solve(String A) {
        char smallest = A.charAt(0);
        int smallestChIndex = 0;

        for (int i = 0; i < A.length() - 1; i++) {
            char ch = A.charAt(i);

            if (ch < smallest) {
                smallest = ch;
                smallestChIndex = i;
            }
        }

        char secondSmallest = A.charAt(smallestChIndex + 1);
        for (int i = smallestChIndex + 1; i < A.length(); i++) {
            char ch = A.charAt(i);

            if (ch < secondSmallest)
                secondSmallest = ch;
        }

        return Character.toString(smallest) + Character.toString(secondSmallest);
    }

    public static void main(String[] args) {
        String A1 = "abcdsfhjagj";
        String A2 = "ksdjgha";

        System.out.println(solve(A1));
        System.out.println(solve(A2));
    }

}
