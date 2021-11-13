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

import java.util.ArrayList;
import java.util.Scanner;

class RotationGame {

	public static int[] rotate(int[] A, int B){
		int size = A.length;
		
		int cnt = B % size;
		cnt = size - cnt;
		
		int[] result = new int[size];
		
		int k = 0;
		
		for(int i = cnt; i < size; i++){
			result[k++] = A[i];
		}
		
		for(int i = 0; i < cnt; i++){
			result[k++] = A[i];
		}
				
		return result;
	}

	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		
		int size = in.nextInt();
		
		int[] input = new int[size];
		
		for(int i = 0; i < size; i++){
			input[i] = in.nextInt();		
		}
		
		int cnt = in.nextInt();
		
		in.close();
		
		int[] result = rotate(input, cnt);
		
 		for(int i : result)
 			System.out.print(i+" ");
		
	}

}
