class Solution {
    public long minimumSteps(String s) {
        long blackCount = 0;
        long swaps = 0;
        
        for (char c : s.toCharArray()) {
            if (c == '1') {
                blackCount++;
            } else if (c == '0') {
                swaps += blackCount;
            }
        }
        
        return swaps;
    }
}
