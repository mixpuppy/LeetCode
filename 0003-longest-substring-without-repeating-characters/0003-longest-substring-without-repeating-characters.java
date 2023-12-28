class Solution {
    public int lengthOfLongestSubstring(String s) {
        String[] sa = s.split("");
        String answer = "";
        String temp = "";
        
        for(String c : sa) {
            if(!temp.contains(c)) {
                temp += c;
            } else {
                if(answer.length() < temp.length()) {
                    answer = temp;
                }
                int index = temp.indexOf(c);
                if (index < temp.length() - 1) {
                    temp = temp.substring(index + 1) + c;
                } else {
                    temp = c;
                }
            }
        }
        if (temp.length() > answer.length()) {
            answer = temp; // 마지막 substring이 가장 긴 경우 처리
        }
        return answer.length();
    }
}