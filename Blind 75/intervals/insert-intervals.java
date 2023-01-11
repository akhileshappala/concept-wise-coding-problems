
link : https://leetcode.com/problems/insert-interval/description/



class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> res = new ArrayList<>();
        for (int[] interval : intervals) {
         //  if new interval is null, just add the intervals running the loop
          //or  new interval 1st is greater than current interval 2nd -- which means it must be right to the current interval
          //so we will compare with other
            if (newInterval == null || interval[1] < newInterval[0]){
              res.add(interval);
            }
         // if its before case where new interval 2nd element is less than the current interval 1st, so it must be before the current interval
          // then we add new interval, and the following interval and make newinterval null for stopping the further check and it goes to 1st loop
              else if (interval[0] > newInterval[1]) {
                res.add(newInterval);
                res.add(interval);
                newInterval = null;
            } else {
                // if we have overlap, then we take min of both for 1st element and max of both for 2nd element.
                // this forms the new interval and again it compares with all the above checks
                newInterval[0] = Math.min(interval[0], newInterval[0]);
                newInterval[1] = Math.max(interval[1], newInterval[1]);
            }
        }
        if (newInterval != null) res.add(newInterval);
        return res.toArray(new int[res.size()][]);
    }
}
