package Recursion.Basics;

public class FindZero {


    static int findZero(int n) {
        return count(n, 0);
    }

    static int count(int n, int c) {
        if (n == 0) return c;

        int rem = n % 10;
        if (rem == 0) {
            return count(n / 10, c + 1);
        }
        return count(n / 10, c);
    }

    public static void main(String[] args) {
        System.out.println(findZero(30210002));
    }

}
