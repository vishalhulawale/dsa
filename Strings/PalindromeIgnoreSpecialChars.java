/*
Palindrome String

Given a string, determine if it is a palindrome. While checking for a palindrome, you have to ignore spaces, case and all special characters; i.e. consider only alphanumeric characters. Check the sample testcase for reference.

Example:
"A man, a plan, a canal: Panama" is a palindrome.
"race a car" is not a palindrome.

Return 0 / 1 ( 0 for false, 1 for true ) for this problem
*/

package Strings;

public class PalindromeIgnoreSpecialChars {

    private static boolean isValidCharacter(char c) {

        if (c >= 'A' && c <= 'Z')
            return true;

        if (c >= 'a' && c <= 'z')
            return true;

        if (c >= '0' && c <= '9')
            return true;

        return false;
    }

    private static boolean compareChar(char c1, char c2) {

        char toggledC1 = (char) (c1 ^ 32);
        char toggledC2 = (char) (c2 ^ 32);

        if (c1 == c2 || c1 == toggledC2 || toggledC1 == c2)
            return true;

        return false;
    }

    private static int solve(String A) {
        int n = A.length();
        int i = 0, j = n - 1;

        while (i <= j) {
            char c1 = A.charAt(i);
            char c2 = A.charAt(j);

            boolean isC1Valid = isValidCharacter(c1);
            boolean isC2Valid = isValidCharacter(c2);

            if (isC1Valid && isC2Valid) {
                if (!compareChar(c1, c2))
                    return 0;
                else {
                    i++;
                    j--;
                }
            }

            if (!isC1Valid)
                i++;

            if (!isC2Valid)
                j--;

        }

        return 1;
    }

    public static void main(String[] args) {
        System.out.println(solve("race a car"));
        System.out.println(solve("A man, a plan, a canal: Panama"));
    }

}
