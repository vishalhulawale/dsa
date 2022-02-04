/*
Summation Game
Problem Description

Write a program to find sum all Natural numbers from 1 to N where you have to take N as input from user



Problem Constraints
1 <= N <= 1000



Input Format
A single line representing N



Output Format
A single integer showing sum of all Natural numbers from 1 to N



Example Input
Input 1:

5
Input 2:

10


Example Output
Output 1:

15
Output 2:

55
*/

package ProblemSolving;

import java.util.Scanner;

public class SummationGame {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        long num = (long) in.nextInt();
        long result = (num * (num + 1)) / 2;

        System.out.println(result);

        in.close();
    }

}
