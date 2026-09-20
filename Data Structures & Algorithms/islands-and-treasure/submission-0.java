class pair{
    int i,j;
    pair(int i,int j){
        this.i = i;
        this.j = j;
    }
}
class Solution {
    public void islandsAndTreasure(int[][] grid) {
        int r = grid.length;
        int c = grid[0].length;
        Queue<pair> queue = new LinkedList<>();
        for(int i = 0;i < r;i++){
            for(int j = 0;j<c;j++){
                if(grid[i][j] == 0) {
                    queue.add(new pair(i,j));
                }
            }
        }

        int[][] directions = {
            {0,1},
            {0,-1},
            {1,0},
            {-1,0}
        };
        int level = 1;
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i =0;i<size;i++){
                pair curr = queue.poll();
                for(int[] dir : directions){
                    int nr = curr.i + dir[0];
                    int nc = curr.j + dir[1];
                    if(nr >= 0 && nr < r && nc >= 0 && nc <c && grid[nr][nc] == Integer.MAX_VALUE){
                        grid[nr][nc] = level;
                        queue.add(new pair(nr,nc));
                    }
                }
            }
            level++;
        }
    }
}
