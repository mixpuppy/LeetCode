class Solution {
    public String longestCommonPrefix(String[] strs) {
        int idx = 0;
        int temp = 300;
        for(int i = 0; i < strs.length; i++) {
            if(temp > strs[i].length()) {
                temp = strs[i].length();
                idx = i;
            } 
        }
        boolean check = false;
        String answer = "";
        for(int j = 0; j < strs[idx].length(); j++) {
            for(int i = 0; i < strs.length; i++) {
                if(strs[i].startsWith(strs[idx].substring(0,strs[idx].length()-j))) {
                    check = true;
                    answer = strs[idx].substring(0,strs[idx].length()-j);
                    continue;
                } else {
                    check = false;
                    break;
                }
            }
            if(check) {
                break;
            } else continue;
        }
        return check ? answer : "";
    }
}