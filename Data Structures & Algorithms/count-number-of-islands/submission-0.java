class Solution {
    static void dfs(int i,int j,char[][] grid,int r,int c){

        if(i < 0 || i >= r || j < 0 || j >= c || grid[i][j] == '0') return;

        grid[i][j] = '0';
        dfs(i+1,j,grid,r,c);
        dfs(i-1,j,grid,r,c);
        dfs(i,j+1,grid,r,c);
        dfs(i,j-1,grid,r,c);
    }
    public int numIslands(char[][] grid) {
        int r = grid.length;
        int c = grid[0].length;

        int count = 0;
        for(int i = 0;i < r;i++){
            for(int j = 0;j < c;j++){
                if(grid[i][j] == '1'){
                    count++;
                    dfs(i,j,grid,r,c);
                }
            }
        }
        return count;
    }
}
