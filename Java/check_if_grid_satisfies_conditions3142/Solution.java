class Solution {
    public boolean satisfiesConditions(int[][] grid) {
        int a = grid.length;
        int b = grid[0].length;

        for(int i = 0; i < a; i++)
        {
            for(int j = 0; j < b; j++)
            {
                if(j < b - 1 && grid[i][j] == grid[i][j + 1])
                {
                    return false;
                }
                if(i < a - 1 && grid[i][j] != grid[i+1][j])
                {
                    return false;
                }
            }
        }
        return true;
    }
}
