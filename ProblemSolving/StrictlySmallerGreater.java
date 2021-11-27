/*
Smaller and Greater
You are given an Array A of size N.

Find for how many elements, there is a strictly smaller element and a strictly greater element.



Input Format

Given only argument A an Array of Integers.
Output Format

Return an Integer X, i.e number of elements.
Constraints

1 <= N <= 1e5
1 <= A[i] <= 1e6
For Example

Example Input:
    A = [1, 2, 3]

Example Output:
    1

Explanation:
    only 2 have a strictly smaller and strictly greater element, 1 and 3 respectively.
*/
package ProblemSolving;

import java.util.ArrayList;

class StrictlySmallerGreater {

    public static int solve(ArrayList<Integer> A) {

        int size = A.size();

        Integer min = null;
        Integer max = null;

        for (int i = 0; i < size; i++) {

            int num = A.get(i);

            if (min == null || num < min)
                min = num;

            if (max == null || num > max)
                max = num;

        }

        int count = 0;

        for (int i = 0; i < size; i++) {

            if (A.get(i) > min && A.get(i) < max)
                count++;

        }

        return count;
    }

    public static void print(ArrayList<Integer> A) {

        for (Integer num : A)
            System.out.println(num);

    }

    public static void main(String[] args) {

        ArrayList<Integer> input = new ArrayList<Integer>();
        input.add(3);
        input.add(2);
        input.add(1);

        int result = solve(input);

        System.out.println(result);

    }

}
