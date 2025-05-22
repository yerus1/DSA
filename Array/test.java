package Array;

import java.util.HashSet;

public class test {
    public static void main(String[] args) {
        int arr[]={1,1,1,3,3,4,3,2,4,2};
        HashSet<Integer> set = new HashSet<>();
        for (int n : arr) {
            if (set.add(n)) {
                System.out.println(false);
            }
        }
    }
}
