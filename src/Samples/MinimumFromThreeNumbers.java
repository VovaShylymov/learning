package Samples;

public class MinimumFromThreeNumbers {
    public static int min(int a, int b, int c) {
        int x = min(a, b);
        return x < c ? x : c;
    }

    public static int min(int a, int b) {
        return a < b ? a : b;
    }

    public static void main(String[] args) {
        System.out.println(min(1, 2, 3));
        System.out.println(min(-1, -2, -3));
        System.out.println(min(3, 5, 3));
        System.out.println(min(5, 5, 10));
    }
}
