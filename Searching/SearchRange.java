/*
Search for a Range

Problem Description
Given a sorted array of integers A(0 based index) of size N, find the starting and the ending position of a given integer B in array A.
Your algorithm's runtime complexity must be in the order of O(log n).
Return an array of size 2, such that the first element = starting position of B in A and the second element = ending position of B in A, if B is not found in A return [-1, -1].


Problem Constraints
1 <= N <= 10^6
1 <= A[i], B <= 10^9


Input Format
The first argument given is the integer array A.
The second argument given is the integer B.


Output Format
Return an array of size 2, such that the first element = starting position of B in A and the second element = the ending position of B in A if B is not found in A return [-1, -1].


Example Input
Input 1:
A = [5, 7, 7, 8, 8, 10]
B = 8

Input 2:
A = [5, 17, 100, 111]
B = 3


Example Output
Output 1:
[3, 4]

Output 2:
[-1, -1]


Example Explanation
Explanation 1:
The first occurence of 8 in A is at index 3.
The second occurence of 8 in A is at index 4.
ans = [3, 4]

Explanation 2:
There is no occurence of 3 in the array.
*/

package Searching;

public class SearchRange {

    static int getRangeStart(int[] A, int B) {
        int start = -1;

        int l = 0, r = A.length - 1;

        while (l <= r) {
            int mid = (l + r) / 2;

            if (A[mid] == B) {
                start = mid;
                r = mid - 1;
            } else if (A[mid] > B) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        return start;
    }

    static int getRangeEnd(int[] A, int B, int S) {
        int end = -1;

        if (S == end) {
            return S;
        }

        int l = S, r = A.length - 1;

        while (l <= r) {
            int mid = (l + r) / 2;

            if (A[mid] == B) {
                end = mid;
                l = mid + 1;
            } else if (A[mid] > B) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        return end;
    }

    public static int[] searchRange(final int[] A, int B) {
        int start = getRangeStart(A, B);
        int end = getRangeEnd(A, B, start);

        int[] res = { start, end };

        return res;
    }

    public static void main(String[] args) {

        int[] A1 = { 5, 7, 7, 8, 8, 10 };
        int B1 = 8;

        int[] A2 = { 5, 17, 100, 111 };
        int B2 = 3;

        int[] res1 = searchRange(A1, B1);
        System.out.println(res1[0] + " " + res1[1]);

        int[] res2 = searchRange(A2, B2);
        System.out.println(res2[0] + " " + res2[1]);
    }

}
