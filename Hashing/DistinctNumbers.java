/*
Distinct Numbers in Window
Problem Description

You are given an array of N integers, A1, A2 ,..., AN and an integer B. Return the of count of distinct numbers in all windows of size B.

Formally, return an array of size N-B+1 where i'th element in this array contains number of distinct elements in sequence Ai, Ai+1 ,..., Ai+B-1.

NOTE: if B > N, return an empty array.



Input Format
First argument is an integer array A
Second argument is an integer B.



Output Format
Return an integer array.



Example Input
Input 1:

 A = [1, 2, 1, 3, 4, 3]
 B = 3
Input 2:

 A = [1, 1, 2, 2]
 B = 1


Example Output
Output 1:

 [2, 3, 3, 2]
Output 2:

 [1, 1, 1, 1]


Example Explanation
Explanation 1:

 A=[1, 2, 1, 3, 4, 3] and B = 3
 All windows of size B are
 [1, 2, 1]
 [2, 1, 3]
 [1, 3, 4]
 [3, 4, 3]
 So, we return an array [2, 3, 3, 2].
Explanation 2:

 Window size is 1, so the output array is [1, 1, 1, 1].
*/

package Hashing;

import java.util.HashMap;

public class DistinctNumbers {

    public static int[] solve(int[] A, int B) {
        int n = A.length;

        int[] res = new int[n - B + 1];

        HashMap<Integer, Integer> countMap = new HashMap<>();

        for (int i = 0; i < B; i++) {
            int count = countMap.getOrDefault(A[i], 0);

            countMap.put(A[i], count + 1);
        }
        res[0] = countMap.size();

        for (int i = 1; i <= n - B; i++) {

            int removedElementCount = countMap.get(A[i - 1]);

            if (removedElementCount - 1 == 0)
                countMap.remove(A[i - 1]);
            else
                countMap.put(A[i - 1], removedElementCount - 1);

            int addedElementCount = countMap.getOrDefault(A[i + B - 1], 0);
            countMap.put(A[i + B - 1], addedElementCount + 1);

            res[i] = countMap.size();
        }

        return res;
    }

    public static void main(String[] args) {
        int[] A = { 1, 2, 1, 3, 4, 3 };
        int B = 3;

        int[] res = solve(A, B);

        for (int i : res) {
            System.out.println(i);
        }
    }

}
