class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        
        HashMap<String,Boolean> map=new HashMap<>();
        
        return cancreate(map,s,wordDict);
        
    }
    
    private boolean cancreate(HashMap<String,Boolean> map,String target,List<String> words){
        
        
        if(map.containsKey(target)){
            return map.get(target);
        }
        
        if(target==""){
            return true;
        }
        
        for(String word:words){
            
            if(target.startsWith(word)){
                if(cancreate(map,target.substring(word.length()),words)){
                    map.put(word,true);
                    return true;
                }
            }
            
        }
        
        map.put(target,false);
        
        return false;
        
    }
    
}