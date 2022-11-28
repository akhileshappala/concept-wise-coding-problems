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


\\ Using 2 sum appoach
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
      Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        
        for(int i =0; i<nums.length && nums[i] <=0;i++){
            if(i==0 || nums[i-1] != nums[i]){
                twoSumII(nums, i , res);
            }
        }
        return res;
    }
        void twoSumII(int[] nums, int i , List<List<Integer>> res){
            int lo = i+1, hi = nums.length-1;
            while(lo<hi){
                int sum = nums[i] + nums[lo] + nums[hi];
                
                if(sum < 0 ){
                    lo ++;
                }
                else if( sum > 0){
                    hi--;
                }
                else{
                    res.add(Arrays.asList(nums[i], nums[lo++], nums[hi--]));
                    while(lo < hi && nums[lo] == nums[lo-1])
                        ++lo;
                }
            }
        }
    }
