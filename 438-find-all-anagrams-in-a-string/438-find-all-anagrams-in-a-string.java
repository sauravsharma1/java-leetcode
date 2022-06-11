class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res=new ArrayList<Integer>();
        
        if(p.length()>s.length()) return res;
        
        int n=s.length(),m=p.length();
        
        int[] count=frequency(p);
        
        int[] currc=frequency(s.substring(0,m));
        
        if(same(count,currc)){
            res.add(0);
        }
        
        int i;
        
        for( i=m;i<n;i++){
            
            currc[s.charAt(i-m)-'a']--;
                
            currc[s.charAt(i)-'a']++;
            
            if(same(count,currc)){
                res.add(i-m+1);
            }
            
        }
        
        return res;
        
    }
    
    private boolean same(int[] arr1,int[] arr2){
        
        for(int i=0;i<26;i++){
            if(arr1[i]!=arr2[i]){
                return false;
            }
        }
        
        return true;
        
    }
    
    private int[] frequency(String s){
        int[] count=new int[26];
        for(int i=0;i<s.length();i++){
            count[s.charAt(i)-'a']++;
        }
        
        return count;
    }
    
    
    
    
}