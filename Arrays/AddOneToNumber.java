/*
Add One To Number

Problem Description
Given a non-negative number represented as an array of digits, add 1 to the number ( increment the number represented by the digits ).
The digits are stored such that the most significant digit is at the head of the list.

NOTE: Certain things are intentionally left unclear in this question which you should practice asking the interviewer. For example: for this problem, the following are some good questions to ask :
Q: Can the input have 0's before the most significant digit. Or, in other words, is 0 1 2 3 a valid input?
A: For the purpose of this question, YES
Q: Can the output have 0's before the most significant digit? Or, in other words, is 0 1 2 4 a valid output?
A: For the purpose of this question, NO. Even if the input has zeroes before the most significant digit.


Problem Constraints
1 <= size of the array <= 1000000


Input Format
First argument is an array of digits.


Output Format
Return the array of digits after adding one.


Example Input
Input 1:
[1, 2, 3]


Example Output
Output 1:
[1, 2, 4]


Example Explanation
Explanation 1:
Given vector is [1, 2, 3].
The returned vector should be [1, 2, 4] as 123 + 1 = 124.
*/

package Arrays;

import java.util.ArrayList;

public class AddOneToNumber {

    public static void swap(ArrayList<Integer> A, int src, int dstn) {
        int temp = A.get(src);
        A.set(src, A.get(dstn));
        A.set(dstn, temp);
    }

    public static void reverseArray(ArrayList<Integer> A) {
        int n = A.size();
        int l = 0, r = n - 1;

        while (l <= r) {
            swap(A, l, r);
            l++;
            r--;
        }
    }

    public static ArrayList<Integer> plusOne(ArrayList<Integer> A) {
        int n = A.size();

        reverseArray(A);

        int carry = 1;

        for (int i = 0; i < n; i++) {
            int num = A.get(i);
            num += carry;

            if (num >= 10) {
                num = num - 10;
                carry = 1;
            } else {
                carry = 0;
            }

            A.set(i, num);
        }

        if (carry != 0)
            A.add(carry);

        n = A.size();
        int end = n - 1;
        while (A.get(end) == 0) {
            A.remove(end);
            end--;
        }

        reverseArray(A);

        return A;
    }

    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>();
        A.add(9);
        A.add(9);
        A.add(9);

        ArrayList<Integer> res = plusOne(A);
        for (int num : res) {
            System.out.println(num);
        }
    }

}
