class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        int left = 0;
        int right = height.length - 1;

        while (left < right) {
            int x = right - left;
            int y = Math.min(height[left], height[right]);
            max = Math.max(max, width(x, y));

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return max;
    }

    public int width(int x, int y) {
        return x * y;
    }
}