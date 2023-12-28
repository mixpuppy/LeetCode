class Solution {
    public int lengthOfLastWord(String s) {
        String[] sa = s.split(" ");
        for(int i = 0; i < sa.length; i++) {
            if(!sa[sa.length-1-i].equals("")) {
                return sa[sa.length-1-i].length();
            }
        }
        return -1;
    }
}