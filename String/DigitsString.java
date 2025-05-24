package String;

public class DigitsString {

    public static int digitsString(String s, int k) {
        StringBuilder str = new StringBuilder();
        for (Character c : s.toCharArray()) {
            str.append(c - 'a' + 1);
        }
        String transform = str.toString();
        return sumDigit(transform, k);
    }

    public static int sumDigit(String str, int k) {
        int sum = 0;
        for (Character c : str.toCharArray()) {
            sum = sum + c - '0';
        }
        k--;
        str = String.valueOf(sum);
        return k == 0 ? sum : sumDigit(str, k);
    }

    public static void main(String[] args) {
        String s = "hvmhoasabaymnmsd";
        int k = 1;
        System.out.println(digitsString(s, k));
    }
}
