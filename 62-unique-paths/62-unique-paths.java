class Solution {
    public int uniquePaths(int m, int n) {
        if(m==0||n==0){
            throw new IllegalArgumentException("cant be zero");
        }
        
        int[][] memo=new int[m][n];
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                memo[i][j]=-1;
            }
        }
        
        return numPaths(m-1,n-1,memo);
        
        
        
    }
    
    
    private int numPaths(int i,int j,int[][] memo){
        
        if(i<0||j<0){
            return 0;
        }
        
        if(i==0&&j==0){
            return 1;
        }
        
        if(memo[i][j]!=-1)
        {
            return memo[i][j];
        }        
        
        return memo[i][j]=numPaths(i-1,j,memo)+numPaths(i,j-1,memo);
        
    }
    
}