class Solution {
    
    int f(int ind,int t,int coins[],int[][] dp){
        
        
        
        if(ind==0){
            
            if(t%coins[0]==0){
                return t/coins[0];
            }
            
            return (int)1e9;
            
        }
        if(dp[ind][t]!=-1) return dp[ind][t];
        int notake=f(ind-1,t,coins,dp);
        
        int take=Integer.MAX_VALUE;
        
        if(coins[ind]<=t){
            take=1+f(ind,t-coins[ind],coins,dp);
        }
        
        return dp[ind][t]=Math.min(take,notake);
        
    }
    
    public int coinChange(int[] coins, int amount) {
        
        int size=coins.length;
        
        int dp[][]=new int[size][amount+1];
        
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[i].length;j++){
                dp[i][j]=-1;
            }
        }
        
        int ans=f(size-1,amount,coins,dp);
        
        if(ans==Integer.MAX_VALUE||ans==(int)1e9)
            return -1;
        
        return ans;
        
    }
}