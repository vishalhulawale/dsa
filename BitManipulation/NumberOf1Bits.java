/*
Number of 1 Bits
Problem Description

Write a function that takes an integer and returns the number of 1 bits it has.


Problem Constraints
1 <= A <= 109


Input Format
First and only argument contains integer A


Output Format
Return an integer as the answer


Example Input
Input1:
11


Example Output
Output1:
3


Example Explanation
Explaination1:
11 is represented as 1011 in binary.
*/

class NumberOf1Bits {


	public static int solve(int A){
	
		int quotient = 0;

		int count = 0;

		do {
			
			quotient = A / 2;

			System.out.println("Quotient: "+ quotient);
			System.out.println("Mod 2: "+ A%2);

			if(A%2 == 1) {		
				count++;
			}


			A = quotient;

		} while(quotient != 0);

		return count;

	}


	public static void main(String[] args){
	
		int input = 11;

		int output = solve(input);

		System.out.println(output);
	
	}

}
