package Recursion;

public class Factorial {
    static int sum=1;
    public static void factorial(int n){
        if(n==0){
            return;
        }
        factorial(n-1);
        sum=sum*n;
        System.out.println(sum);
    }
    public static void main(String[] args) {
        factorial(5);
    }
}
