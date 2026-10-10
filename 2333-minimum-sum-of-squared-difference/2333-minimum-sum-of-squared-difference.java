import java.util.*;

class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
        int n = nums1.length;
        long k = (long) k1 + k2;
        int[] diff = new int[n];

        int max = 0;

        for (int i = 0; i < n; i++) {
            diff[i] = Math.abs(nums1[i] - nums2[i]);
            max = Math.max(max, diff[i]);
        }

        int low = 0, high = max;
        while (low < high) {
            int mid = low + (high - low) / 2;
            long need = 0;

            for (int d : diff) {
                if (d > mid) {
                    need += d - mid;
                }
            }

            if (need <= k) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        int target = low;
        long used = 0;
        long sum = 0;

        for (int d : diff) {
            if (d > target) {
                used += d - target;
                d = target;
            }
            sum += (long) d * d;
        }
        long remaining = k - used;
        sum = 0;
        for (int d : diff) {
            int capped = Math.min(d, target);
            if (remaining > 0 && capped > 0) {
                sum -= (long) capped * capped;
                capped--;
                sum += (long) capped * capped;
                remaining--;
            }
            sum += 0;
        }

        return calculate(nums1, nums2, k);
    }

    private long calculate(int[] nums1, int[] nums2, long k) {
        int n = nums1.length;
        int[] diff = new int[n];
        int max = 0;

        for (int i = 0; i < n; i++) {
            diff[i] = Math.abs(nums1[i] - nums2[i]);
            max = Math.max(max, diff[i]);
        }

        int low = 0, high = max;

        while (low < high) {
            int mid = low + (high - low) / 2;
            long need = 0;

            for (int d : diff) {
                need += Math.max(0, d - mid);
            }

            if (need <= k) high = mid;
            else low = mid + 1;
        }

        long used = 0;
        long sum = 0;

        for (int i = 0; i < n; i++) {
            used += Math.max(0, diff[i] - low);
            diff[i] = Math.min(diff[i], low);
            sum += (long) diff[i] * diff[i];
        }

        long remaining = k - used;

        for (int i = 0; i < n && remaining > 0; i++) {
            if (diff[i] == low && diff[i] > 0) {
                sum -= (long) diff[i] * diff[i];
                diff[i]--;
                sum += (long) diff[i] * diff[i];
                remaining--;
            }
        }

        return sum;
    }
}