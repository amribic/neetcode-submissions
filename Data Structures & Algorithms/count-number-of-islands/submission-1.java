class Solution {
    int m, n;

    public int numIslands(char[][] grid) {
        m = grid.length;
        n = grid[0].length;
        int sum = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1') {
                    sum++;
                    dfs(grid, i, j);
                }
            }
        }

        return sum;
    }

    private void dfs(char[][] grid, int i, int j) {
        if (i < 0 || i > m - 1 || j < 0 || j > n - 1) {
            return;
        }

        if (grid[i][j] == '1') {
            grid[i][j] = '0';
            dfs(grid, i, j + 1);
            dfs(grid, i, j - 1);
            dfs(grid, i + 1, j);
            dfs(grid, i - 1, j);
        }
    }
}
