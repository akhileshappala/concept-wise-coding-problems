// link : https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/description/

// when we have a sorted array but rotated - we have 2 sets of sorted arrays now 
// one is on right and the other is left 

// lets say 1,2,3,4,5,6,7
//   now i have rotated the array 
//   4,5,6,7,1,2,3
//   we have 2 sets of sorted ones - 4,5,6,7 and 1,2,3 
//   mid = 7 > left 4 --> we need to search in right side sorted array so left = mid +1
  
//   the step -> nums[start] <= nums[end]  --> when this conition hits we are actually at the start of the sorted array
  

class Solution {
    public int findMin(int[] nums) {
       int start = 0;
       int end = nums.length-1;
       while (start <= end){
           int mid = (start +end)/2;
           if(nums[start] <= nums[end]){
               return nums[start];
           }
           if(nums[mid] >= nums[start]){
               start  = mid+1;
           }
           else{
               end = mid;
           }
       }
       return 0;
    }
}
