/*FizzBuzz
Problem Description

Given a positive integer A, return an array of strings with all the integers from 1 to N. But for multiples of 3 the array should have “Fizz” instead of the number. For the multiples of 5, the array should have “Buzz” instead of the number. For numbers which are multiple of 3 and 5 both, the array should have "FizzBuzz" instead of the number.

Look at the example for more details.



Problem Constraints
1 <= A <= 500000



Input Format
The first argument has the integer A.



Output Format
Return an array of string.



Example Input
Input 1:

 A = 5


Example Output
Output 1:

 [1 2 Fizz 4 Buzz]


Example Explanation
Explanation 1:

 3 is divisible by 3 so it is replaced by "Fizz".
 Similarly, 5 is divisible by 5 so it is replaced by "Buzz".
 */
package Arrays;

public class FizzBuzz {

    public static String[] solve(int A) {

        String[] result = new String[A];

        for (int i = 1; i <= A; i++) {

            StringBuilder str = new StringBuilder();

            if (i % 3 == 0) {
                str.append("Fizz");
            }

            if (i % 5 == 0) {
                str.append("Buzz");
            }

            if (str.length() == 0) {
                result[i - 1] = Integer.toString(i);
            } else {
                result[i - 1] = str.toString();
            }

        }

        return result;
    }

    public static void main(String[] args) {

        int input = 15;

        String[] result = solve(input);

        for (String str : result) {
            System.out.println(str);
        }

    }

}
