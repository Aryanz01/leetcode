class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        generate(ans, n, 0, 0, "");
        return ans;
    }

    private void generate(List<String> ans, int n, int open, int close, String curr) {
        // Base case: if the current string has reached the maximum length
        if (curr.length() == n * 2) {
            ans.add(curr);
            return;
        }

        // If we can add an opening parenthesis
        if (open < n) {
            generate(ans, n, open + 1, close, curr + "(");
        }

        // If we can add a closing parenthesis
        if (close < open) {
            generate(ans, n, open, close + 1, curr + ")");
        }
    }
}
