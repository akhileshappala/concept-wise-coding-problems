https://leetcode.com/problems/3sum/


class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
       List<List<Integer>> res = new LinkedList<>();
        int sum;
         Arrays.sort(nums);
        for(int i =0;i<nums.length-2;i++){
           int j =i+1;
            int k = nums.length-1;
            while(j<k){
                 sum = nums[i]+nums[j]+nums[k];
                if(sum == 0){
                    res.add(Arrays.asList(nums[i],nums[j++],nums[k--]));
                  }
                else if(sum>0){
                    k--;
                }
                else if(sum<0){
                    j++;
                }
            }
              
              
            }
                 return res;

        }
        
    }
