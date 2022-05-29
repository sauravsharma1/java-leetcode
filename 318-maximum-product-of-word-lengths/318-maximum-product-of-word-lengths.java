class Solution {
    public int maxProduct(String[] words) {
        
        int len=words.length;
        
        int[] state=new int[len];
        
        for(int i=0;i<len;i++){
            state[i]=getstate(words[i]);
        }
        
        int maxp=0;
        
        for(int i=0;i<len;i++){
            
            for(int j=i+1;j<len;j++){
                
                if((state[i]&state[j])==0){
                    if(words[i].length()*words[j].length()>maxp){
                        maxp=words[i].length()*words[j].length();
                    }
                }
                
                
                
            }
            
        }
        
        return maxp;
        
    }
    
    private int getstate(String word){
        
        int state=0;
        
        for(char c:word.toCharArray()){
            int index=c-'a';
            state|=(1<<index);
        }
        return state;
    }
    
}