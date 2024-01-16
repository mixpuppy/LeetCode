/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int start = 1;
        int end = n;
        while(start < end) {
            int target = start + (end - start)/2;
            if(isBadVersion(target)) {
                end = target;
            } else {
                start = target + 1;
            }
        }
        // 리턴값은 target 이면 안된다에 유의
        return start;
    }
}