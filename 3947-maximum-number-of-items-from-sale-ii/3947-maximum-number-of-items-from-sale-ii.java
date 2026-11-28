class Solution {
    public int maximumSaleItems(int[][] items, int budget) {
 
        int n = items.length;

        int maxFactor = 0;
        int minPrice = Integer.MAX_VALUE;

        for(int i = 0; i < n; i++) {
            maxFactor = Math.max(maxFactor, items[i][0]);
            minPrice = Math.min(minPrice, items[i][1]);
        }

        int[] freq = new int[maxFactor + 1];

        for(int i = 0; i < n; i++) {
            freq[items[i][0]]++;
        }

        int[] total = new int[maxFactor + 1];

        for(int i = 1; i <= maxFactor; i++) {
            for(int j = i; j <= maxFactor; j += i) {
                total[i] += freq[j];
            }
        }

        Arrays.sort(items, (a, b) -> Integer.compare(a[1], b[1]));

        long ans = 0;

        for(int i = 0; i < n; i++) {
            int factor = items[i][0];
            int price = items[i][1];

            if((long)price >= 2L * minPrice) {
                break;
            }

            int gain = total[factor] - 1;

            if(gain <= 0) {
                continue;
            }

            int take = Math.min(gain, budget / price);

            ans += 2L * take;
            budget -= take * price;
        }

        ans += budget / minPrice;

        return (int)ans;
    }
}