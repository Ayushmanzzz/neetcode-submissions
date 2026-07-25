class Solution {
    public boolean hasDuplicate(int[] nums) {
        boolean ok = false;
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i] == nums[j]){
                    ok = true;
                }
            }
        }
        return ok;
    }
}