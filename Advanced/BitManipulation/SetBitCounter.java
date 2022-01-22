/*
Number of 1 Bits

Problem Description
Write a function that takes an integer and returns the number of 1 bits it has.


Problem Constraints
1 <= A <= 10^9


Input Format
First and only argument contains integer A


Output Format
Return an integer as the answer


Example Input
Input1:
11


Example Output
Output1:
3


Example Explanation
Explaination1:
11 is represented as 1011 in binary.
*/

package Advanced.BitManipulation;

class SetBitCounter {
    public static int numSetBits(int A) {
        int count = 0;

        while (A != 0) {
            if (A % 2 == 1)
                count++;

            A = A / 2;
        }

        return count;
    }

    public static void main(String[] args) {

        System.out.println(numSetBits(11));

    }

}
