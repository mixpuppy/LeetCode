class Solution {
    // XOR 연산은 2번(짝수번) 만나면 무조건 0이 된다.
    // 순서는 상관이 없다.
    public int singleNumber(int[] nums) {
        int result=0;
        for(int i=0;i<nums.length;i++){
            result^=nums[i];
        }
        return result;
    }
}