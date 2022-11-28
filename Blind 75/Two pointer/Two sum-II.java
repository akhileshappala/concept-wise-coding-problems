
https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/submissions/


class Solution {
    public int[] twoSum(int[] numbers, int target) {
       
        //using the 2 pointer approach
        
        int low = 0;
        int high = numbers.length - 1;
        
        while(low< high){
            long sum = numbers[low] + numbers[high];
            
            if(sum == target){
                return new int[]{low+1 , high +1};
            }
            else if(sum < target){
                low++ ;
            }
            else{
                high--;
            }
        }
        return new int[]{-1,-1};
        
        
    }
}
