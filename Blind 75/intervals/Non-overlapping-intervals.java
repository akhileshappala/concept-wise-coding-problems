class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        
        Arrays.sort(intervals, (arr1, arr2) -> Integer.compare(arr1[0], arr2[0]));
        int intervalRem = 0;
        int prevEnd = intervals[0][1];
        for (int i =1; i< intervals.length;i++){
            int start = intervals[i][0];
            int end = intervals[i][1];
            if(start >= prevEnd){
                end = intervals[i][1];
            }
            else{
                intervalRem+=1;
                prevEnd = Math.min(prevEnd, end);
            }
        }
        return intervalRem;
    
}
}
