/*
Elements Removal
Problem Description

Given an integer array A of size N. In one operation, you can remove any element from the array, and the cost of this operation is the sum of all elements in the array present before this operation.

Find the minimum cost to remove all elements from the array.



Problem Constraints
0 <= N <= 1000
1 <= A[i] <= 103



Input Format
First and only argument is an integer array A.



Output Format
Return an integer denoting the total cost of removing all elements from the array.



Example Input
Input 1:

 A = [2, 1]
Input 2:

 A = [5]


Example Output
Output 1:

 4
Output 2:

 5


Example Explanation
Explanation 1:

 Given array A = [2, 1]
 Remove 2 from the array => [1]. Cost of this operation is (2 + 1) = 3.
 Remove 1 from the array => []. Cost of this operation is (1) = 1.
 So, total cost is = 3 + 1 = 4.
 
Explanation 2:

 There is only one element in the array. So, cost of removing is 5.
*/
package Sorting;

import java.util.ArrayList;
import java.util.Collections;

public class ElementRemoval {

    public static int solve(ArrayList<Integer> A) {
        int ans = 0;

        Collections.sort(A, Collections.reverseOrder());

        for (int i = 0; i < A.size(); i++) {
            ans += A.get(i) * (i + 1);
        }

        return ans;
    }

    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<Integer>();
        A.add(4);
        A.add(1);
        A.add(6);
        A.add(2);

        System.out.println(solve(A));

    }

}
