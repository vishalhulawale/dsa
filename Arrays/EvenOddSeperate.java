/*
Separate Odd Even

Problem Description
You are given an integer T denoting the number of test cases. For each test case, you are given an integer array A.
You have to put the odd and even elements of array A in 2 separate arrays and print the new arrays.

NOTE: Array elements should have same relative order as in A.


Problem Constraints
1 <= T <= 10
1 <= |A| <= 10^5
1 <= A[i] <= 10^9


Input Format
First line of the input contains a single integer T.

For each test case:
First line consists of a single integer |A| denoting the length of array.
Second line consists of |A| space separated integers denoting the elements of array A.

Output Format
For each test case:

First line should contain an array of space separated integers containing all the odd elements of array A
Second line should contain an array of space separated integers containing all the even elements of array A


Example Input
Input 1:
2 
5
1 2 3 4 5
3
4 3 2

Input 2:
2 
3
2 2 2
2
1 1


Example Output
Output 1:
1 3 5
2 4
3
4 2

Output 2:
2 2 2
1 1
     

Example Explanation
Explanation 1:
Test Case 1: 
Odd elements in the array(in the order they occur) are: 1, 3, 5.
Even elements in the array(in the order they occur) are: 2, 4.

Test Case 2 
Odd elements in the array(in the order they occur) are: 3.
Even elements in the array(in the order they occur) are: 4, 2.

Explanation 2:
Test Case 1: 
There are no odd elements in the array.
Even elements in the array(in the order they occur) are: 2, 2, 2.

Test Case 2 
Odd elements in the array(in the order they occur) are: 1, 1.
There are no even elements in the array.
*/

package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class EvenOddSeperate {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int testCaseCnt = in.nextInt();

        for (int i = 0; i < testCaseCnt; i++) {
            int size = in.nextInt();

            int[] arr = new int[size];
            for (int j = 0; j < size; j++) {
                arr[j] = in.nextInt();
            }

            ArrayList<Integer> even = new ArrayList<>();
            ArrayList<Integer> odd = new ArrayList<>();

            for (int j = 0; j < arr.length; j++) {
                if (arr[j] % 2 == 0)
                    even.add(arr[j]);
                else
                    odd.add(arr[j]);
            }

            for (int j = 0; j < odd.size(); j++) {
                System.out.print(odd.get(j));

                if (j + 1 < odd.size())
                    System.out.print(" ");
            }

            if (odd.size() != 0)
                System.out.println("");

            for (int j = 0; j < even.size(); j++) {
                System.out.print(even.get(j));

                if (j + 1 < even.size())
                    System.out.print(" ");
            }

            if (even.size() != 0)
                System.out.println("");

        }

        in.close();
    }
}
