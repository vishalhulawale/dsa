/*
Balanced Paranthesis

Problem Description
Given an expression string A, examine whether the pairs and the orders of “{“,”}”, ”(“,”)”, ”[“,”]” are correct in A.
Refer to the examples for more clarity.


Problem Constraints
1 <= |A| <= 100


Input Format
The first and the only argument of input contains the string A having the paranthesis sequence.


Output Format
Return 0, if the paranthesis sequence is not balanced.
Return 1, if the paranthesis sequence is balanced.


Example Input
Input 1:
A = {([])}

Input 2:
A = (){

Input 3:
A = ()[] 


Example Output
Output 1:
1 

Output 2:
0 

Output 3:
1 


Example Explanation
You can clearly see that the first and third case contain valid paranthesis.
In the second case, there is no closing bracket for {, thus the paranthesis sequence is invalid.
*/

package Stack;

import java.util.Stack;

class BalancedMultiParanthesis {

    public static int solve(String A) {

        char[] chArr = A.toCharArray();

        Stack<Character> stck = new Stack<>();

        for (char ch : chArr) {
            if (ch == '(' || ch == '{' || ch == '[')
                stck.push(ch);
            else if (stck.empty())
                return 0;
            else if ((ch == ')' && stck.peek() == '(') || (ch == '}' && stck.peek() == '{')
                    || (ch == ']' && stck.peek() == '['))
                stck.pop();
        }

        if (stck.empty())
            return 1;
        else
            return 0;
    }

    public static void main(String[] args) {
        System.out.println(solve("{([])}"));
        System.out.println(solve("(){"));
        System.out.println(solve("()[]"));
    }

}
