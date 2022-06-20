class Solution {
    public boolean isMatch(String s, String p) {
        
        int n=p.length();
        int m=s.length();
        
        Boolean[][] dp=new Boolean[n][m];
        
        // for(int[] arr: dp){
        //     Arrays.fill(arr,-1);
        // }
        
        return func(n-1,m-1,p,s,dp);
        
    }
    
    private boolean func(int i,int j,String pattern,String text,Boolean[][] dp){
        
        if(i<0&&j<0){
            return true;
        }
        
        if(i<0&&j>=0){
            return false;
        }
        
        if(j<0&&i>=0){
            for(int ind=0;ind<=i;ind++){
                if(pattern.charAt(ind)!='*'){
                    return false;
                }
            }
            return true;
        }
        
        if(dp[i][j]!=null){
            return dp[i][j];
        }
        
        if(pattern.charAt(i)==text.charAt(j)||pattern.charAt(i)=='?'){
            return dp[i][j]=func(i-1,j-1,pattern,text,dp);
        }
        
        if(pattern.charAt(i)=='*'){
            return dp[i][j]=func(i-1,j,pattern,text,dp)||func(i,j-1,pattern,text,dp);
        }
        
        return dp[i][j]=false;
        
    }
    
    
    
}