
import java.util.*;

class Solution {

    class Fenwick {
        int n;
        long[] tree;

        Fenwick(int n) {
            this.n = n;
            tree = new long[n + 1];
        }

        void update(int i, long val) {
            while (i <= n) {
                tree[i] += val;
                i += i & -i;
            }
        }

        long query(int i) {
            long sum = 0;
            while (i > 0) {
                sum += tree[i];
                i -= i & -i;
            }
            return sum;
        }

        int kth(long k) {
            int idx = 0;
            for (int bit = Integer.highestOneBit(n); bit > 0; bit >>= 1) {
                int next = idx + bit;
                if (next <= n && tree[next] < k) {
                    idx = next;
                    k -= tree[next];
                }
            }
            return idx + 1;
        }
    }

    public long minOperations(int[] nums, int x, int k) {
        int n = nums.length;

        int[] sorted = nums.clone();
        Arrays.sort(sorted);

        int size = 0;
        for (int v : sorted) {
            if (size == 0 || sorted[size - 1] != v) {
                sorted[size++] = v;
            }
        }

        int[] values = Arrays.copyOf(sorted, size);

        Fenwick countBIT = new Fenwick(size);
        Fenwick sumBIT = new Fenwick(size);

        int[] rank = new int[n];

        for (int i = 0; i < n; i++) {
            rank[i] = Arrays.binarySearch(values, nums[i]) + 1;
        }

        int windows = n - x + 1;
        long[] cost = new long[windows];
        long totalSum = 0;

        for (int i = 0; i < x; i++) {
            countBIT.update(rank[i], 1);
            sumBIT.update(rank[i], nums[i]);
            totalSum += nums[i];
        }

        for (int start = 0; start < windows; start++) {
            int medianIndex = countBIT.kth((x + 1L) / 2);
            long median = values[medianIndex - 1];

            long leftCount = countBIT.query(medianIndex);
            long leftSum = sumBIT.query(medianIndex);

            long rightCount = x - leftCount;
            long rightSum = totalSum - leftSum;

            cost[start] = median * leftCount - leftSum
                    + rightSum - median * rightCount;

            if (start + 1 < windows) {
                int remove = start;
                int add = start + x;

                countBIT.update(rank[remove], -1);
                sumBIT.update(rank[remove], -nums[remove]);
                totalSum -= nums[remove];

                countBIT.update(rank[add], 1);
                sumBIT.update(rank[add], nums[add]);
                totalSum += nums[add];
            }
        }

        long INF = Long.MAX_VALUE / 4;
        long[][] dp = new long[k + 1][n + 1];

        for (int j = 1; j <= k; j++) {
            Arrays.fill(dp[j], INF);
        }

        for (int j = 1; j <= k; j++) {
            for (int i = 1; i <= n; i++) {
                dp[j][i] = dp[j][i - 1];

                if (i >= x && dp[j - 1][i - x] != INF) {
                    long candidate = dp[j - 1][i - x] + cost[i - x];
                    dp[j][i] = Math.min(dp[j][i], candidate);
                }
            }
        }

        return dp[k][n];
    }
}
