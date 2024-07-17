class Solution {
    public int lengthOfLastWord(String s) {
        // Trim the string to remove any trailing spaces
        s = s.trim();
        
        // Find the index of the last space in the trimmed string
        int lastSpaceIndex = s.lastIndexOf(' ');
        
        // The length of the last word is the difference between the length of the string and the last space index
        return s.length() - lastSpaceIndex - 1;
    }
}
