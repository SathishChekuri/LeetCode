class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        boolean[][] visited = new boolean[n][m];
        List<Integer> ar = new ArrayList<>();
        int r = 0, c = 0;
        ar.add(matrix[r][c]);
        visited[r][c] = true;
        while (true) {
            if (c + 1 < m && !visited[r][c + 1]) {
                while (c + 1 < m && !visited[r][c + 1]) {
                    ar.add(matrix[r][c + 1]);
                    c++;
                    visited[r][c] = true;
                }
                continue;
            } else if (r + 1 < n && !visited[r + 1][c]) {
                while (r + 1 < n && !visited[r + 1][c]) {
                    ar.add(matrix[r + 1][c]);
                    r++;
                    visited[r][c] = true;
                }
                continue;
            } else if (c - 1 >= 0 && !visited[r][c - 1]) {
                while (c - 1 >= 0 && !visited[r][c - 1]) {
                    ar.add(matrix[r][c - 1]);
                    c--;
                    visited[r][c] = true;
                }
                continue;
            } else if (r - 1 >= 0 && !visited[r - 1][c]) {
                while (r - 1 >= 0 && !visited[r - 1][c]) {
                    ar.add(matrix[r - 1][c]);
                    r--;
                    visited[r][c] = true;
                }
                continue;
            }
            break;
        }
        return ar;
    }
}