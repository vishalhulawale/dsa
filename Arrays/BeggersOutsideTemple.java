/*
Beggars Outside Temple
There are N (N > 0) beggars sitting in a row outside a temple. Each beggar initially has an empty pot. When the devotees come to the temple, they donate some amount of coins to these beggars. Each devotee gives a fixed amount of coin(according to his faith and ability) to some K beggars sitting next to each other.

Given the amount donated by each devotee to the beggars ranging from i to j index, where 1 <= i <= j <= N, find out the final amount of money in each beggar's pot at the end of the day, provided they don't fill their pots by any other means.

Example:

Input:
N = 5, D = [[1, 2, 10], [2, 3, 20], [2, 5, 25]]

Return: [10, 55, 45, 25, 25]

Explanation:
=> First devotee donated 10 coins to beggars ranging from 1 to 2. Final amount in each beggars pot after first devotee: [10, 10, 0, 0, 0]

=> Second devotee donated 20 coins to beggars ranging from 2 to 3. Final amount in each beggars pot after second devotee: [10, 30, 20, 0, 0]

=> Third devotee donated 25 coins to beggars ranging from 2 to 5. Final amount in each beggars pot after third devotee: [10, 55, 45, 25, 25]
 */

package Arrays;

public class BeggersOutsideTemple {
    public static int[] solve(int A, int[][] B) {
        int[] res = new int[A];

        for (int i = 0; i < B.length; i++) {

            for (int j = B[i][0] - 1; j < B[i][1]; j++) {

                res[j] += B[i][2];

            }

        }

        return res;
    }

    public static void main(String[] args) {

        int N = 5;
        int[][] D = { { 1, 2, 10 }, { 2, 3, 20 }, { 2, 5, 25 } };

        int[] ar = solve(N, D);

        for (int i : ar) {
            System.out.println(i);
        }
    }

}
