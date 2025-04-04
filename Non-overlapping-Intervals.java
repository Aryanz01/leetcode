class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {

      

        sortintervals(intervals);
        int cnt=1;
        int lastendtime = intervals[0][1];
        int n=intervals.length;

        for(int i=0; i<n ; i++){
            if(intervals[i][0]>= lastendtime){
                cnt++;
                lastendtime= intervals[i][1];

            }

        
        }
        return n-cnt;
        
    }

      private void sortintervals(int[][] intervals){
            Arrays.sort(intervals, (a,b)-> Integer.compare(a[1],b[1]));
        }
}