package Recursion.Basics;

public class ReverseNumber {

    static int reverseNumber(int n) {
        int digit = (int) Math.log10(n) + 1;  //to find how many digit
        return reverseHelper(n, digit);
    }

    static int reverseHelper(int n, int digit) {
        if (n < 10) {
            return n;
        }
        int lastDigit = n % 10;
        return lastDigit * (int) Math.pow(10, digit - 1) + reverseHelper(n / 10, digit - 1); //pow = 10 power digit-1
    }

    static boolean pali(int n){
        return n == reverseNumber(n);
    }

    public static void main(String[] args) {
        System.out.println(reverseNumber(4321));
        System.out.println(pali(1234321));
    }
}
