class Solution {
    
    private int lps(String s,int l,int r,Integer[][] dp){
        
        if(l>r){
            return 0;
        }
        
        if(l==r){
            return 1;
        }
        
        if(dp[l][r]!=null){
            return dp[l][r];
        }
        
        if(s.charAt(l)==s.charAt(r)){
            return dp[l][r]=2+lps(s,l+1,r-1,dp);
        }
        
        return dp[l][r]=Math.max(lps(s,l+1,r,dp),lps(s,l,r-1,dp));
        
    }
    
    public int longestPalindromeSubseq(String s) {

        Integer[][] dp=new Integer[s.length()][s.length()];
        return lps(s,0,s.length()-1,dp);
    }
}