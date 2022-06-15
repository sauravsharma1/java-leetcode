class Solution {
     HashMap<String,Integer> map=new HashMap<>();
     HashMap<String,Integer> memo=new HashMap<>();
    public int longestStrChain(String[] words) {
       
        
        int res=Integer.MIN_VALUE;
        
        for(String word:words){
            map.put(word,1);
        }
        
        for(String word:words){
            res=Math.max(res,1+dfs(word));
        }
        
        return res;
        
    }
    
    public int dfs(String word){
        
        if(word.length()==0){
            return 0;
        }
        
        if(memo.containsKey(word)){
            return memo.get(word);
        }
        int max=0;
        
        for(int i=0;i<word.length();i++){
            StringBuilder tmp=new StringBuilder(word);
            tmp.deleteCharAt(i);
            int res=0;
            if(map.containsKey(tmp.toString())){
                res+=1+dfs(tmp.toString());
            }
            max=Math.max(res,max);
        }
        
        memo.put(word,max);
           return max;
    }
    
 
    
}