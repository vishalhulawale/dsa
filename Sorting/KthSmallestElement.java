/*
Kth Smallest Element

Problem Description
Find the Bth smallest element in given array A.
NOTE: Users should try to solve it in <= B swaps.


Problem Constraints
1 <= |A| <= 100000
1 <= B <= min(|A|, 500)
1 <= A[i] <= 10^9


Input Format
First argument is vector A.
Second argument is integer B.


Output Format
Return the Bth smallest element in given array.


Example Input
Input 1:
A = [2, 1, 4, 3, 2]
B = 3

Input 2:
A = [1, 2]
B = 2


Example Output
Output 1:
2

Output 2:
2


Example Explanation
Explanation 1:
3rd element after sorting is 2.

Explanation 2:
2nd element after sorting is 2.
*/
package Sorting;

class KthSmallestElement {

    public static int kthsmallest(int[] A, int B) {

        int n = A.length;

        for (int i = 0; i < B; i++) {
            int min = i;

            for (int j = i; j < n; j++) {
                if (A[j] < A[min]) {
                    min = j;
                }
            }

            if (i != min) {
                int temp = A[i];
                A[i] = A[min];
                A[min] = temp;
            }
        }

        return A[B - 1];

    }

    public static void main(String[] args) {
        int[] A = { 2, 1, 4, 3, 2 };
        int B = 3;

        System.out.println(kthsmallest(A, B));
    }

}
