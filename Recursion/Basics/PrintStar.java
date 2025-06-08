package Recursion.Basics;

public class PrintStar {

    static void triangle1(int r, int c) {
        if (r < 0) return;
        if (c < r) {
            System.out.print("*");
            triangle1(r, c + 1);
        } else {
            System.out.println();
            triangle1(r - 1, 0);
        }
    }

    static void triangle2(int r, int c) {
        if (r < 0) return;
        if (c < r) {
            System.out.print("*");
            triangle2(r, c + 1);
        } else {
            System.out.println();
            triangle2(r - 1, 0);
        }
    }

    public static void main(String[] args) {
        triangle1(5, 0);
    }
}
