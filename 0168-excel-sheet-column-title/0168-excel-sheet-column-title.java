class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
    
        while(columnNumber > 0) {
            columnNumber--;
            int added = columnNumber % 26;
            sb.append(convert(added));
            columnNumber /= 26;
        }

        return sb.reverse().toString();
    }

    public char convert(int i) {
        if (i < 0 || i >= 26) {
            throw new IllegalArgumentException("숫자는 1부터 26 사이의 값이어야 합니다.");
        }
        return (char) ('A' + i);
    }
}