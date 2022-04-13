class Solution {
    
    
    
    public int[][] generateMatrix(int n) {
        int[][] ans=new int[n][n];
        
        if(n==0){
            return ans;
        }
        
        int startRow=0;
        int endRow=n-1;
        int startColumn=0;
        int endColumn=n-1;
        
        
        int count=1;
        
        while(startRow<=endRow&&startColumn<=endColumn){
            for(int j=startColumn;j<=endColumn;j++){
                ans[startRow][j]=count++;
            }
            startRow++;
            
            for(int i=startRow;i<=endRow;i++){
                ans[i][endColumn]=count++;
            }
            
            endColumn--;
            
            if(startRow<=endRow){
                for(int j=endColumn;j>=startColumn;j--){
                    ans[endRow][j]=count++;
                }
            }
            endRow--;
            if(startColumn<=endColumn){
                for(int i=endRow;i>=startRow;i--){
                    ans[i][startColumn]=count++;
                }
            }
            startColumn++;
            
        }
        
        return ans;
        
    }
}