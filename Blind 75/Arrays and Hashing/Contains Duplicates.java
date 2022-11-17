class Solution {
    public boolean containsDuplicate(int[] nums) {
       // --> linear search
        // int i = 0;
        // for(int j=1;j<nums.length;j++){
        //     if(nums[i] == nums[j]){
        //         return true;
        //     }
        //     else{
        //         i++;
        //     }
        // }
        // return false;
        
    //sol -2 using hashset 
        // HashSet<Integer> hash = new HashSet<>();
        // for (int i =0;i<nums.length;i++){
        //     if(hash.contains(nums[i])){
        //         return true;
        //     }
        //     else{
        //         hash.add(nums[i]);
        //     }
        // }
        // return false;
        
         //sorting 
        Arrays.sort(nums);
        for(int i =0;i<nums.length-1;i++){
            if(nums[i] == nums[i+1]){
                return true;
            }
            
        }
        return false;
        
//         // sol-3  : using xor operator
//         int result = 1;
//         for(int i = 0;i< nums.length;i++){
//            result = result^nums[i]; 
//        if(result == 0) {return true;}

//         }
    
//         return false;
    }
    
}
