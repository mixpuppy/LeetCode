class Solution {
    public int romanToInt(String s) {
        char[] ca = s.toCharArray();
        int answer = 0;
        for(int i = 0; i < ca.length; i++) {
            if(ca[i] == 'I' && i != ca.length -1 && (ca[i+1] == 'V' || ca[i+1] == 'X')){
                answer -= 1;
                continue;
            } else if (ca[i] == 'X' && i != ca.length -1 &&  (ca[i+1] == 'L' || ca[i+1] == 'C')) {
                answer -= 10;
                continue;
            } else if (ca[i] == 'C' && i != ca.length -1 &&  (ca[i+1] == 'D' || ca[i+1] == 'M')) {
                answer -= 100;
                continue;
            } 
            switch (ca[i]) {
                case 'I':
                    answer ++;
                    break;
                case 'V':
                    answer += 5;
                    break;
                case 'X':
                    answer += 10;
                    break;                
                case 'L':
                    answer += 50;
                    break;
                case 'C':
                    answer += 100;
                    break;
                case 'D':
                    answer += 500;
                    break;
                case 'M':
                    answer += 1000;
                    break;                                                 
            }
        }
        return answer;
    }
}