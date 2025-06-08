import java.util.*;

public class test1 {
    public static void main(String[] args) {
        String[] word={"eat", "tea", "tan", "ate", "nat", "bat"};
        Map<String, List<String>> map=new HashMap<>();
        Set<Character> set=new HashSet<>();
        for(String s:word){
            char[] chart=s.toCharArray();
            Arrays.sort(chart);
            String sorted=new String(chart);
            if(!map.containsKey(sorted)){
                map.put(sorted,new ArrayList<>());
            }
            map.get(sorted).add(s);
        }
        System.out.println(map);

    }
}
