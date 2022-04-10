/*
Largest Continuous Sequence Zero Sum

Problem Description
Given an array A of N integers.
Find the largest continuous sequence in a array which sums to zero.


Problem Constraints
1 <= N <= 10^6
-10^7 <= A[i] <= 10^7


Input Format
Single argument which is an integer array A.


Output Format
Return an array denoting the longest continuous sequence with total sum of zero.
NOTE : If there are multiple correct answers, return the sequence which occurs first in the array.


Example Input
A = [1,2,-2,4,-4]

Example Output
[2,-2,4,-4]

Example Explanation
[2,-2,4,-4] is the longest sequence with total sum of zero.
*/
package Hashing;

import java.util.HashMap;

public class LargestSequence {

    public static int[] lszero(int[] A) {

        HashMap<Integer, Integer> pfSumMap = new HashMap<>();

        int sum = 0, start = 0, end = 0;
        pfSumMap.put(0, -1);

        for (int i = 0; i < A.length; i++) {
            sum += A[i];

            Integer currentStart = pfSumMap.get(sum);
            if (currentStart == null) {
                pfSumMap.put(sum, i);
            } else {
                int dist = i - currentStart;

                if (dist > (end - start)) {
                    start = currentStart;
                    end = i;
                }
            }
        }

        int[] res = new int[end - start];
        for (int i = 1; i <= (end - start); i++) {
            res[i - 1] = A[start + i];
        }

        return res;
    }

    public static void main(String[] args) {
        int[] A = { 1, 2, -2, 4, -4 };

        int[] res = lszero(A);
        for (int num : res)
            System.out.println(num);
    }

}
