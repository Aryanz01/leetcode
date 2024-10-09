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



// class Solution {
//     public int minAddToMakeValid(String s) {
//         int open = 0, close = 0;

//         for (int i = 0; i < s.length(); i++) {
//             if (s.charAt(i) == '(') {
//                 open++;
//             } else {
//                 if (open > 0) {
//                     open--;  // Match a '(' with a ')'
//                 } else {
//                     close++;  // Unmatched ')'
//                 }
//             }
//         }

//         // The result is the sum of unmatched '(' and ')'
//         return open + close;
//     }
// }

