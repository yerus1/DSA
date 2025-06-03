package TwoPointer;

public class FirstOccurrenceString {

    public static int firstOccurrenceString(String haystack, String needle) {
        int left = 0;
        int right = needle.length();
        while (right <= haystack.length()) {
            String subString = haystack.substring(left, right);
            if (subString.equals(needle)) {
                return left;
            }
            left++;
            right++;
        }
        return -1;
    }

    public static void main(String[] args) {
        String haystack = "l";
        String needle = "l";
        System.out.println(firstOccurrenceString(haystack, needle));
    }
}
