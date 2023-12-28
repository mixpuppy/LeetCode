class Solution {
    public int searchInsert(int[] nums, int target) {
        int idx = 0;
        for(int i = 0 ; i < nums.length; i++) {
            if(nums[i] == target) {
                return idx;
            } else if (nums[i] < target) {
                idx++;
            } 
        }
        return idx;
    }
}