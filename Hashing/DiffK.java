/*
Diffk II

Given an array A of integers and another non negative integer k, find if there exists 2 indices i and j such that A[i] - A[j] = k, i != j.

Example :
Input :
A : [1 5 3]
k : 2

Output :
1

as 3 - 1 = 2

Return 0 / 1 for this problem.
*/

package Hashing;

import java.util.HashMap;

public class DiffK {

    public static int diffPossible(final int[] A, int B) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();

        for (int i : A) {
            int count = freqMap.getOrDefault(i, 0);
            freqMap.put(i, count + 1);
        }

        for (int i : A) {
            int secondNum = i - B;

            int count = freqMap.getOrDefault(secondNum, 0);

            if (i == secondNum && count > 1)
                return 1;

            if (i != secondNum && count > 0)
                return 1;

        }

        return 0;
    }

    public static void main(String[] args) {

        int[] A = { 0 };

        System.out.println(diffPossible(A, 0));
    }
}
