/*
Balanced Parantheses!

Problem Description
Given a string A consisting only of '(' and ')'.
You need to find whether parantheses in A is balanced or not ,if it is balanced then return 1 else return 0.


Problem Constraints
1 <= |A| <= 10^5


Input Format
First argument is an string A.


Output Format
Return 1 if parantheses in string are balanced else return 0.


Example Input
Input 1:
A = "(()())"

Input 2:
A = "(()"


Example Output
Output 1:
1

Output 2:
0


Example Explanation
Explanation 1:
Given string is balanced so we return 1

Explanation 2:
Given string is not balanced so we return 0
*/

package Stack;

import java.util.Stack;

class BalancedParantheses {

    public static int solve(String A) {

        char[] chArr = A.toCharArray();

        Stack<Character> stck = new Stack<>();

        for (char ch : chArr) {
            if (ch == '(')
                stck.push(ch);
            else if (stck.empty())
                return 0;
            else
                stck.pop();
        }

        if (stck.empty())
            return 1;
        else
            return 0;
    }

    public static void main(String[] args) {

        System.out.println(solve("(()())"));
        System.out.println(solve("(()"));

    }
}
