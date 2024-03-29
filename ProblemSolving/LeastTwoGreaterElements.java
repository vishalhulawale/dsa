/**
 * Elements which have at-least two greater elements
 * 
 * Problem Description:
 * You are given an array of distinct integers A, you have to find and  
 * return all elements in array which have at-least two greater elements than themselves.
 * 
 * NOTE: The result should have the order in which they are present in the original array.
 * 
 * 
 * Problem Constraints:
 * 3 <= |A| <= 10^5
 * -10^9 <= A[i] <= 10^9
 * 
 * 
 * Input Format:
 * First and only argument is an integer array A.
 * 
 * 
 * Output Format:
 * Return an integer array containing the elements of A which have at-least two greater elements than themselves in A.
 * 
 * 
 * Example Input
 * Input 1:
 * A = [1, 2, 3, 4, 5]
 * 
 * Input 2:
 * A = [11, 17, 100, 5]
 * 
 * Example Output
 * Output 1:
 * [1, 2, 3]
 * 
 * Output 2:
 * [11, 5]
 * 
 * 
 * Example Explanation
 * Explanation 1:
 * Number of elements greater than 1: 4
 * Number of elements greater than 2: 3
 * Number of elements greater than 3: 2
 * Number of elements greater than 4: 1
 * Number of elements greater than 5: 0
 * Elements 1, 2 and 3 have atleast 2 elements strictly greater than themselves.
 * 
 * Explanation 2:
 * Number of elements greater than 11: 2
 * Number of elements greater than 17: 1
 * Number of elements greater than 100: 0
 * Number of elements greater than 5: 3
 * Elements 5 and 11 have atleast 2 elements strictly greater than themselves.
 * 
 * Solution: Find two largest elements, omit those from array and return array.
 */
package ProblemSolving;

import java.util.ArrayList;

class LeastTwoGreaterElements {

    public static ArrayList<Integer> solve(ArrayList<Integer> A) {

        Integer largest = null;
        Integer secondLargest = null;

        for (int i = 0; i < A.size(); i++) {
            int num = A.get(i);

            if (largest == null || largest < num) {
                secondLargest = largest;
                largest = num;
            } else if (secondLargest == null || num > secondLargest) {
                secondLargest = num;
            }
        }

        ArrayList<Integer> result = new ArrayList<Integer>();

        for (int i = 0; i < A.size(); i++) {

            int num = A.get(i);

            if (num < secondLargest)
                result.add(num);

        }

        return result;
    }

    public static void print(ArrayList<Integer> list) {

        for (Integer num : list) {

            System.out.println(num);
        }
    }

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5 };

        ArrayList<Integer> input = new ArrayList<Integer>();

        for (int num : arr)
            input.add(num);

        ArrayList<Integer> result = solve(input);
        print(result);
    }

}
