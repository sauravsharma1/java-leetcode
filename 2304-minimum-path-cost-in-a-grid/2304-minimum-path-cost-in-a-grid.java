class Solution {
    public int minPathCost(int[][] grid, int[][] moveCost) {
        int[][] dp=new int[grid.length][grid[0].length];
        
        for(int[] row:dp){
            Arrays.fill(row,Integer.MAX_VALUE);
        }
        
        int max=Integer.MAX_VALUE;
        
        for(int i=0;i<grid[0].length;i++){
            max=Math.min(max,dfs(grid,moveCost,dp,0,i));
        }
        
        return max;
        
    }
    
    private int dfs(int[][] grid,int[][] moveCost,int[][] dp,int row,int col){
        
        if(row==grid.length-1){
            return grid[row][col];
        }
        
        if(dp[row][col]!=Integer.MAX_VALUE){
            return dp[row][col];
        }
        
        
        int output=Integer.MAX_VALUE;
        
        int[] movecost=moveCost[grid[row][col]];
        
        for(int i=0;i<movecost.length;i++){
            output=Math.min(grid[row][col]+movecost[i]+dfs(grid,moveCost,dp,row+1,i),output);
        }
        
        return dp[row][col]=output;
        
    }
    
}