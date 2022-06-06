class Solution {
    public int minDistance(String word1, String word2) {
        int[][] memo=new int[word1.length()+1][word2.length()+1];
        int ans=rec(word1,word2,memo);
        return ans;
    }
    
    private int rec(String s,String t,int[][] memo){
        
        int i=s.length(),j=t.length();
        
        
        
        if(s.length()==0){
            return t.length();
        }
        
        if(t.length()==0){
            return s.length();
        }
        
        if(memo[i][j]!=0){
            return memo[i][j];
        }
        
        if(s.charAt(0)==t.charAt(0)){
            return memo[i][j]=rec(s.substring(1),t.substring(1),memo);
        }
        
        else{
            int op1=rec(s.substring(1),t.substring(1),memo);
            int op2=rec(s,t.substring(1),memo);
            int op3=rec(s.substring(1),t,memo);
                
            return memo[i][j]=1+Math.min(op1,Math.min(op2,op3));
        }
        
    }
    
}