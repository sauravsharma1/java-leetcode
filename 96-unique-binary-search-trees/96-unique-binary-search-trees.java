class Solution {
    public int numTrees(int n) {
        
      int[][] memo=new int[n+1][n+1];
        
       return trees(1,n,memo); 

        
    }
    
    private int trees(int start,int end,int[][] memo){
        
        
        
        if(start>=end){
            return 1;
        }
        
        if(memo[start][end]>0){
            return memo[start][end];
        }
        
        int count=0;
        int i=0;
        for( i=start;i<=end;i++){
            count+=trees(start,i-1,memo)*trees(i+1,end,memo);
            
        }
        return memo[start][end]=count;
    }
    
}