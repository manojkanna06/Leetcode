class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();
        for(int val : arr){
            map.put(val , map.getOrDefault(val,0) + 1);
        }

        for(int val : map.values()){
            if(!set.contains(val)){
                set.add(val);
            }
            else{
                return false;
            }
        }
        return true;
    }
}
