import java.util.*;

class Solution {
    public boolean isValid(String s) {
        if(s.length() % 2 != 0)
            return false;

        Deque<Character> stack = new ArrayDeque<>();
        Map<Character, Character> bracketMap = new HashMap<>();
        bracketMap.put(')', '(');
        bracketMap.put(']', '[');
        bracketMap.put('}', '{');

        for(char c : s.toCharArray()){
            if(bracketMap.containsKey(c)){
                if(stack.isEmpty() || stack.pop() != bracketMap.get(c)){
                    return false;
                }
            }else{
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}
