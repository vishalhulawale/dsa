/*
Largest Number
Problem Description

Given a array A of non negative integers, arrange them such that they form the largest number.

Note: The result may be very large, so you need to return a string instead of an integer.



Problem Constraints
1 <= len(A) <= 100000
0 <= A[i] <= 2*109



Input Format
First argument is an array of integers.



Output Format
Return a string representing the largest number.



Example Input
Input 1:

 A = [3, 30, 34, 5, 9]
Input 2:

 A = [2, 3, 9, 0]


Example Output
Output 1:

 "9534330"
Output 2:

 "9320"


Example Explanation
Explanation 1:

 A = [3, 30, 34, 5, 9]
 Reorder the numbers to [9, 5, 34, 3, 30] to form the largest number.
Explanation 2:

 Reorder the numbers to [9, 3, 2, 0] to form the largest number 9320. 
*/

package Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

class NumberComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer arg0, Integer arg1) {
        int permutation1 = Integer.parseInt((arg0 + "" + arg1));
        int permutation2 = Integer.parseInt((arg1 + "" + arg0));

        if (permutation1 < permutation2)
            return 1;
        else
            return -1;
    }
}

public class LargestNumber {

    private static String solve(ArrayList<Integer> A) {
        StringBuilder ans = new StringBuilder();

        Collections.sort(A, new NumberComparator());

        for (int i = 0; i < A.size(); i++)
            ans.append(A.get(i));

        return ans.toString();
    }

    public static void main(String[] args) {

        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(3, 30, 34, 5, 9));

        System.out.println(solve(A));
    }

}
