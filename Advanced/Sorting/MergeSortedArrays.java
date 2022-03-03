/*
Merge Two Sorted Arrays

Problem Description
Given two sorted integer arrays A and B, merge B and A as one sorted array and return it as an output.


Problem Constraints
-10^10 <= A[i],B[i] <= 10^10


Input Format
First Argument is a 1D array representing A.
Second Argument is also a 1D array representing B.


Output Format
Return a 1D vector which you got after merging A and B.


Example Input
Input 1:
A = [4, 7, 9 ]
B = [2 ,11, 19 ]

Input 2:
A = [1]
B = [2]


Example Output
Output 1:
[2, 4, 7, 9, 11, 19]

Output 2:
[1, 2]


Example Explanation
Explanation 1:
Merging A and B produces the output as described above.

Explanation 2:
Merging A and B produces the output as described above.
*/

package Advanced.Sorting;

public class MergeSortedArrays {

    public static int[] solve(final int[] A, final int[] B) {
        int n = A.length;
        int m = B.length;

        int[] C = new int[n + m];

        int a = 0, b = 0, c = 0;

        while (a < n && b < m) {

            if (A[a] <= B[b]) {
                C[c] = A[a];
                a++;
            } else {
                C[c] = B[b];
                b++;
            }

            c++;
        }

        while (a < n) {
            C[c] = A[a];
            a++;
            c++;
        }

        while (b < m) {
            C[c] = B[b];
            b++;
            c++;
        }

        return C;
    }

    public static void main(String[] args) {
        int[] A = { 4, 7, 9 };
        int[] B = { 2, 11, 19 };

        int[] C = solve(A, B);

        for (int num : C) {
            System.out.println(num);
        }
    }

}
