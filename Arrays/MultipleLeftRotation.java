/*
Multiple left rotations of the array
Problem Description

Given an array of integers A and multiple values in B which represents number of times array A needs to be left rotated.

Find the rotated array for each value and return the result in the from of a matrix where i'th row represents the rotated array for the i'th value in B.



Problem Constraints
1 <= length of both arrays <= 2000 -10^9 <= A[i] <= 10^9 0 <= B[i] <= 2000


Input Format
The first argument given is the integer array A.
The second argument given is the integer array B.


Output Format
Return the resultant matrix.


Example Input
Input 1:
 
    A = [1, 2, 3, 4, 5]
    B = [2, 3]

Input 2:

  
    A = [5, 17, 100, 11]
    B = [1]




Example Output
Output 1:
 
    [ [3, 4, 5, 1, 2]
     [4, 5, 1, 2, 3] ]


Output 2:

    
    [ [17, 100, 11, 5] ]



Example Explanation
for input 1 -> B[0] = 2 which requires 2 times left rotations

1: [2, 3, 4, 5, 1]

2: [3, 4, 5, 1, 2]

B[1] = 3 which requires 3 times left rotation

1: [2, 3, 4, 5, 1]

2: [3, 4, 5, 1, 2]

2: [4, 5, 1, 2, 4]
*/

import java.util.ArrayList;
import java.util.Arrays;

class MultipleLeftRotation {
	
	public static ArrayList<ArrayList<Integer>> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
		int arrLength = A.size();
		int rotateCnt = B.size();

		ArrayList<ArrayList<Integer>> resultSet = new ArrayList<ArrayList<Integer>>();

		for(int i = 0; i < rotateCnt; i++) {

			int cnt = B.get(i) % arrLength;

			ArrayList<Integer> result = new ArrayList<Integer>();

			for(int j = cnt; j < arrLength; j++) {
				result.add(A.get(j));	
			}

			for(int j = 0; j < cnt; j++) {
				result.add(A.get(j));
			}

			resultSet.add(result);

		}

		return resultSet;
	}

	public static void main(String[] args) {
	
		ArrayList<Integer> arr= new ArrayList(Arrays.asList(6, 31, 33, 13, 82, 66, 9, 12, 69, 21, 17, 2, 50, 69, 90, 71, 31, 1, 13, 70, 94, 46, 89, 13, 55, 54, 67, 97, 28, 27, 62, 34, 41, 18, 15, 35, 13, 84, 93, 27, 89, 23, 6, 56, 94, 40, 54, 95, 47));
		ArrayList<Integer> cnts= new ArrayList(Arrays.asList(88, 85, 98, 36, 66, 40, 30, 26, 51, 77, 62, 60, 92, 64, 53, 86, 24, 53, 85, 49, 57, 29, 32, 60, 75, 82, 17, 23, 67, 51, 23, 11, 70, 59 ));

		ArrayList<ArrayList<Integer>> result = solve(arr, cnts);

		for(ArrayList<Integer> rset : result){
		
			for(Integer i : rset){
				System.out.print(i);
			}
			
			System.out.print("\n");
		
		}

	}	

}