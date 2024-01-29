class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        List<Integer> list = new ArrayList<>();
        int result = Integer.MAX_VALUE;
        int sum = 0;
        
        for(int i = 0 ; i < nums.length; i++) {
            list.add(nums[i]);
            sum += nums[i];

            while(sum >= target) {
                result = Math.min(result, list.size());
                sum -= list.get(0);
                list.remove(0);
            }
        }

        return result != Integer.MAX_VALUE ? result : 0;
    }
}