import java.util.Stack;

class Solution {
    public int minAddToMakeValid(String s) {
        int x = 0;  // To count unmatched ')'
        Stack<Character> st = new Stack<Character>();

        // Iterate through the string
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                st.push(s.charAt(i));  // Push unmatched '('
            } else if (s.charAt(i) == ')') {
                if (!st.isEmpty()) {
                    st.pop();  // Match ')' with '('
                } else {
                    x++;  // Unmatched ')'
                }
            }
        }
        
        // st.size() will have unmatched '(' and x will have unmatched ')'
        return st.size() + x;
    }
}
