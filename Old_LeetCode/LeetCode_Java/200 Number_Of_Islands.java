class Solution {
    public int numIslands(char[][] grid) {
        if(grid.length==0)
            return 0;
        int count = 0;
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j]=='1'){
                    isConnected(grid, i,j);
                    count++;
                }
            }
        } 
        return count;
    }
    
    //DFS search for the surounding grid that is part of the island
    public void isConnected(char[][] grid, int x, int y){
        if(x<0||x>grid.length-1) return;
        if(y<0||y>grid[0].length-1) return;
        if(grid[x][y]!='1') return;
        grid[x][y]='2';
        isConnected(grid, x-1,y);
        isConnected(grid, x+1,y);
        isConnected(grid, x,y-1);
        isConnected(grid, x,y+1);
    }
}
