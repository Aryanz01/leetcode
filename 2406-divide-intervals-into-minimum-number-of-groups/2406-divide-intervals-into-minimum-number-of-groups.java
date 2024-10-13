import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public int minGroups(int[][] intervals) {
        // Using TreeMap to store the events
        TreeMap<Integer, Integer> events = new TreeMap<>();
        
        // Process each interval
        for (int[] interval : intervals) {
            int start = interval[0];
            int end = interval[1];
            
            // Mark the start of an interval
            events.put(start, events.getOrDefault(start, 0) + 1);
            // Mark the end of an interval (end + 1, because end is inclusive)
            events.put(end + 1, events.getOrDefault(end + 1, 0) - 1);
        }
        
        int maxGroups = 0;
        int currentGroups = 0;
        
        // Traverse the events in order of time
        for (Map.Entry<Integer, Integer> event : events.entrySet()) {
            currentGroups += event.getValue();
            maxGroups = Math.max(maxGroups, currentGroups);
        }
        
        return maxGroups;
    }
}
