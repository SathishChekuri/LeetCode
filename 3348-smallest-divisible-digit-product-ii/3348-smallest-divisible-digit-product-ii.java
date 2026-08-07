class Solution {
    public String smallestNumber(String s, long t) {
        long x = t;
        for (int d = 2; d <= 9; d++) {
            while (x % d == 0) x /= d;
        }
        if (x > 1) return "-1";

        int n = s.length();
        long[] pre = new long[n + 1];
        pre[0] = t;
        int idx = n - 1;
        char[] ch = s.toCharArray();

        for (int i = 0; i < n; i++) {
            if (ch[i] == '0') {
                idx = i;
                break;
            }
            pre[i + 1] = pre[i] / gcd(pre[i], ch[i] - '0');
        }

        if (pre[n] == 1) return s;

        for (int i = idx; i >= 0; i--) {
            while (++ch[i] <= '9') {
                long cur = pre[i] / gcd(pre[i], ch[i] - '0');
                int d = 9;
                for (int j = n - 1; j > i; j--) {
                    while (cur % d != 0) d--;
                    cur /= d;
                    ch[j] = (char) ('0' + d);
                }
                if (cur == 1) return new String(ch);
            }
        }

        StringBuilder sb = new StringBuilder();
        long val = t;
        for (int d=9; d>1;d--) {
            while (val % d == 0) {
                sb.append((char) ('0' + d));
                val /= d;
            }
        }

        int pad = Math.max(n + 1 - sb.length(), 0);
        while (pad-- > 0) sb.append('1');

        return sb.reverse().toString();
    }

    private long gcd(long a, long b) {
        while (b!=0) {
            long t=b;
            b=a%b;
            a=t;
        }
        return a;
    }
}