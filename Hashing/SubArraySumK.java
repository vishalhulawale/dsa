/*
Subarray Sum Equals K

Given an array of integers A and an integer B.
Find the total number of subarrays having sum equals to B.


Input Format
The first argument given is the integer array A.
The second argument given is integer B.


Output Format
Return the total number of subarrays having sum equals to B.


Constraints
1 <= length of the array <= 50000
-1000 <= A[i] <= 1000 


For ExampleW
Input 1:
A = [1, 0, 1]
B = 1

Output 1:
4

Explanation 1:
[1], [1, 0], [0, 1] and [1] are four subarrays having sum 1.


Input 2:
A = [0, 0, 0]
B = 0

Output 2:
6
*/

package Hashing;

import java.util.HashMap;

class SubArraySumK {

    public static int solve(int[] A, int B) {
        HashMap<Long, Integer> freqMap = new HashMap<Long, Integer>();

        int ans = 0;
        long sum = 0;

        for (int i = 0; i < A.length; i++) {

            sum += A[i];

            if (sum == B)
                ans++;

            long lookup = sum - B;

            if (freqMap.containsKey(lookup))
                ans += freqMap.get(lookup);

            int count = freqMap.getOrDefault(sum, 0);
            freqMap.put(sum, count + 1);
        }

        return ans;

    }

    public static void main(String[] args) {
        int[] A = { 19, -10, -13, 10, -13, 6, 7, 2, 18, -19, -4 };

        System.out.println(solve(A, 19));

        int[] B = { 0, 0, 0 };

        System.out.println(solve(B, 0));
    }

}
