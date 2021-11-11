/*
Array with consecutive elements
Problem Description

Given an array of positive integers A, check and return whether the array elements are consecutive or not.
NOTE: Try this with O(1) extra space.



Problem Constraints
1 <= length of the array <= 100000
1 <= A[i] <= 10^9



Input Format
The only argument given is the integer array A.



Output Format
Return 1 if the array elements are consecutive else return 0.



Example Input
Input 1:

 A = [3, 2, 1, 4, 5]
Input 2:

 A = [1, 3, 2, 5]


Example Output
Output 1:

 1
Output 2:

 0


Example Explanation
Explanation 1:

 As you can see all the elements are consecutive, so we return 1.
Explanation 2:

 Element 4 is missing, so we return 0.
*/

import java.util.TreeMap;

class ConsecutiveElements {

	public static int solve(int[] A) {
		int n = A.length;
	
		int min = A[0];	
		for(int i = 0; i < n; i++) {
			if(A[i] < min)
				min = A[i];
		}
				
		TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
		
		for(int i = 0; i < n; i++) {
			A[i] = A[i] - min;
			
			Integer cnt = map.get(A[i]);
							
			map.put(A[i], (cnt == null ? 1 : cnt+1));
		}
		
		int seq = 0;		
		for(Integer num : map.keySet()){		
			if(num != seq || (map.get(num) > 1))
				return 0;
		
			seq++;	
		}

		return 1;	
	}

	public static void main(String[] args){
	
		int[] input1 = {3, 2, 1, 4, 5};
	
		System.out.println(solve(input1));
		
		int[] input2 = {1, 3, 2, 5};
	
		System.out.println(solve(input2));
	}

}
