https://leetcode.com/problems/group-anagrams/submissions/


Your input
["eat","tea","tan","ate","nat","bat"]
Output
[["eat","tea","ate"],["bat"],["tan","nat"]]
Expected
[["bat"],["nat","tan"],["ate","eat","tea"]]


class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length == 0){
            // if the given array length is 0 return empty array list
            return new ArrayList();
        }
        //creating a hashmap, to link the sorted string with its anagrams 
        // it will be { "aer" : ["are","ear","era"]} 
        HashMap<String, List> ans = new HashMap<String, List>();
        for (String s : strs){
            //traversing through the given array and considering individual string
            //converting the string to  character array so that we can sort
            char[] ca = s.toCharArray();
            //sorting the char array
            Arrays.sort(ca);
            //after sorting, coverting them into string again so that we can map
            String key = String.valueOf(ca);
            //if the sorted string i.e key "aer" not there in map, push a new array list for that key
            if(!ans.containsKey(key)){
                ans.put(key, new ArrayList());
            }
            // finally adding the similar strings to respective keys, by getting the key related to string
            ans.get(key).add(s);
        }
        return new ArrayList(ans.values());
    }
}
