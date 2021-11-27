/*
Leaders in an array
Problem Description

Given an integer array A containing N distinct integers, you have to find all the leaders in the array A.

An element is leader if it is strictly greater than all the elements to its right side.

NOTE:The rightmost element is always a leader.



Problem Constraints
1 <= N <= 10^5

1 <= A[i] <= 10^8



Input Format
First and only argument is an integer array A.



Output Format
Return an integer array denoting all the leader elements of the array.

NOTE: Ordering in the output doesn't matter.



Example Input
Input 1:

 A = [16, 17, 4, 3, 5, 2]
Input 2:

 A = [1, 2]


Example Output
Output 1:

 [17, 2, 5]
Output 2:

 [2]


Example Explanation
Explanation 1:

 Element 17 is strictly greater than all the elements on the right side to it.
 Element 2 is strictly greater than all the elements on the right side to it.
 Element 5 is strictly greater than all the elements on the right side to it.
 So we will return this three elements i.e [17, 2, 5], we can also return [2, 5, 17] or [5, 2, 17] or any other ordering.
Explanation 2:

 Only 2 the rightmost element is the leader in the array.
*/
package Arrays;

import java.util.ArrayList;

class LeaderInArray {

    public static ArrayList<Integer> solve(ArrayList<Integer> A) {

        int size = A.size();

        ArrayList<Integer> result = new ArrayList<Integer>();

        for (int i = 0; i < size - 1; i++) {

            boolean isLeader = true;

            for (int j = i + 1; j < size; j++) {

                if (A.get(j) > A.get(i)) {
                    isLeader = false;
                    break;
                }

            }

            if (isLeader) {
                result.add(A.get(i));
            }

        }

        result.add(A.get(size - 1));

        return result;
    }

    public static void main(String[] args) {

        ArrayList<Integer> input = new ArrayList<Integer>();
        // 16, 17, 4, 3, 5, 2
        input.add(16);
        input.add(17);
        input.add(4);
        input.add(3);
        input.add(5);
        input.add(2);

        ArrayList<Integer> result = solve(input);

        for (int num : result) {

            System.out.println(num);

        }

    }

}
