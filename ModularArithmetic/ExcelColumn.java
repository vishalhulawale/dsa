package ModularArithmetic;

public class ExcelColumn {

    private static int solve(String A) {

        int n = A.length(), exp = 1, ans = 0;

        for (int i = n - 1; i >= 0; i--) {
            int charValue = Character.getNumericValue(A.charAt(i)) - 9;

            ans = ans + (charValue * exp);

            exp *= 26;

        }

        return ans;
    }

    public static void main(String[] args) {

        System.out.println(solve("ABCD"));

    }

}
