/*
MINIMUM PICKS

Problem Description:
You are given an array of integers A of size N.
Return the difference between the maximum among all even numbers of A and the minimum among all odd numbers in A.



Problem Constraints
2 <= N <= 1e5
-1e9 <= A[i] <= 1e9
There is atleast 1 odd and 1 even number in A



Input Format
The first argument given is the integer array, A.



Output Format
Return maximum among all even numbers of A - minimum among all odd numbers in A.



Example Input
Input 1:
 A = [0, 2, 9]

Input 2:
 A = [5, 17, 100, 1]


Example Output
Output 1:
-7

Output 2:
99


Example Explanation

Explanation 1:
Maximum of all even numbers = 2
Minimum of all odd numbers = 9
ans = 2 - 9 = -7

Explanation 2:
Maximum of all even numbers = 100
Minimum of all odd numbers = 1
ans = 100 - 1 = 99
*/
package ProblemSolving;

import java.util.ArrayList;

class MinimumPicks {
    public static int solve(ArrayList<Integer> A) {

        Integer maxEven = null;
        Integer minOdd = null;

        for (int num : A) {
            if (num % 2 == 0) {
                if (maxEven == null || num > maxEven)
                    maxEven = num;
            } else {
                if (minOdd == null || num < minOdd)
                    minOdd = num;
            }
        }

        return maxEven - minOdd;
    }

    public static void main(String[] args) {

        ArrayList<Integer> input = new ArrayList<Integer>();
        input.add(0);
        input.add(2);
        input.add(9);

        int result = solve(input);

        System.out.println(result);
    }

}
