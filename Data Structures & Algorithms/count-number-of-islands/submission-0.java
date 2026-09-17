class Solution {
    char[][] mainGrid; 
    int m, n;

    public int numIslands(char[][] grid) {
        mainGrid = grid; 
        m = grid.length;
        n = grid[0].length;
        int sum = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mainGrid[i][j] == '1') {
                    sum++;
                    dfs(i, j);
                }
            }
        }

        return sum;
    }

    private void dfs(int i, int j) {
        if (i < 0 || i > m - 1 || j < 0 || j > n - 1) {
            return;
        }

        if (mainGrid[i][j] == '1') {
            mainGrid[i][j] = '0';
            dfs(i, j + 1);
            dfs(i, j - 1);
            dfs(i + 1, j);
            dfs(i - 1, j);
        }
    }
}
