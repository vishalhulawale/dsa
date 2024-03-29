/*
Aggressive cows

Problem Description
Farmer John has built a new long barn with N stalls. Given an array of integers A of size N where each element of the array represents the location of the stall and an integer B which represents the number of cows.
His cows don't like this barn layout and become aggressive towards each other once put into a stall. To prevent the cows from hurting each other, John wants to assign the cows to the stalls, such that the minimum distance between any two of them is as large as possible. What is the largest minimum distance?


Problem Constraints
2 <= N <= 100000
0 <= A[i] <= 10^9
2 <= B <= N


Input Format
The first argument given is the integer array A.
The second argument given is the integer B.


Output Format
Return the largest minimum distance possible among the cows.


Example Input
Input 1:
A = [1, 2, 3, 4, 5]
B = 3

Input 2:
A = [1, 2]
B = 2


Example Output
Output 1:
2

Output 2:
1


Example Explanation
Explanation 1:
John can assign the stalls at location 1, 3 and 5 to the 3 cows respectively. So the minimum distance will be 2.

Explanation 2:
The minimum distance will be 1.
*/

package Searching;

public class AggressiveCows {

    public static boolean check(int d, int[] A, int k) {

        int prevPos = A[0];
        int cowsPlaced = 1;

        for (int i = 1; i < A.length; i++) {

            if ((A[i] - prevPos) >= d) {
                prevPos = A[i];
                cowsPlaced++;
            }

            if (cowsPlaced == k) {
                return true;
            }

        }

        return false;

    }

    public static int solve(int[] A, int B) {

        int l = 1;
        int r = A[A.length - 1];

        int ans = 1;

        while (l <= r) {

            int mid = (l + r) / 2;

            if (check(mid, A, B)) {
                l = mid + 1;
                ans = mid;
            } else {
                r = mid - 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] A = { 1, 2, 3, 4, 5 };
        int B = 3;

        System.out.println(solve(A, B));
    }

}
