//에라토스테네스의 체(Seive of Eratosthenes) 알고리즘
//2부터 시작하여 각 수의 배수들을 지움
//다음으로 남아있는 수를 찾아 해당 수의 배수들을 지워나감
//반복하면서 남아있는 수들은 소수
class Solution {
    public int countPrimes(int n) {
        if (n <= 2) return 0;

        boolean[] isComposite = new boolean[n];
        isComposite[0] = true;
        isComposite[1] = true;

        int count = 0; 

        for (int i = 2; i < n; i++) {
            if (!isComposite[i]) {
                count++;
                for (int j = i * 2; j < n; j += i) {
                    isComposite[j] = true;
                }
            }
        }

        return count;
    }
}