/*

Single Number III
Problem Description

Given an array of numbers A , in which exactly two elements appear only once and all the other elements appear exactly twice. Find the two elements that appear only once.

Note: Output array must be sorted.



Problem Constraints
2 <= |A| <= 100000
1 <= A[i] <= 10^9



Input Format
First argument is an array of interger of size N.



Output Format
Return an array of two integers that appear only once.



Example Input
Input 1:

A = [1, 2, 3, 1, 2, 4]
Input 2:

A = [1, 2]


Example Output
Output 1:

[3, 4]
Output 2:

[1, 2]


Example Explanation
Explanation 1:

 3 and 4 appear only once.
Explanation 2:

 1 and 2 appear only once.

*/


class TwoSingleNumbers{
	
	public static boolean checkBit(int A, int i){
        	return (((A>>i)&1) == 1);
    	}
   
       	public static int[] solve(int[] A) {
                
        	int xor = 0;
        
        	for(int i = 0; i< A.length; i++){
            		xor = xor ^ A[i];
        	}
        
        
        	int pos = -1;
        
	        for(int i = 0; i <= 30; i++){
        	    if(checkBit(xor, i) == true){
                	pos = i; 
	                break;
        	    }
	        }
        
        	int set_num = 0;
	        int unset_num = 0;
        
        	for(int i = 0; i< A.length; i++){
	            if(checkBit(A[i], pos) == true){
        	        set_num = set_num ^ A[i];
	            }
        	    else
                	unset_num = unset_num ^ A[i];
	        }
        
        	int[] result = new int[2];
        
	        if(set_num < unset_num){
        	    result[0]=set_num; result[1]=unset_num;
	        }else{
        	    result[1]=set_num; result[0]=unset_num;
	        }

        	return result;
	}

	public static void main(String[] args){

		int[] input = {1, 2, 3, 1, 2, 4};

		int[] result = solve(input);

		System.out.println(result[0]);
		System.out.println(result[1]);

	}

}
