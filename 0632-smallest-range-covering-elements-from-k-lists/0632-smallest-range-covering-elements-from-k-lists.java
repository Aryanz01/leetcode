import java.util.PriorityQueue;

public class Solution {
    public int[] smallestRange(List<List<Integer>> nums) {
        // Min-heap to keep track of the smallest element across K lists
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        int currentMax = Integer.MIN_VALUE;
        int start = 0, end = Integer.MAX_VALUE;

        // Initialize the heap
        for (int i = 0; i < nums.size(); i++) {
            int value = nums.get(i).get(0);
            minHeap.offer(new int[]{value, i, 0});
            currentMax = Math.max(currentMax, value);
        }

        // Process the heap
        while (minHeap.size() == nums.size()) {
            int[] current = minHeap.poll();
            int minValue = current[0];
            int listIndex = current[1];
            int elementIndex = current[2];

            // Update the smallest range
            if (currentMax - minValue < end - start) {
                start = minValue;
                end = currentMax;
            }

            // Move to the next element in the same list
            if (elementIndex + 1 < nums.get(listIndex).size()) {
                int nextValue = nums.get(listIndex).get(elementIndex + 1);
                minHeap.offer(new int[]{nextValue, listIndex, elementIndex + 1});
                currentMax = Math.max(currentMax, nextValue);
            }
        }

        return new int[]{start, end};
    }
}
