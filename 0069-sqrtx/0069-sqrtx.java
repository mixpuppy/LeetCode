class Solution {
    public int mySqrt(int x) {
        if(x == 0) return 0;
        else if (x == 1 || x == 2 || x == 3) return 1;

        int start = 2;
        int end = x;
        int mid = -1;

        while(start <= end) {
            mid = start + (end - start) / 2;
            if((long) mid * mid > (long) x) end = mid - 1;
            else if (mid * mid == x) return mid;
            else start = mid + 1;
        }
        return Math.round(end);
    }
}