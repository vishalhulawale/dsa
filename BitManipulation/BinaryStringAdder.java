/*
Add Binary Strings
Problem Description

Given two binary strings, return their sum (also a binary string).
Example:

a = "100"

b = "11"
Return a + b = "111".
*/
package BitManipulation;

class BinaryStringAdder {

    public static String solve(String A, String B) {

        int carry = 0;

        String result = "";

        int length = A.length();
        if (B.length() > length)
            length = B.length();

        for (int i = 0; i < length; i++) {

            int bit1 = 0;
            int bit2 = 0;

            if (i <= A.length() - 1)
                bit1 = Character.getNumericValue(A.charAt(A.length() - i - 1));

            if (i <= B.length() - 1)
                bit2 = Character.getNumericValue(B.charAt(B.length() - i - 1));

            int sum = carry + bit1 + bit2;

            result = (sum % 2) + result;

            carry = sum / 2;

        }

        while (carry != 0) {
            result = (carry % 2) + result;
            carry = carry / 2;
        }

        return result;
    }

    public static void main(String[] args) {

        String str1 = "1011";

        String str2 = "100";

        String output = solve(str1, str2);

        System.out.println(output);
    }

}
