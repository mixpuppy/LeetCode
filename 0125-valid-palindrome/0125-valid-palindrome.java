class Solution {
    public boolean isPalindrome(String s) {
        int originIdx = 0;
        int index = 0;
        char[] temp = new char[s.length()];

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                temp[index++] = s.charAt(i);
            } else if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                temp[index++] = (char) ((int)s.charAt(i) + (int) ' ');
            } else if(s.charAt(i) >= '0' && s.charAt(i) <= '9'){
                temp[index++] = s.charAt(i);
            } else {
                continue;
            }
        }

        if(index == 0 || index == 1) return true;
        index--;
        while(originIdx < index) {
            if(temp[originIdx] == temp[index]) {
                originIdx++;
                index--;
            } else {
                return false;
            }

        }
        return true;
    }
}