class Solution {
    public long findKthSmallest(int[] coins, int k) {
        long low = 1;
        long high = (long) coins[0] * k;

        for (int c : coins)
            high = Math.min(high, (long) c * k);

        while (low < high) {
            long mid = low + (high - low) / 2;

            if (count(mid, coins) >= k)
                high = mid;
            else
                low = mid + 1;
        }

        return low;
    }

    long count(long x, int[] coins) {
        return dfs(0, 1, x, coins, 0);
    }

    long dfs(int index, long lcm, long x, int[] coins, int selected) {
        if (index == coins.length) {
            if (selected == 0)
                return 0;

            return selected % 2 == 1 ? x / lcm : -(x / lcm);
        }

        long ans = dfs(index + 1, lcm, x, coins, selected);

        long g = gcd(lcm, coins[index]);
        long newLcm = lcm / g * coins[index];

        if (newLcm <= x)
            ans += dfs(index + 1, newLcm, x, coins, selected + 1);

        return ans;
    }

    long gcd(long a, long b) {
        while (b != 0) {
            long t = a % b;
            a = b;
            b = t;
        }
        return a;
    }
}