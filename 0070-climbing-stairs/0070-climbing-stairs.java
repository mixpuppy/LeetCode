class Solution {
    public int climbStairs(int n) {
        if (n <= 2) return n;

        int preStep = 2;
        int prepreStep = 1;
        int currentStep = 0;
        for (int i = 3; i <= n ; i++) {
            currentStep = preStep + prepreStep;
            prepreStep = preStep;
            preStep = currentStep;
        }
        return currentStep;
        
    }
}