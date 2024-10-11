import java.util.*;

class Solution {
    public int smallestChair(int[][] times, int targetFriend) {
        int n = times.length;
        
        // Create a list of events
        int[][] events = new int[n][3];
        for (int i = 0; i < n; i++) {
            events[i][0] = times[i][0];  // Arrival time
            events[i][1] = times[i][1];  // Leaving time
            events[i][2] = i;            // Friend index
        }
        
        // Sort events by arrival time
        Arrays.sort(events, (a, b) -> a[0] - b[0]);
        
        // Min-heap to track available chairs (smallest available chair is on top)
        PriorityQueue<Integer> availableChairs = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            availableChairs.add(i);
        }
        
        // Min-heap to track leaving friends and their chair
        PriorityQueue<int[]> occupiedChairs = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        
        // Process each event (arrival and departure)
        for (int i = 0; i < n; i++) {
            int arrival = events[i][0];
            int leaving = events[i][1];
            int friendIdx = events[i][2];
            
            // Free up chairs for friends who have already left
            while (!occupiedChairs.isEmpty() && occupiedChairs.peek()[0] <= arrival) {
                availableChairs.add(occupiedChairs.poll()[1]);  // Free the chair
            }
            
            // Assign the smallest available chair to the arriving friend
            int assignedChair = availableChairs.poll();
            
            // If this is the target friend, return the assigned chair
            if (friendIdx == targetFriend) {
                return assignedChair;
            }
            
            // Add this friend to the occupied chairs with their leaving time
            occupiedChairs.add(new int[]{leaving, assignedChair});
        }
        
        return -1;  // This should never be reached as targetFriend is guaranteed to attend
    }
}
