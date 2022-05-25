class Solution {
    
    private int[][] directions={{1,0},{0,1},{-1,0},{0,-1}};
    
    public int longestIncreasingPath(int[][] matrix) {
        
        if(matrix==null){
            return 0;
        }
        
        int m=matrix.length;
        
        if(m==0){
            return 0;
        }
        
        int n=matrix[0].length;
        
        if(n==0){
            return 0;
        }
        
        int cache[][]=new int[m][n];
        
        int maxlength=1;
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                
                int currentmax=dfs(i,j,matrix,m,n,cache);
                maxlength=Math.max(currentmax,maxlength);
                
                
                
            }
        }
        
        return maxlength;
        
    }
    
    private int dfs(int i,int j,int[][] matrix,int m,int n,int[][] cache){
        
        if(i<0||j<0||i>=m||j>=n){
            return 0;
        }
        
        if(cache[i][j]>0){
            return cache[i][j];
        }
        
        int currentlen=1;
        
        for(int[] direction:directions){
            int neighx=i+direction[0];
            int neighy=j+direction[1];
            
            if(neighx<0||neighy<0||neighx>=m||neighy>=n){
                continue;
            }
            
            if(matrix[i][j]>=matrix[neighx][neighy]){
                continue;
            }
            
            currentlen=Math.max(currentlen,1+dfs(neighx,neighy,matrix,m,n,cache));
            
        }
        cache[i][j]=currentlen;
        return currentlen;
    }
    
}