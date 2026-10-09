class Solution {
    public int minInsertions(String s) {
         int insertions = 0;
        int open = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                open++;
            } else {
                // Check whether this ')' has another ')' after it
                if (i + 1 < s.length() && s.charAt(i + 1) == ')') {
                    i++;
                } else {
                    // Insert a ')' to complete the pair
                    insertions++;
                }

                if (open > 0) {
                    open--;
                } else {
                    // Insert an '(' to match this closing pair
                    insertions++;
                }
            }
        }

        // Every remaining '(' needs two ')'
        insertions += open * 2;

        return insertions;
    }
}