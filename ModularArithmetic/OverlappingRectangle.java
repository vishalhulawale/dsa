package ModularArithmetic;

public class OverlappingRectangle {
    public static int solve(int A, int B, int C, int D, int E, int F, int G, int H) {

        if (A >= G || B >= H || C <= E || D <= F)
            return 0;

        else
            return 1;

    }

    public static void main(String[] args) {
        System.out.println(solve(0, 0, 4, 4, 2, 2, 6, 6));
        System.out.println(solve(0, 0, 4, 4, 0, 0, 4, 4));
    }
}
