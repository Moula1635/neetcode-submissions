class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> checkDuplicate = new HashSet<>();
        for(int n : nums){
            if(!checkDuplicate.add(n)){
                return true;
            }
         }
        return false;
    }
}