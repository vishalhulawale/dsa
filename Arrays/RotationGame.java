/*
Rotation Game
Problem Description

You are given an integer array A and an integer B. You have to print the same array after rotating it B times towards right.

NOTE: You can use extra memory.



Problem Constraints
1 <= |A| <= 10^6

1 <= A[i] <= 10^9

1 <= B <= 10^9



Input Format
First line begins with an integer |A| denoting the length of array, and then |A| integers denote the array elements.
Second line contains a single integer B



Output Format
Print an array of integers which is the Bth right rotation of input array A, on a separate line.



Example Input
Input 1:

 4 1 2 3 4
 2
Input 2:

 3 1 2 2
 3


Example Output
Output 1:

 3 4 1 2
Output 2:

 1 2 2


Example Explanation
Explanation 1:

 [1,2,3,4] => [4,1,2,3] => [3,4,1,2]

Explanation 2:


 [1,2,2] => [2,1,2] => [2,2,1] => [1,2,2]
*/
package Arrays;

import java.util.Scanner;

class RotationGame {

    public static void reverse(int[] A, int si, int ei) {

        int i = si, j = ei;

        while (i <= j) {

            int temp = A[i];
            A[i] = A[j];
            A[j] = temp;

            i++;
            j--;

        }

    }

    public static int[] rotate(int[] A, int B) {
        int size = A.length;
        int cnt = B % size;

        // If cnt is 0 then skip rotatation
        if (cnt == 0) {
            return A;
        }

        // Reverse entire array, reverse first cnt elemnts and then reverse remaining (size-cnt) elements
        reverse(A, 0, size - 1);
        reverse(A, 0, cnt - 1);
        reverse(A, cnt, size - 1);

        return A;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int size = in.nextInt();

        int[] input = new int[size];

        for (int i = 0; i < size; i++) {
            input[i] = in.nextInt();
        }

        int cnt = in.nextInt();

        in.close();

        int[] result = rotate(input, cnt);

        for (int i : result)
            System.out.print(i + " ");

    }

}
