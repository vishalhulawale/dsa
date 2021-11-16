/*Subarray with least average
Problem Description
Given an array of size N, Find the subarray with least average of size k.


Problem Constraints
1<=k<=N<=1e5
-1e5<=A[i]<=1e5


Input Format
First argument contains an array A of integers of size N.
Second argument contains integer k.


Output Format
Return the index of the first element of the subarray of size k that has least average.
Array indexing starts from 0.


Example Input
Input 1:
A=[3, 7, 90, 20, 10, 50, 40]
B=3

Input 2:
A=[3, 7, 5, 20, -10, 0, 12]
B=2


Example Output
Output 1:
3

Output 2:
4


Example Explanation

Explanation 1:
Subarray between indexes 3 and 5
The subarray {20, 10, 50} has the least average 
among all subarrays of size 3.


Explanation 2:
Subarray between [4, 5] has minimum average
*/

class SubarrayLeastAverage{
    	public static int solve(int[] A, int B) {
    		int sum = 0;
    		int min = 0;
    		int min_index = 0;
    		int N = A.length;
    		
    		for(int i = 0; i < B; i++) {
    			sum = sum + A[i];
    			min = sum;	
    		}
    		    		
    		for(int i = 1; i <= N-B; i++) {
    			sum = sum - A[i-1] + A[i+B-1];
    			
    			if(sum < min){
    				min = sum;
    				min_index = i;
    			} 		
       		}   		
    		    		
    		return min_index;
    	}
    	
	public static void main(String[] args){	
		int[] ar = {77, 216, 249, 433, 20, 362, 221, 242, 105, 160, 71, 450, 397, 442, 29, 251, 82, 85, 71, 42, 122, 420, 228, 142, 215, 367, 202, 249, 50, 427, 260, 113, 460, 69, 184, 187, 135, 261, 292, 443, 395, 142, 388, 233, 125, 398, 333, 291, 417, 121, 478, 371, 64, 276, 455, 216, 304, 160, 411, 170, 422, 65, 368, 398, 287, 418, 123, 299, 475, 107, 91, 61, 316};
		int b = 36;
		
		System.out.println(solve(ar, b));	
	}

}
