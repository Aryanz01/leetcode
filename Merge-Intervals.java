// class Solution {
//     public int[][] merge(int[][] intervals) {
//         List<int[]> result = new ArrayList<>();

//         Arrays.sort(intervals, (a,b) -> a[0]-b[0] );

//         if(intervals== null || intervals.length ==0){
//             return result.toArray(new int[0][]);
//         }
//         int start = intervals[0][0];
//         int end = intervals[0][1];

//         // List<Integer[]> temp = new ListArray<>();
//         for(int[] i : intervals){
//             if(i[0]<=end){
//                 end = Math.max(end, i[1]);
//             }
//             else{
//                 result.add(new int[]{start , end});
//                 start= i[0];
//                 end= i[1];
//             } 
//         }
//         result.add(new int[]{start ,end});
//         return result.toArray(new int[0][]);
//     }
// }

import java.util.*;

class Solution {
    public int[][] merge(int[][] intervals) {
        if (intervals == null || intervals.length == 0) {
            return new int[0][];
        }

        Arrays.sort(intervals, (a, b) -> a[0] - b[0]); // Sort by start times

        List<int[]> temp = new ArrayList<>(); // TEMP list to store merged intervals

        for (int[] interval : intervals) {
            if (temp.isEmpty() || temp.get(temp.size() - 1)[1] < interval[0]) {
                // If temp is empty or no overlap, add the interval
                temp.add(interval);
            } else {
                // Overlap: merge intervals
                temp.get(temp.size() - 1)[1] = Math.max(temp.get(temp.size() - 1)[1], interval[1]);
            }
        }

        return temp.toArray(new int[0][]);
    }
}
