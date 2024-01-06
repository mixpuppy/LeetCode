class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> answer = new ArrayList<>(numRows);
        for(int i = 1 ; i <= numRows; i++) {
            List<Integer> list = new ArrayList<>(i);
            // 초기 2 라인은 1로 초기화 시켜주는 작업
            if(i <= 2) {
                for(int j = 0; j < i; j++) {
                    list.add(1);
                }
                answer.add(list);                
            } else {
                for(int j = 0; j < i; j++) {
                    if(j == 0) {
                        list.add(1);
                    } else if (j == list.size()-1) { // 시작과 끝은 1로 동일 초기화;
                        list.add(1);
                    } else {
                        int temp = answer.get(i - 2).get(j - 1);
                        // 이 if 문 없으면 indexOutboundexception 발생하더라
                        if (j < answer.get(i - 2).size()) {
                            temp += answer.get(i - 2).get(j);
                        }
                        list.add(temp);
                    }
                }
                answer.add(list);
            }
        }
        return answer;
    }
}