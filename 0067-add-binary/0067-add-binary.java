class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int aIdx = a.length() - 1;
        int bIdx = b.length() - 1;
        int plus = 0;

        while(aIdx >= 0 || bIdx >= 0) {
            int sum = plus;
            if(aIdx >= 0) sum += a.charAt(aIdx--) - '0';
            if(bIdx >= 0) sum += b.charAt(bIdx--) - '0';
            plus = sum > 1 ? 1 : 0 ;
            sb.append(sum % 2);
        }
        if(plus != 0) sb.append(plus);
        return sb.reverse().toString();

    }
}