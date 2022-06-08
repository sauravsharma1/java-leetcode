class Solution {
    public int removePalindromeSub(String s) {
        
        if(s.length()==0){
            return 0;
        }
        else if(checkp(s)){
            return 1;
        }
        
        else{
            return 2;
        }
        
    }
    
    private boolean checkp(String s){
        
        int st=0;
        int e=s.length()-1;
        
        while(st<e){
            if(s.charAt(st)==s.charAt(e)){
                st++;
                e--;
            }
            else{
                return false;
            }
        }
        return true;
    }
    
}