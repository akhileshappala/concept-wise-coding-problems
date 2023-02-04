


class Solution {
    public boolean canAttendMeetings(int[][] intervals) {
        Arrays.sort(intervals, (arr1, arr2)->Integer.compare(arr1[0], arr2[0]));
        int prevEnd= 0;
        if(intervals.length == 0){
            return true;
        }
        else{
            prevEnd = intervals[0][1];
        }
        
        for(int i = 1 ;i <intervals.length;i++){
            if(prevEnd > intervals[i][0]){
                return false;
            }
            else{
                prevEnd = intervals[i][1];
            }
            
        }
        return true;

    }
}
