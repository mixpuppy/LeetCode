/**
 백트래킹 문제
 */
class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> answer = new ArrayList<>();
        helper(k, n, 1, new ArrayList<>(), answer);
        return answer;
    }
    public void helper(int k, int n, int start, List<Integer> list, List<List<Integer>> result) {
        // 재귀 호출 중 원하는 숫자의 합이 나오면 0 이 되고 리스트 추가하고 해당 재귀호출 정지
        if(n == 0) {
            if(list.size() == k) {
                result.add(new ArrayList<>(list));
            }
            return;
        }

        // 1~9 까지 백트래킹
        for(int i = start ; i <= 9; i++) {
            if(i <= n) {
                list.add(i);
                helper(k, n - i, i + 1, list, result);
                list.remove(list.size()-1);
            } else {
                break;
            }
        }


    }
}