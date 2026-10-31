class Solution {
    public int uniquePaths(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int MOD = 1_000_000_007;
        int[][] destR = new int[m][n];
        int[][] destD = new int[m][n];

        for (int i = 0; i < m; i++) {
            java.util.Arrays.fill(destR[i], -1);
            java.util.Arrays.fill(destD[i], -1);
        }

        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                if (grid[i][j] == 0) {
                    continue;
                }

                if (i + 1 < m) {
                    if (grid[i + 1][j] == 0) {
                        destR[i][j] = (i + 1) * n + j;
                    } else {
                        destR[i][j] = destD[i + 1][j];
                    }
                }

                if (j + 1 < n) {
                    if (grid[i][j + 1] == 0) {
                        destD[i][j] = i * n + (j + 1);
                    } else {
                        destD[i][j] = destR[i][j + 1];
                    }
                }
            }
        }

        long[][] dp = new long[m][n];
        dp[0][0] = 1;

       
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1 || dp[i][j] == 0) {
                    continue;
                }

                long ways = dp[i][j];

                if (j + 1 < n) {
                    int destination;

                    if (grid[i][j + 1] == 0) {
                        destination = i * n + (j + 1);
                    } else {
                        destination = destR[i][j + 1];
                    }

                    if (destination != -1) {
                        int r = destination / n;
                        int c = destination % n;
                        dp[r][c] = (dp[r][c] + ways) % MOD;
                    }
                }

                if (i + 1 < m) {
                    int destination;

                    if (grid[i + 1][j] == 0) {
                        destination = (i + 1) * n + j;
                    } else {
                        destination = destD[i + 1][j];
                    }

                    if (destination != -1) {
                        int r = destination / n;
                        int c = destination % n;
                        dp[r][c] = (dp[r][c] + ways) % MOD;
                    }
                }
            }
        }

        return (int) dp[m - 1][n - 1];
    }
}