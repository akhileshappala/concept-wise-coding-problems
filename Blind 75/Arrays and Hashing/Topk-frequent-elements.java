
// tried the below approach 
1. Add the list to map 
2. Increase the count of values based on the key
3. sort the map based on values
4. Traverse the map and get keys add them to arraylist
5. convert arraylist to arary 
6. return array

// failing for negative numbers - as sorting a map is failing 
// will come up with head solution


        import java.util.*;
import java.util.Collection;
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //base case
//         if(k == nums.length){
//             return nums;
//         }
        
//         HashMap<Integer, Integer> map = new HashMap<>();
//         ArrayList<Integer> arrayList = new ArrayList<Integer>(); 
//         for(int i =0;i<nums.length;i++){
//            if(!map.containsKey(nums[i])){
//                map.put(nums[i], 1);
//            }
//             else{
//               int value =  map.get(nums[i]);
//                 value ++;
//                 map.put(nums[i],value);
//             }
//         }
//         HashMap<Integer, Integer> SortedMap = new HashMap<>();
//         map.entrySet().stream()
//             .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())) 
//             .forEachOrdered(x -> SortedMap.put(x.getKey(), x.getValue()));
//         int count=1;
//          System.out.println(SortedMap);
//         for (Map.Entry<Integer, Integer> en :
//              SortedMap.entrySet()) {
//             if(count>k){
//                 break;
//             }
//             else{
//                 arrayList.add(en.getKey());
//                 count++;
//             }
            
//         }
      
//         int[] ret = new int[arrayList.size()];
//     for (int i=0; i < ret.length; i++)
//     {
//         ret[i] = arrayList.get(i).intValue();
//     }
//     return ret;
        
        
        //approach 2 -- using Max Heap
        
        if(k== nums.length){
            return nums;
        }
        
        Map<Integer , Integer> count = new HashMap();
        for(int n :nums){
            count.put(n,count.getOrDefault(n,0) +1);
        }
        
        Queue<Integer> heap = new PriorityQueue<>(
        (n1,n2) -> count.get(n1)-count.get(n2));
        
        for(int n : count.keySet()){
            heap.add(n);
            if(heap.size() > k) {
                heap.poll();
            }
        }
        
        int[] top = new int[k];
        for(int i =k-1;i>=0;--i){
            top[i] = heap.poll();
        }
        return top;
    }
}
        
        
    }
}
