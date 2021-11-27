package Arrays;

class CompareMatrices {

    public static int solve(int[][] A, int[][] B) {

        if (A.length != B.length)
            return 0;

        for (int i = 0; i < A.length; i++) {

            if (A[i].length != B[i].length)
                return 0;

            for (int j = 0; j < A[i].length; j++) {

                if (A[i][j] != B[i][j])
                    return 0;

            }
        }

        return 1;
    }

    public static void main(String[] args) {
        int[][] input1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int[][] input2 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 10 } };

        System.out.println(solve(input1, input2));
    }

}