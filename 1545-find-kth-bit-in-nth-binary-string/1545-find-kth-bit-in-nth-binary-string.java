class Solution {
    public char findKthBit(int n, int k) {
        // Recursive function to determine the kth bit
        return findKthBitRecursive(n, k);
    }
    
    private char findKthBitRecursive(int n, int k) {
        // Base case: when n = 1, S1 is "0"
        if (n == 1) return '0';
        
        int length = (1 << n) - 1; // Length of Sn is 2^n - 1
        int mid = (length / 2) + 1; // Middle position
        
        if (k == mid) {
            return '1'; // Center bit is always '1'
        } else if (k < mid) {
            return findKthBitRecursive(n - 1, k); // Look in the first half
        } else {
            // Look in the second half, find mirrored position and invert
            int mirroredPosition = length - k + 1;
            char mirroredBit = findKthBitRecursive(n - 1, mirroredPosition);
            return mirroredBit == '0' ? '1' : '0'; // Invert the bit
        }
    }
}
