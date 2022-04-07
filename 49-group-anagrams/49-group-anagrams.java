class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs==null||strs.length==0)
            return new ArrayList<>();
        
        Map<String,List<String>> map=new HashMap<>();
        
        for(String s:strs){
            
            String key=buildkey(s);
            
            List<String> list=map.getOrDefault(key,new ArrayList<>());
            
            list.add(s);
            
            map.put(key,list);
            
        }
        
        return new ArrayList<>(map.values());
    }
        
        private String buildkey(String s){
            
            char[] keychar=new char[26];
            
            for(char c:s.toCharArray()){
                keychar[c-'a']++;
            }
            return new String(keychar);
        }
        
    }