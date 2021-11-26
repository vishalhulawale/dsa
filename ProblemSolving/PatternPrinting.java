// Pattern Printing -1

// Problem Description
// Print a Pattern According to The Given Value of A.
// Example: For A = 3 pattern looks like:
// 1 0 0
// 1 2 0
// 1 2 3

// Problem Constraints
// 1 <= A <= 1000

// Input Format
// First and only argument is an integer denoting A.

// Output Format
// Return a two-dimensional array where each row in the returned array represents a row in the pattern.

// Example Input
// Input 1:

//  A = 3
// Input 2:

//  A = 4

// Example Output
// Output :1

//  [ 
//    [1, 0, 0]
//    [1, 2, 0]
//    [1, 2, 3]
//  ]
// Output 2:

//  [ 
//    [1, 0, 0, 0]
//    [1, 2, 0, 0]
//    [1, 2, 3, 0]
//    [1, 2, 3, 4]
//  ]
package ProblemSolving;

import java.util.ArrayList;

public class PatternPrinting {

    public static ArrayList<ArrayList<Integer>> solve(int A) {

        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();

        for (int i = 1; i <= A; i++) {

            ArrayList<Integer> row = new ArrayList<Integer>();

            for (int j = 1; j <= A; j++) {

                row.add((i >= j) ? j : 0);

            }

            result.add(row);

        }

        return result;
    }

    public static void printResult(ArrayList<ArrayList<Integer>> result) {

        for (ArrayList<Integer> row : result) {

            for (Integer num : row) {

                System.out.print(num + "\t");

            }

            System.out.print("\n");
        }
    }

    public static void main(String args[]) {

        ArrayList<ArrayList<Integer>> result = solve(3);

        printResult(result);
    }

}
