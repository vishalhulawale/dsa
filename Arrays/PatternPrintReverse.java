/*
Pattern Printing -2
Problem Description

Print a Pattern According to The Given Value of A.

Example: For A = 3 pattern looks like:

    1
  2 1
3 2 1


Problem Constraints
1 <= A <= 1000


Input Format
First and only argument is an integer denoting A.



Output Format
Return a two-dimensional array where each row in the returned array represents a row in the pattern.



Example Input
Input 1:

 A = 3
Input 2:

 A = 4


Example Output
Output :1

 [ 
   [0, 0, 1]
   [0, 2, 1]
   [3, 2, 1]
 ]
Output 2:

 [ 
   [0, 0, 0, 1]
   [0, 0, 2, 1]
   [0, 3, 2, 1]
   [4, 3, 2, 1]
 ]


Example Explanation
Explanation 2:

 
 For A = 4 pattern looks like:  
                                   1
                                 2 1
                               3 2 1
                             4 3 2 1
 So we will return it as two-dimensional array. 
 Row 1 contains 3 spaces and 1 integer so spaces will be considered as 0 in the output.
*/

package Arrays;

public class PatternPrintReverse {
    public static int[][] solve(int A) {
        int[][] res = new int[A][A];

        for (int i = 0; i < A; i++) {
            for (int j = 0; j <= i; j++) {
                res[i][A - j - 1] = j + 1;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int A = 3;

        int[][] B = solve(A);

        for (int[] is : B) {
            for (int num : is)
                System.out.print(num + "\t");

            System.out.print("\n");
        }
    }
}
