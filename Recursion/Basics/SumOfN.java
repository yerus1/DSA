package Recursion.Basics;

public class SumOfN {

    static int sumofN(int n) {
        if (n == 0) {
            return 0;
        }
        return sumofN(n / 10) + (n % 10);
    }

    static int prodofN(int n) {
        if (n == 0) {
            return 1;
        }
        return prodofN(n / 10) * (n % 10);
    }

    public static void main(String[] args) {
        int n = 505;
        System.out.println(prodofN(n));
    }
}
