package Arrays;

public class SubarraySum {

    public static int solve(int[] A) {
        int sum = 0;
        int N = A.length;

        for (int i = 0; i < A.length; i++) {
            int left = i + 1, right = N - i;

            sum += A[i] * left * right;
        }

        return sum;
    }

    public static void main(String[] args) {

    }

}
