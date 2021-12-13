/*
Pattern Printing -1
Problem Description

Print a Pattern According to The Given Value of A.

Example: For A = 3 pattern looks like:

1 0 0

1 2 0

1 2 3



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
   [1, 0, 0]
   [1, 2, 0]
   [1, 2, 3]
 ]
Output 2:

 [ 
   [1, 0, 0, 0]
   [1, 2, 0, 0]
   [1, 2, 3, 0]
   [1, 2, 3, 4]
 ]


Example Explanation
Explanation 2:

 
 For A = 4 pattern looks like:  
                             1 0 0 0
                             1 2 0 0
                             1 2 3 0
                             1 2 3 4
 So we will return it as two-dimensional array.
*/

package Arrays.PrefixSum;

public class PatternPrint {
    public static int[][] solve(int A) {
        int[][] res = new int[A][A];

        for (int i = 0; i < A; i++) {
            for (int j = 0; j <= i; j++) {
                res[i][j] = j + 1;
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
