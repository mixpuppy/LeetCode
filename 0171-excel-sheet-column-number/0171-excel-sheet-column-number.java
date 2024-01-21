class Solution {
    public int titleToNumber(String columnTitle) {
        int answer = 0;
        char[] ca = columnTitle.toCharArray();
        for(int i = ca.length -1 , j = 0; i >= 0; i--) {
            if(j == 0) answer += conver(ca[i]);
            else {
                answer += (int) Math.pow(26, j) * conver(ca[i]);
            }
            j++;
        }
        return answer;
    }
    public int conver(char c) {
        return c - 'A' + 1;
    }
}