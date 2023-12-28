class Solution {
    public int[] plusOne(int[] digits) {
        
        for(int i = 0 ; i < digits.length; i++) {
            digits[digits.length-1-i] ++;
            if(digits[digits.length-1-i] != 10) {
                return digits;
            } else {
                digits[digits.length-1-i] = 0;
            }
        }
        digits = new int[digits.length+1];
        digits[0] = 1;
        return digits;


        // StringBuilder sb = new Stringbuilder();
        // for(int i = 0 ; i < digits.length; i++) {
        //     sb.append(digits[i]);
        // }
        // int answer = Integer.parseInt(sb.toString()) + 1;
        // String s = Integer.toString(answer);
        // int[] ia = new int[s.length()];
        // int op = 1;
        // for(int i = 0; i<s.length(); i++) {
        //     ia[s.length() -1 -i] = answer;
        // }
    }
}