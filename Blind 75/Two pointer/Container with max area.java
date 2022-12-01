
https://leetcode.com/problems/container-with-most-water/submissions/


class Solution {
    public int maxArea(int[] height) {
        int maxiArea = 0;
        int left = 0;
        int right = height.length -1;
        while(left <right){
            int width = right - left;
            maxiArea = Math.max(maxiArea,Math.min(height[left],height[right] )* width);
            if(height[left] <=height[right]){
                left++;
            }
            else{
                right --;
            }
        }
        return maxiArea;
    }
}
