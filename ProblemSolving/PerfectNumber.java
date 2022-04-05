/*
Is It Perfect?

Problem Description
You are given N positive integers.
For each given integer A, you have to tell whether it is a perfect number or not.
Perfect number is a positive integer which is equal to the sum of its proper positive divisors.

Problem Constraints
1 <= N <= 10
1 <= A <= 10^6

Input Format
First line of the input contains a single integer N.
Each of the next N lines contains a single integer A.

Output Format
In a seperate line, print YES if a given integer is perfect, else print NO.

Example Input
Input 1:
2
4
6 

Input 2:
1
3 

Example Output
Output 1:
NO
YES 

Output 2:
NO 

Example Explanation
Explanation 1:
For A = 4, the answer is "NO" as sum of its proper divisors = 1 + 2 = 3, is not equal to 4. 
For A = 6, the answer is "YES" as sum of its proper divisors = 1 + 2 + 3 = 6, is equal to 6. 

Explanation 2:
For A = 3, the answer is "NO" as sum of its proper divisors = 1, is not equal to 3. 
*/

package ProblemSolving;

import java.util.Scanner;

public class PerfectNumber {

    public static boolean isPerfect(int A) {

        int sum = 0;

        for (int i = 1; i < A; i++) {
            if (A % i == 0)
                sum += i;
        }

        return sum == A;

    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int count = in.nextInt();

        while (count > 0) {
            int num = in.nextInt();

            if (isPerfect(num))
                System.out.println("YES");
            else
                System.out.println("NO");

            count--;
        }

        in.close();

    }

}
