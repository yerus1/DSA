package String;

import java.util.ArrayDeque;
import java.util.Deque;

public class ValidParentheses {

    public static boolean validParentheses(String str) {
        Deque<Character> stack = new ArrayDeque<>();
        for (char c : str.toCharArray()) {
            if (c == '(') {
                stack.push(')');
            } else if (c == '[') {
                stack.push(']');
            } else if (c == '{') {
                stack.push('}');
            } else if (stack.isEmpty() || stack.pop() != c) {
                return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s = "()[]{]";
        System.out.println(validParentheses(s));
    }
}
