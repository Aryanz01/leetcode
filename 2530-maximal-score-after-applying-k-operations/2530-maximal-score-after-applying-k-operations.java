import java.util.PriorityQueue;

class Solution {
    public long maxKelements(int[] nums, int k) {
       
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);
        
  
        for (int num : nums) {
            maxHeap.offer(num);
        }

        long score = 0;
        
       
        for (int i = 0; i < k; i++) {
            
            int largest = maxHeap.poll();
         
            
            score += largest;
           
            int newVal = (largest + 2) / 3;
            
            
            maxHeap.offer(newVal);
        }
        
        return score;
    }
}
