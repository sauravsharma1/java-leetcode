class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        
        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;
        
        int[][] memo=new int[m][n];
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                memo[i][j]=-1;
            }
        }
        
        return uniquePaths(m-1,n-1,memo,obstacleGrid);
        
    }
    
    private int uniquePaths(int i,int j,int[][] memo,int[][] obstacles){
        
         if(i<0||j<0){
            return 0;
        }
        
        if(obstacles[i][j]==1){
            return 0;
        }
        
       
        
        if(i==0&&j==0){
            return 1;
        }
        
        if(memo[i][j]!=-1){
            return memo[i][j];
        }
        
        return memo[i][j]=uniquePaths(i-1,j,memo,obstacles)+uniquePaths(i,j-1,memo,obstacles);
        
    }
    
}