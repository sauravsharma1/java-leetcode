class Solution {
    
    public static int dp[]=new int[46];
    
    public int climbStairs(int n) {
       
        if(n<0){
            return 0;
        }
        
        if(n==0){
            return 1;
        }
        
        if(dp[n]!=0){
            return dp[n];
        }
        
        int jumpone=climbStairs(n-1);
        int jumptwo=climbStairs(n-2);
        
        dp[n]=jumpone+jumptwo;
        
        return dp[n];
        
    }
}