import java.util.PriorityQueue;

class Solution {
    public String longestDiverseString(int a, int b, int c) {
        // Create a max-heap (priority queue) sorted by character count
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((x, y) -> y[1] - x[1]);
        
        // Add 'a', 'b', 'c' to the heap with their counts if they are greater than 0
        if (a > 0) maxHeap.add(new int[]{'a', a});
        if (b > 0) maxHeap.add(new int[]{'b', b});
        if (c > 0) maxHeap.add(new int[]{'c', c});
        
        StringBuilder result = new StringBuilder();
        
        while (!maxHeap.isEmpty()) {
            int[] first = maxHeap.poll(); // Get the most frequent character
            
            // Check if adding two of this character would create an invalid sequence
            if (result.length() >= 2 && 
                result.charAt(result.length() - 1) == first[0] &&
                result.charAt(result.length() - 2) == first[0]) {
                
                // If so, use the next most frequent character if available
                if (maxHeap.isEmpty()) break; // No more characters to use
                
                int[] second = maxHeap.poll();
                result.append((char) second[0]);
                second[1]--;
                
                // Put the second character back if it still has remaining counts
                if (second[1] > 0) maxHeap.add(second);
                
                // Add the first character back to the heap as well
                maxHeap.add(first);
            } else {
                // Otherwise, add the most frequent character
                result.append((char) first[0]);
                first[1]--;
                
                // Put the character back if it still has remaining counts
                if (first[1] > 0) maxHeap.add(first);
            }
        }
        
        return result.toString();
    }
}
