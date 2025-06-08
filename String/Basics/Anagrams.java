package String.Basics;

import java.util.*;

public class Anagrams {

    static List<List<String>> anagrams(String[] word) {
        Map<String, List<String>> map = new HashMap<>();
        for (String s : word) {
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String sort = new String(c);
            if (!map.containsKey(sort)) {
                map.put(sort, new ArrayList<>());
            }
            map.get(sort).add(s);
        }
        return new ArrayList<>(map.values());
    }

    static List<List<String>> grams(String[] word) {
        Map<String, List<String>> map = new HashMap<>();
        for (String s : word) {
            int[] count = new int[26]; // 26 lowercase English letters
            for (char cg : s.toCharArray()) {
                count[cg - 'a']++;
            }
            StringBuilder key = new StringBuilder();
            for (int i : count) {
                key.append(i).append('#');
            }
            String sort = key.toString();
            if (!map.containsKey(sort)) {
                map.put(sort, new ArrayList<>());
            }
            map.get(sort).add(s);
        }
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        String[] words = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(grams(words));

    }
}
