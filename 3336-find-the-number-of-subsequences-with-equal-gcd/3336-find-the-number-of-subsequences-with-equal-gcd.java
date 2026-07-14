class Solution {

    static final int MOD = 1_000_000_007;
    int[][][] dp;
    int[] nums;

    public int subsequencePairCount(int[] nums) {
        this.nums = nums;
        int n = nums.length;
        dp = new int[n][201][201];

        for (int i = 0; i < n; i++) {
            for (int g1 = 0; g1 <= 200; g1++) {
                Arrays.fill(dp[i][g1], -1);
            }
        }

        return dfs(0, 0, 0);
    }
    private int dfs(int idx, int g1, int g2) {
        if (idx == nums.length) {
            return (g1 != 0 && g1 == g2) ? 1 : 0;
        }
        if (dp[idx][g1][g2] != -1)
            return dp[idx][g1][g2];
        long ans = 0;
        ans += dfs(idx + 1, g1, g2);
        ans += dfs(idx + 1,
                g1 == 0 ? nums[idx] : gcd(g1, nums[idx]),
                g2);
        ans += dfs(idx + 1,
                g1,
                g2 == 0 ? nums[idx] : gcd(g2, nums[idx]));
        ans %= MOD;
        return dp[idx][g1][g2] = (int) ans;
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int t = a % b;
            a = b;
            b = t;
        }
        return a;
    }
}