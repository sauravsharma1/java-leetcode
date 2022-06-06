class Solution {
    static int[][] memo;
    public int minPathSum(int[][] grid) {
        int m=grid.length-1;
        int n=grid[0].length-1;
        
        memo=new int[m+1][n+1];
        
        return helper(grid,m,n,memo);
    }
    
    private int helper(int[][] grid,int m,int n,int[][] memo){
        
        if(m==0&&n==0){
            return grid[0][0];
        }
        
        else if(m<0||n<0){
            return Integer.MAX_VALUE;
        }
        
        if(memo[m][n]!=0){
            return memo[m][n];
        }
        
        return memo[m][n]=grid[m][n]+Math.min(helper(grid,m-1,n,memo),helper(grid,m,n-1,memo));
        
    }
    
}