class Solution {
    public String[] createGrid(int m, int n) {
        String[] ans = new String[m];
        if(m==1){
            String s="";
            for (int i = 0; i < n; i++) {
                s+='.';
            }
            ans[0]=s;
            return ans;
        }
        for (int i = 0; i < m; i++) {
            char[] row = new char[n];
            Arrays.fill(row, '#');

            if (i < n - 1) {
                row[i] = '.';
                row[i + 1] = '.';
            } else {
                row[n - 1] = '.';
            }
            if(i==m-1){
                int x=i;
                while(x<n) row[x++]='.';
            }
            ans[i] = new String(row);
        }

        return ans;
    }
}