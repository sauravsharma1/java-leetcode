class Solution {
    public int change(int amount, int[] coins) {
    
     int n=coins.length;
        
    int[][] memo=new int[n][amount+1];
        
    for(int[] mem:memo){
        Arrays.fill(mem,-1);
    }
    
     return coinchange(n-1,amount,coins,memo);   
    }
    
    private int coinchange(int i,int amount,int[] coins,int[][] memo){
        
       
        
        if(i==0){
            return memo[0][amount]=amount%coins[0]==0?1:0;
        }
        
         if(memo[i][amount]!=-1){
            return memo[i][amount];
        }
        
        int notake=coinchange(i-1,amount,coins,memo);
        int take=0;
          if(coins[i]<=amount)take=coinchange(i,amount-coins[i],coins,memo);
        
        return memo[i][amount]=take+notake;
        
    }
    
}