/*
Multiplication of previous and next
Given an array of integers A, update every element with multiplication of previous and next elements with following exceptions. a) First element is replaced by multiplication of first and second. b) Last element is replaced by multiplication of last and second last.


Input Format

The only argument given is the integer array A.
Output Format

Return the updated array.
Constraints

1 <= length of the array <= 100000
-10^4 <= A[i] <= 10^4 
For Example

Input 1:
    A = [1, 2, 3, 4, 5]
Output 1:
    [2, 3, 8, 15, 20]

Input 2:
    A = [5, 17, 100, 11]
Output 2:
    [85, 500, 187, 1100]

*/

class PrevNextMultiplication{

	public static int[] solve(int[] A) {
		int size = A.length;
		
		if(size == 1)
		    return A;
		
		int[] result = new int[size];
				
		for(int i = 1; i < size-1; i++){
		
			 result[i] = A[i-1] * A[i+1];
		
		}	
		
		result[0] = A[0] * A[1];
		result[size-1] = A[size-1] * A[size-2];
		
		return result;
	}


	public static void main(String[] args){
	
		int[] arr = {1, 2, 3, 4, 5};
		
		int[] result = solve(arr);
		
		for(int num : result){
		
			System.out.println(num);	
		
		}
			
	}
}

