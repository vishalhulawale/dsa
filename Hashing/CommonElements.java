/*
Common Elements
Problem Description

Given two integer array A and B of size N and M respectively. Your task is to find all the common elements in both the array.

NOTE:

Each element in the result should appear as many times as it shows in both arrays.
The result can be in any order.


Problem Constraints
1 <= N, M <= 105

1 <= A[i] <= 109



Input Format
First argument is an integer array A of size N.

Second argument is an integer array B of size M.



Output Format
Return an integer array denoting the common elements.



Example Input
Input 1:

 A = [1, 2, 2, 1]
 B = [2, 3, 1, 2]
Input 2:

 A = [2, 1, 4, 10]
 B = [3, 6, 2, 10, 10]


Example Output
Output 1:

 [1, 2, 2]
Output 2:

 [2, 10]


Example Explanation
Explanation 1:

 Elements (1, 2, 2) appears in both the array. Note 2 appears twice in both the array.
Explanation 2:

 Elements (2, 10) appears in both the array.
*/

package Hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class CommonElements {

    public static ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> result = new ArrayList<>();

        HashMap<Integer, Integer> freq1 = new HashMap<>();
        HashMap<Integer, Integer> freq2 = new HashMap<>();

        // Fill in first map
        for (Integer num : A) {
            Integer newCount = freq1.getOrDefault(num, 0) + 1;
            freq1.put(num, newCount);
        }
        // Fill in first map
        for (Integer num : B) {
            Integer newCount = freq2.getOrDefault(num, 0) + 1;
            freq2.put(num, newCount);

            Integer firstArrCount = freq1.getOrDefault(num, 0);

            if (newCount <= firstArrCount)
                result.add(num);
        }

        return result;
    }

    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1, 2, 2, 1));
        ArrayList<Integer> B = new ArrayList<>(Arrays.asList(2, 3, 1, 2));

        ArrayList<Integer> res = solve(A, B);

        for (int t : res) {
            System.out.println(t);
        }
    }

}
