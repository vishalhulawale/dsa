/*
Pairs With Given Xor

Problem Description
Given an 1D integer array A containing N distinct integers.
Find the number of unique pairs of integers in the array whose XOR is equal to B.


NOTE:
Pair (a, b) and (b, a) is considered to be same and should be counted once.


Problem Constraints
1 <= N <= 10^5
1 <= A[i], B <= 10^7


Input Format
First argument is an 1D integer array A.
Second argument is an integer B.


Output Format
Return a single integer denoting the number of unique pairs of integers in the array A whose XOR is equal to B.


Example Input
Input 1:
A = [5, 4, 10, 15, 7, 6]
B = 5

Input 2:
A = [3, 6, 8, 10, 15, 50]
B = 5


Example Output
Output 1:
1

Output 2:
2


Example Explanation
Explanation 1:
(10 ^ 15) = 5

Explanation 2:
(3 ^ 6) = 5 and (10 ^ 15) = 5 
*/

package Hashing;

import java.util.HashSet;
import java.util.Iterator;

public class XORPair {

    public static int solve(int[] A, int B) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : A)
            set.add(num);

        int count = 0;

        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            int num  = iterator.next();
            int num2 = B ^ num;

            if (set.contains(num2)) {
                count++;
                iterator.remove();
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] A1 = { 5, 4, 10, 15, 7, 6 };
        int B1 = 5;

        System.out.println(solve(A1, B1));

        int[] A2 = { 3, 6, 8, 10, 15, 50};
        int B2 = 5;

        System.out.println(solve(A2, B2));
    }

}
