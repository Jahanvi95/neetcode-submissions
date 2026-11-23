class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> setss = new HashSet<>();
        for(int num : nums){
            if(setss.contains(num))
            return true;  

            setss.add(num);
        }
        return false;
}
}