package TwoPointer.Leetcode;


public class ReverseString {

    public static String reverseString(String s, int k) {
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i += 2 * k) {
            int start = i;
            int end = Math.min(i + k - 1, arr.length - 1);
            while (start < end) {
                char temp = arr[start];
                arr[start++] = arr[end];
                arr[end--] = temp;
            }
        }
        return new String(arr);
    }

    public static void main(String[] args) {
        String s = "a";
        int k = 2;
        System.out.println(reverseString(s, k));
    }
}