class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> result = new ArrayList<>();

        Arrays.sort(intervals, (a,b) -> a[0]-b[0] );

        if(intervals== null || intervals.length ==0){
            return result.toArray(new int[0][]);
        }
        int start = intervals[0][0];
        int end = intervals[0][1];

        // List<Integer[]> temp = new ListArray<>();
        for(int[] i : intervals){
            if(i[0]<=end){
                end = Math.max(end, i[1]);
            }
            else{
                result.add(new int[]{start , end});
                start= i[0];
                end= i[1];
            } 
        }
        result.add(new int[]{start ,end});
        return result.toArray(new int[0][]);
    }
}