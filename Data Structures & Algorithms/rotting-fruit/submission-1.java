class pair{
    int i,j;
    pair(int i,int j){
        this.i = i;
        this.j = j;
    }
}
class Solution {
    public int orangesRotting(int[][] grid) {
        int r = grid.length;
        int c = grid[0].length;
        Queue<pair> queue = new LinkedList<>();
        int fresh = 0;
        for(int i = 0;i < r;i++){
            for(int j = 0;j<c;j++){
                if(grid[i][j] == 2 ) {
                    queue.add(new pair(i,j));
                }
                else if(grid[i][j] == 1) {
                    fresh++;
                }
            }
        }

        int[][] directions = {
            {0,1},
            {0,-1},
            {1,0},
            {-1,0}
        };
        int min =0;
        while(!queue.isEmpty()){
            if(fresh == 0) break;
            int size = queue.size();
            for(int i =0;i<size;i++){
                pair curr = queue.poll();
                for(int[] dir : directions){
                    int nr = curr.i + dir[0];
                    int nc = curr.j + dir[1];
                    if(nr >= 0 && nr < r && nc >= 0 && nc <c && grid[nr][nc] == 1){
                        fresh--;
                        grid[nr][nc] = 2;
                        queue.add(new pair(nr,nc));
                    }
                }
            }
            min++;
        }
        return fresh > 0 ? -1 : min;
    }
}
