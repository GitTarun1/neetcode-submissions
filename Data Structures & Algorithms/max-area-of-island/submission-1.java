class Solution {
    static int dfs(int i,int j,int[][] grid,int r,int c){

        if(i < 0 || i >= r || j < 0 || j >= c || grid[i][j] == 0) return 0;
        
        grid[i][j] = 0;
        return 1 +dfs(i+1,j,grid,r,c)+
        dfs(i-1,j,grid,r,c)+
        dfs(i,j+1,grid,r,c)+
        dfs(i,j-1,grid,r,c);
    }
    public int maxAreaOfIsland(int[][] grid) {
        int r = grid.length;
        int c = grid[0].length;

        int max = 0;
        for(int i = 0;i < r;i++){
            for(int j = 0;j < c;j++){
                if(grid[i][j] == 1){
                    max = Math.max(max,dfs(i,j,grid,r,c));
                }
            }
        }
        return max;
    }
}
