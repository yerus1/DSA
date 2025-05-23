package String;

public class OccurrenceString {

    private static int occurrenceString(String haystack, String needle) {
        for (int i = 0, j = needle.length(); j < haystack.length(); i++, j++) {
            if (haystack.substring(i, j).equals(needle)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String haystack = "sadbutsad";
        String needle = "sad";
        System.out.println(occurrenceString(haystack, needle));
    }
}
