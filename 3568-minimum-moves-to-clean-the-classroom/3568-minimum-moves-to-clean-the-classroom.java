class Solution {

    public int minMoves(String[] classroom, int energy) {

        int n = classroom.length;
        int m = classroom[0].length();

        int sr = 0, sc = 0;
        int litter = 0;

        int[][] id = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                id[i][j] = -1;

                if (classroom[i].charAt(j) == 'S') {
                    sr = i;
                    sc = j;
                }

                if (classroom[i].charAt(j) == 'L') {
                    id[i][j] = litter++;
                }
            }
        }

        int totalMask = (1 << litter) - 1;

        // best[r][c][mask] = maximum energy remaining
        // when we reach (r,c) with this mask
        int[][][] best = new int[n][m][1 << litter];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                for (int mask = 0; mask < (1 << litter); mask++) {
                    best[i][j][mask] = -1;
                }
            }
        }

        Queue<State> q = new LinkedList<>();

        q.add(new State(sr, sc, energy, 0));
        best[sr][sc][0] = energy;

        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};

        int moves = 0;

        while (!q.isEmpty()) {

            int size = q.size();

            while (size-- > 0) {

                State cur = q.poll();

                int r = cur.r;
                int c = cur.c;
                int e = cur.energy;
                int mask = cur.mask;

                if (mask == totalMask)
                    return moves;

                // If this is an outdated state, ignore it
                if (e < best[r][c][mask])
                    continue;

                for (int d = 0; d < 4; d++) {

                    int nr = r + dr[d];
                    int nc = c + dc[d];

                    if (nr < 0 || nr >= n ||
                        nc < 0 || nc >= m)
                        continue;

                    if (classroom[nr].charAt(nc) == 'X')
                        continue;

                    // Every movement costs 1
                    if (e == 0)
                        continue;

                    int ne = e - 1;
                    int nmask = mask;

                    char ch = classroom[nr].charAt(nc);

                    // Collect litter
                    if (ch == 'L') {
                        nmask |= (1 << id[nr][nc]);
                    }

                    // Reset energy
                    if (ch == 'R') {
                        ne = energy;
                    }

                    // Only visit if this gives us MORE energy
                    // for the same position and collected litter.
                    if (ne > best[nr][nc][nmask]) {

                        best[nr][nc][nmask] = ne;

                        q.add(new State(
                            nr,
                            nc,
                            ne,
                            nmask
                        ));
                    }
                }
            }

            moves++;
        }

        return -1;
    }
}

class State {

    int r;
    int c;
    int energy;
    int mask;

    State(int r, int c, int energy, int mask) {
        this.r = r;
        this.c = c;
        this.energy = energy;
        this.mask = mask;
    }
}